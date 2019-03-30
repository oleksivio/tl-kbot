package io.github.oleksivio.telegram.bot.core.controller.handler

import io.github.oleksivio.telegram.bot.api.model.objects.Update
import io.github.oleksivio.telegram.bot.api.model.result.HandlerResult
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator
import io.github.oleksivio.telegram.bot.core.controller.handler.invoke.Invoker
import io.github.oleksivio.telegram.bot.core.controller.handler.unpack.UnpackerFunction
import io.github.oleksivio.telegram.bot.core.model.ITelegram

class Handler<ARG : ITelegram>(private val methodInvoker: Invoker<ARG>,
                               private val updateValidator: Validator<Update>,
                               private val updateUnpackerFunction: UnpackerFunction<Update, ARG>) {

    fun run(update: Update): HandlerResult {
        val unpacked = updateUnpackerFunction(update) ?: return HandlerResult.pass()
        return methodInvoker.run(unpacked)
    }

    fun hasSubscription(update: Update): Boolean {
        return updateValidator.invoke(update)
    }

}
