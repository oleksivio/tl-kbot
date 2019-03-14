package io.github.oleksivio.telegram.bot.core.controller.handler.check.impl

import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator
import io.github.oleksivio.telegram.bot.core.controller.handler.unpack.UnpackerFunction
import java.util.*

class UnionExtractValidatorList<ELEM> : Validator<List<ELEM>> {

    private val validatorCollection = ArrayList<Validator<ELEM>>()

    fun <OUT> add(unpacker: UnpackerFunction<ELEM, OUT>, validator: Validator<OUT>) {
        validatorCollection.add(ExtractValidator(unpacker, validator))
    }

    override fun check(argument: List<ELEM>): Boolean {
        return argument
                .any { elem -> validatorCollection.all { it.check(elem) } }

    }

}
