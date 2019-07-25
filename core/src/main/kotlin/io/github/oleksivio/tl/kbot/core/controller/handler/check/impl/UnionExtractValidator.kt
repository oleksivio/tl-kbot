package io.github.oleksivio.tl.kbot.core.controller.handler.check.impl

import io.github.oleksivio.tl.kbot.core.controller.handler.check.Validator
import io.github.oleksivio.tl.kbot.core.controller.handler.unpack.UnpackerFunction
import java.util.ArrayList

class UnionExtractValidator<T> : Validator<T> {
    override fun invoke(checkedValue: T): Boolean {
        return validatorCollection.stream().allMatch { checker -> checker.invoke(checkedValue) }
    }

    private val validatorCollection = ArrayList<Validator<T>>()

    fun <OUT> add(unpacker: UnpackerFunction<T, OUT>, validator: Validator<OUT>) {
        validatorCollection.add(
            ExtractValidator(
                unpacker,
                validator
            )
        )
    }
}
