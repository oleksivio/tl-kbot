package io.github.oleksivio.telegram.bot.core.controller.handler.check.impl

import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator

class FloatValidator(private val lessThan: Float,
                     private val lessOrEqual: Float,
                     private val moreThan: Float,
                     private val moreOrEqual: Float,
                     private val equal: Float) : Validator<Float> {

    override fun check(argument: Float): Boolean {
        return if (!java.lang.Float.isNaN(equal) && java.lang.Double.compare(argument.toDouble(), equal.toDouble()) != 0) {
            false
        } else argument < lessThan
                && argument <= lessOrEqual
                && argument > moreThan
                && argument >= moreOrEqual

    }
}
