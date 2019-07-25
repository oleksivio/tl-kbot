package io.github.oleksivio.tl.kbot.core.controller.handler.check.impl

import io.github.oleksivio.tl.kbot.core.controller.handler.check.Validator
import io.github.oleksivio.tl.kbot.core.controller.handler.unpack.UnpackerFunction
import java.util.ArrayList

class UnionExtractValidatorList<ELEM> :
    Validator<List<ELEM>> {

    override fun invoke(checkedValue: List<ELEM>): Boolean {
        return checkedValue
            .any { elem -> validatorCollection.all { it.invoke(elem) } }
    }

    private val validatorCollection = ArrayList<Validator<ELEM>>()

    fun <OUT> add(unpacker: UnpackerFunction<ELEM, OUT>, validator: Validator<OUT>) {
        validatorCollection.add(
            ExtractValidator(
                unpacker,
                validator
            )
        )
    }
}
