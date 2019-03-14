package io.github.oleksivio.telegram.bot.core.controller.annotations.composer

import io.github.oleksivio.telegram.bot.api.annotations.behavior.Session
import io.github.oleksivio.telegram.bot.api.model.annotation.SessionType
import io.github.oleksivio.telegram.bot.core.controller.handler.Handler
import io.github.oleksivio.telegram.bot.core.controller.processor.session.*
import io.github.oleksivio.telegram.bot.core.model.ITelegram
import org.springframework.stereotype.Controller
import java.util.*
import kotlin.reflect.KClass
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.functions

@Controller
class SessionInitializer(private val handlerCreator: HandlerCreator, private val sessionProcessor: SessionProcessor) {

    fun init(objClz: KClass<*>, obj: Any) {
        var initialHandler: Handler<*>? = null
        var cancelHandler: Handler<*>? = null

        val handlerMap = HashMap<Int, MutableList<Handler<*>>>()
        val errorMap = HashMap<Int, Handler<*>>()

        val sessionType = objClz.findAnnotation<Session>()?.value ?: return


        for (func in objClz.functions) {

            val handler = handlerCreator.create<ITelegram>(obj, func) ?: continue


            when {
                func.findAnnotation<Session.Initial>() != null -> initialHandler = handler
                func.findAnnotation<Session.Cancel>() != null -> cancelHandler = handler
                func.findAnnotation<Session.Order>() != null -> {
                    //todo fixme two findAnnotation call

                    val order = func.findAnnotation<Session.Order>()?.value
                    order?.let {
                        val handlers = handlerMap.computeIfAbsent(it) { mutableListOf() }
                        handlers.add(handler)
                    }

                }
                func.findAnnotation<Session.Order>() != null -> {
                    val errorOrder = func.findAnnotation<Session.Order>()?.value

                    check(errorMap, errorOrder!!)

                    errorMap[errorOrder] = handler
                }
            }

        }

        check(initialHandler, cancelHandler, handlerMap, errorMap)

        val orderManager = OrderManager(handlerMap, errorMap)

        val sessionManager = createSession(sessionType,
                orderManager,
                initialHandler!!,
                cancelHandler!!)
        sessionProcessor.add(sessionManager)
    }

    companion object {

        private fun check(errorMap: Map<Int, Handler<*>>, errorOrder: Int) {
            if (errorMap.containsKey(errorOrder)) {
                throw IllegalArgumentException("Can't be more than one error receivers")
            }
        }

        private fun createSession(type: SessionType,
                                  orderManager: OrderManager,
                                  initialHandler: Handler<*>,
                                  cancelHandler: Handler<*>): SessionManager {
            return when (type) {
                SessionType.USER -> {
                    UserSession(orderManager, initialHandler, cancelHandler)

                }
                SessionType.CHAT -> {
                    ChatSession(orderManager, initialHandler, cancelHandler)
                }
            }
        }

        @Throws(IllegalArgumentException::class)
        private fun check(initialHandler: Handler<*>?,
                          cancelHandler: Handler<*>?,
                          orderMap: Map<Int, List<Handler<*>>>?,
                          errorMap: Map<Int, Handler<*>>) {
            if (orderMap == null || orderMap.isEmpty()) {
                throw IllegalArgumentException("Invalid session state. " +
                        "Can't be less than one" +
                        " Session Order method's")
            }

            for (index in errorMap.keys) {
                if (!orderMap.keys.contains(index)) {
                    throw IllegalArgumentException("Invalid session error state. " +
                            "Can't be Session Error and Session Order" +
                            " must have same index")
                }
            }

            if (initialHandler == null) {
                throw IllegalArgumentException("Invalid session state. " +
                        "Can't be less than one" +
                        " Session Initial method's")
            }

            if (cancelHandler == null) {
                throw IllegalArgumentException("Invalid session state. " +
                        "Can't be less than one" +
                        " Session Cancel method's")
            }
        }
    }
}
