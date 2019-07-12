package io.github.oleksivio.tl.kbot.core.core.controller.handler.check.impl

import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.Validator

class FloatValidator(
    private val lessThan: Float,
    private val lessOrEqual: Float,
    private val moreThan: Float,
    private val moreOrEqual: Float,
    private val equal: Float
) :
    Validator<Float> {

    override fun invoke(checkedValue: Float): Boolean {
        return if (!java.lang.Float.isNaN(equal)
            && java.lang.Double.compare(checkedValue.toDouble(), equal.toDouble()) != 0
        ) {
            false
        } else checkedValue < lessThan
                && checkedValue <= lessOrEqual
                && checkedValue > moreThan
                && checkedValue >= moreOrEqual
    }
}
