package io.github.oleksivio.tl.kbot.core.core.controller.handler.invoke

import io.github.oleksivio.tl.kbot.core.model.result.HandlerResult
import io.github.oleksivio.tl.kbot.server.api.model.ITelegram

import java.lang.reflect.InvocationTargetException
import java.lang.reflect.Method
import kotlin.reflect.KFunction

class ResultInvoker<ARG : ITelegram>(classInstance: Any,
                                                                                  func: KFunction<*>) : Invoker<ARG>(classInstance, func) {

    @Throws(InvocationTargetException::class, IllegalAccessException::class)
    override fun invokeFunction(classInstance: Any,
                                method: Method,
                                argument: ARG): HandlerResult {
        return method.invoke(classInstance, argument) as HandlerResult
    }
}
