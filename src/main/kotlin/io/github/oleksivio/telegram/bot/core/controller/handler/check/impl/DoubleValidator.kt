package io.github.oleksivio.telegram.bot.core.controller.handler.check.impl

import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator

class DoubleValidator(private val lessThan: Double,
                      private val lessOrEqual: Double,
                      private val moreThan: Double,
                      private val moreOrEqual: Double,
                      private val equal: Double) : Validator<Double> {
    override fun invoke(checkedValue: Double): Boolean {
        return if (!java.lang.Double.isNaN(equal) && java.lang.Double.compare(checkedValue, equal) != 0) {
            false
        } else checkedValue < lessThan
                && checkedValue <= lessOrEqual
                && checkedValue > moreThan
                && checkedValue >= moreOrEqual
    }


}
