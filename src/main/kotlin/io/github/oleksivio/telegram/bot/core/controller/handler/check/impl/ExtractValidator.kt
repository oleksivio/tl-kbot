package io.github.oleksivio.telegram.bot.core.controller.handler.check.impl

import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator
import io.github.oleksivio.telegram.bot.core.controller.handler.unpack.UnpackerFunction

class ExtractValidator<IN, OUT>(private val unpackerFunctionFunc: UnpackerFunction<IN, OUT>,
                                private val validator: Validator<OUT>) : Validator<IN> {
    override fun invoke(checkedValue: IN): Boolean {
        val unpacked = unpackerFunctionFunc(checkedValue) ?: return false
        return validator.invoke(unpacked)
    }

}
