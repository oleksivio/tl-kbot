package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.telegram

import io.github.oleksivio.telegram.bot.api.annotations.filter.composite.UserFilter
import io.github.oleksivio.telegram.bot.api.model.objects.std.User
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator
import org.springframework.stereotype.Component

@Component
class UserFilterParser : FilterParser<UserFilter, User> {

    override val parserAnnotationClass = UserFilter::class

    override fun createChecker(annotation: UserFilter, finder: Finder): Validator<User> {
        val unionExtractValidator = UnionExtractValidator<User>()

        annotation.validator
                .map { validatorName -> finder.find(validatorName, User::class) }
                .forEach { validator -> unionExtractValidator.add({ it }, validator) }

        val firstName = annotation.firstName
        if (firstName.status.isActive) {
            unionExtractValidator.add({ it.firstName }, finder.find(firstName))
        }
        val lastName = annotation.lastName
        if (lastName.status.isActive) {
            unionExtractValidator.add({ it.lastName }, finder.find(lastName))
        }
        val username = annotation.username
        if (username.status.isActive) {
            unionExtractValidator.add({ it.username }, finder.find(username))
        }
        val languageCode = annotation.languageCode
        if (languageCode.status.isActive) {
            unionExtractValidator.add({ it.languageCode }, finder.find(languageCode))
        }
        val bot = annotation.bot
        if (bot.status.isActive) {
            unionExtractValidator.add({ it.bot }, finder.find(bot))
        }

        return unionExtractValidator
    }

}

