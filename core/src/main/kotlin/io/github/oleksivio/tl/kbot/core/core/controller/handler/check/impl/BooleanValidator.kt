package io.github.oleksivio.tl.kbot.core.core.controller.handler.check.impl

import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.Validator
import io.github.oleksivio.tl.kbot.core.model.annotation.BooleanState

class BooleanValidator(private val booleanState: BooleanState) :
    Validator<Boolean> {

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
