package io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.telegram

import io.github.oleksivio.tl.kbot.core.annotations.filter.composite.MessageEntityFilter
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.FilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.finder.Finder
import io.github.oleksivio.tl.kbot.core.controller.handler.check.Validator
import io.github.oleksivio.tl.kbot.core.controller.handler.check.impl.TypeNameValidator
import io.github.oleksivio.tl.kbot.core.controller.handler.check.impl.UnionExtractValidator
import io.github.oleksivio.tl.kbot.server.api.objects.std.MessageEntity

class MessageEntityFilterParser :
    FilterParser<MessageEntityFilter, MessageEntity> {

    override val parserAnnotationClass = MessageEntityFilter::class

    override fun createChecker(annotation: MessageEntityFilter, finder: Finder): Validator<MessageEntity> {
        val unionExtractValidator =
            UnionExtractValidator<MessageEntity>()

        annotation.validator
            .map { validatorName -> finder.find(validatorName, MessageEntity::class) }
            .forEach { validator -> unionExtractValidator.add({ it }, validator) }

        val type = annotation.type
        if (type.isChosen) {
            unionExtractValidator.add(
                { it.type },
                TypeNameValidator(type)
            )
        }
        val length = annotation.length
        if (length.status.isActive) {
            unionExtractValidator.add({ it.length }, finder.find(length))
        }
        val url = annotation.url
        if (url.status.isActive) {
            unionExtractValidator.add({ it.url }, finder.find(url))
        }
        val user = annotation.user
        if (user.status.isActive) {
            unionExtractValidator.add({ it.user }, finder.find(user))
        }

        return unionExtractValidator
    }
}

