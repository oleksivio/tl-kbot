package io.github.oleksivio.telegram.bot.core.controller.handler.check.impl

import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator
import io.github.oleksivio.telegram.bot.core.model.type.NamedType

class TypeNameValidator(type: NamedType) : Validator<String> {

    private val type: String = type.stringName

    override fun check(argument: String): Boolean {
        return type == argument
    }
}
