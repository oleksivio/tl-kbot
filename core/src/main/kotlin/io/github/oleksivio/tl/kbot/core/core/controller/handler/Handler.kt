package io.github.oleksivio.tl.kbot.core.core.controller.handler

import io.github.oleksivio.tl.kbot.server.api.objects.Update
import io.github.oleksivio.tl.kbot.core.model.result.HandlerResult
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.Validator
import io.github.oleksivio.tl.kbot.core.core.controller.handler.invoke.Invoker
import io.github.oleksivio.tl.kbot.core.core.controller.handler.unpack.UnpackerFunction
import io.github.oleksivio.tl.kbot.server.api.model.ITelegram

class Handler<ARG : ITelegram>(private val methodInvoker: Invoker<ARG>,
                               private val updateValidator: Validator<Update>,
                               private val updateUnpackerFunction: UnpackerFunction<Update, ARG>
) {

    fun run(update: Update): HandlerResult {
        val unpacked = updateUnpackerFunction(update) ?: return HandlerResult.pass()
        return methodInvoker.run(unpacked)
    }

    fun hasSubscription(update: Update): Boolean {
        return updateValidator.invoke(update)
    }

}
