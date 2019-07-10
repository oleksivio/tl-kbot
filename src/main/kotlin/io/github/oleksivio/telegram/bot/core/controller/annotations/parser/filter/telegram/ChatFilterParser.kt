package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.telegram

import io.github.oleksivio.telegram.bot.api.annotations.filter.composite.ChatFilter
import io.github.oleksivio.tl.kbot.server.api.objects.std.Chat
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.TypeNameValidator
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator
import org.springframework.stereotype.Component

@Component
class ChatFilterParser : FilterParser<ChatFilter, Chat> {

    override val parserAnnotationClass = ChatFilter::class

    override fun createChecker(annotation: ChatFilter,
                               finder: Finder): Validator<Chat> {
        val unionExtractValidator = UnionExtractValidator<Chat>()

        annotation.validator
                .map { validatorName -> finder.find(validatorName, Chat::class) }
                .forEach { validator -> unionExtractValidator.add({ it }, validator) }

        val type = annotation.type
        if (type.isChosen) {
            unionExtractValidator.add({ it.type }, TypeNameValidator(type))
        }

        val title = annotation.title
        if (title.status.isActive) {
            unionExtractValidator.add({ it.title }, finder.find(title))
        }
        val username = annotation.username
        if (username.status.isActive) {
            unionExtractValidator.add({ it.username }, finder.find(username))
        }
        val firstName = annotation.firstName
        if (firstName.status.isActive) {
            unionExtractValidator.add({ it.firstName }, finder.find(firstName))
        }
        val lastName = annotation.lastName
        if (lastName.status.isActive) {
            unionExtractValidator.add({ it.lastName }, finder.find(lastName))
        }
        val allMembersAreAdministrators = annotation.allMembersAreAdministrators
        if (allMembersAreAdministrators.status.isActive) {
            unionExtractValidator.add({ it.allMembersAreAdmin }, finder.find(allMembersAreAdministrators))
        }

        return unionExtractValidator
    }

}

