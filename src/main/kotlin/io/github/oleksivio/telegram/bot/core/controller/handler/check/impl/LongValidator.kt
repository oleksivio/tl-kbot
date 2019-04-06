package io.github.oleksivio.telegram.bot.core.controller.handler.check.impl

import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator

class LongValidator(private val lessThan: Long, private val lessOrEqual: Long,
                    private val moreThan: Long, private val moreOrEqual: Long) : Validator<Long> {
    override fun invoke(checkedValue: Long): Boolean {
        return checkedValue < lessThan
                && checkedValue <= lessOrEqual
                && checkedValue > moreThan
                && checkedValue >= moreOrEqual
    }

}
