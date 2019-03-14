package io.github.oleksivio.telegram.bot.core.controller.handler.invoke

import io.github.oleksivio.telegram.bot.api.model.result.HandlerResult
import io.github.oleksivio.telegram.bot.core.model.ITelegram
import org.slf4j.LoggerFactory
import java.lang.reflect.InvocationTargetException
import java.lang.reflect.Method
import kotlin.reflect.KFunction

abstract class Invoker<ARG : ITelegram> internal constructor(private val classInstance: Any,
                                                             private val func: KFunction<*>) {

    fun run(argument: ARG): HandlerResult {

        try {
            return invokeFunction(classInstance, classInstance.javaClass.getMethod(func.name), argument)
        } catch (e: IllegalAccessException) {
            val invalidBehaviorException = IllegalStateException("Can't run method $func")
            LOG.error("", e)
            throw invalidBehaviorException

        } catch (e: InvocationTargetException) {
            val invalidBehaviorException = IllegalStateException("Can't run method $func")
            LOG.error("", e)
            throw invalidBehaviorException
        } catch (ignored: ClassCastException) {
            val invalidBehaviorException = IllegalStateException("Invalid result type of method. "
                    + "HandlerResult or void was expected "
                    + func)
            LOG.error("", invalidBehaviorException)
            throw invalidBehaviorException
        }

    }

    @Throws(InvocationTargetException::class, IllegalAccessException::class)
    protected abstract fun invokeFunction(classInstance: Any,
                                          method: Method,
                                          argument: ARG): HandlerResult

    companion object {
        private val LOG = LoggerFactory.getLogger(Invoker::class.java)
    }

}
