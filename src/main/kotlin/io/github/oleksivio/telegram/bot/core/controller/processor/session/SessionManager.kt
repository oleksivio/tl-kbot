package io.github.oleksivio.telegram.bot.core.controller.processor.session

import io.github.oleksivio.telegram.bot.api.model.objects.Update
import io.github.oleksivio.telegram.bot.api.model.result.HandlerResult
import io.github.oleksivio.telegram.bot.core.controller.handler.Handler

abstract class SessionManager(private val orderManager: OrderManager,
                              private val initialHandler: Handler<*>,
                              private val cancelHandler: Handler<*>) {

    fun init(update: Update): HandlerResult {
        val answerId = getIdOptional(update) ?: return HandlerResult.pass()

        if (initialHandler.hasSubscription(update)) {
            val handlerResult = initialHandler.run(update)
            if (handlerResult.hasSuccess()) {
                orderManager.next(answerId)
            }
            return handlerResult
        }

        return HandlerResult.pass()

    }

    protected abstract fun getIdOptional(update: Update): Long?

    fun receive(update: Update): HandlerResult {

        val id = getIdOptional(update) ?: return HandlerResult.pass()

        if (cancelHandler.hasSubscription(update)) {
            orderManager.reset(id)
            return cancelHandler.run(update)
        }

        val handlerList = orderManager.getOrderHandlerList(id)

        for (handler in handlerList) {
            if (handler.hasSubscription(update)) {
                val handlerResult = handler.run(update)

                if (handlerResult.hasSuccess()) {
                    orderManager.next(id)
                    return handlerResult
                }
                if (handlerResult.hasCancelSession()) {
                    orderManager.reset(id)
                    return handlerResult
                }

                return HandlerResult.error()
            }
        }


        return orderManager.getErrorHandler(id)?.run(update) ?: HandlerResult.pass()
    }

    fun isActive(update: Update): Boolean {
        val id = getIdOptional(update) ?: return false
        return orderManager.isActive(id)
    }

}