package io.github.oleksivio.telegram.bot.core.controller.handler.check.impl

import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator

class IntegerValidator(private val lessThan: Int, private val lessOrEqual: Int,
                       private val moreThan: Int, private val moreOrEqual: Int) : Validator<Int> {

    override fun check(argument: Int): Boolean {
        return argument < lessThan && argument <= lessOrEqual && argument > moreThan && argument >= moreOrEqual
    }

}
