package io.github.oleksivio.telegram.bot.core.controller.handler.check.impl

import io.github.oleksivio.telegram.bot.api.model.annotation.BooleanState
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator

class BooleanValidator(private val booleanState: BooleanState) : Validator<Boolean> {

    override fun invoke(checkedValue: Boolean): Boolean {

        if (booleanState === BooleanState.NON_NULL) {
            return true
        }

        if (booleanState === BooleanState.TRUE) {
            return checkedValue
        }

        if (booleanState === BooleanState.FALSE) {
            return (!checkedValue)
        }

        throw UnsupportedOperationException("Unexpected boolean state")
    }

}
