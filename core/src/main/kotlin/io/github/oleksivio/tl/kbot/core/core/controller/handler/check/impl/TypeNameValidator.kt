package io.github.oleksivio.tl.kbot.core.core.controller.handler.check.impl

import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.Validator
import io.github.oleksivio.tl.kbot.server.api.model.type.NamedType

class TypeNameValidator(type: NamedType) :
    Validator<String> {

    private val type: String = type.typeName

    override fun invoke(checkedValue: String): Boolean {
        return type == checkedValue
    }
}
