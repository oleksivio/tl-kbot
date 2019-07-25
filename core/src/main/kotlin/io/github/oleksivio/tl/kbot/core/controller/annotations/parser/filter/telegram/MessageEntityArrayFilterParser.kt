package io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.telegram

import io.github.oleksivio.tl.kbot.core.annotations.filter.composite.MessageEntityArrayFilter
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.FilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.finder.Finder
import io.github.oleksivio.tl.kbot.core.controller.handler.check.Validator
import io.github.oleksivio.tl.kbot.core.controller.handler.check.impl.TypeNameValidator
import io.github.oleksivio.tl.kbot.core.controller.handler.check.impl.UnionExtractValidatorList
import io.github.oleksivio.tl.kbot.server.api.objects.std.MessageEntity

class MessageEntityArrayFilterParser :
    FilterParser<MessageEntityArrayFilter, List<MessageEntity>> {

    override val parserAnnotationClass = MessageEntityArrayFilter::class

    override fun createChecker(annotation: MessageEntityArrayFilter, finder: Finder): Validator<List<MessageEntity>> {
        val unionExtractValidatorList =
            UnionExtractValidatorList<MessageEntity>()

        annotation.validator
            .map { validatorName -> finder.find(validatorName, MessageEntity::class) }
            .forEach { validator -> unionExtractValidatorList.add({ it }, validator) }

        val type = annotation.type
        if (type.isChosen) {
            unionExtractValidatorList.add(
                { it.type },
                TypeNameValidator(type)
            )
        }
        val length = annotation.length
        if (length.status.isActive) {
            unionExtractValidatorList.add({ it.length }, finder.find(length))
        }
        val url = annotation.url
        if (url.status.isActive) {
            unionExtractValidatorList.add({ it.url }, finder.find(url))
        }
        val user = annotation.user
        if (user.status.isActive) {
            unionExtractValidatorList.add({ it.user }, finder.find(user))
        }

        return unionExtractValidatorList
    }
}
