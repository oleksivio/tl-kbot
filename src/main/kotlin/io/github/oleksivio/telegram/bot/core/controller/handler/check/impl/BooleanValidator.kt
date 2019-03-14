package io.github.oleksivio.telegram.bot.core.controller.handler.check.impl

import io.github.oleksivio.telegram.bot.api.model.annotation.BooleanState
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator

class BooleanValidator(private val booleanState: BooleanState) : Validator<Boolean> {

    override fun check(argument: Boolean): Boolean {

        if (booleanState === BooleanState.NON_NULL) {
            return true
        }

        if (booleanState === BooleanState.TRUE) {
            return argument
        }

        if (booleanState === BooleanState.FALSE) {
            return (!argument)
        }

        throw UnsupportedOperationException("Unexpected boolean state")
    }

}
