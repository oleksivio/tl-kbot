package io.github.oleksivio.tl.kbot.core.core.controller.annotations.parser.filter.telegram

import io.github.oleksivio.tl.kbot.core.annotations.filter.composite.UserArrayFilter
import io.github.oleksivio.tl.kbot.server.api.objects.std.User
import io.github.oleksivio.tl.kbot.core.core.controller.annotations.parser.filter.FilterParser
import io.github.oleksivio.tl.kbot.core.core.controller.annotations.parser.finder.Finder
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.Validator
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.impl.UnionExtractValidatorList
 

  
class UserArrayFilterParser :
    FilterParser<UserArrayFilter, List<User>> {

    override val parserAnnotationClass = UserArrayFilter::class

    override fun createChecker(annotation: UserArrayFilter, finder: Finder): Validator<List<User>> {

        val unionExtractValidatorList =
            UnionExtractValidatorList<User>()

        annotation.validator
                .map { validatorName -> finder.find(validatorName, User::class) }
                .forEach { validator -> unionExtractValidatorList.add({ it }, validator) }

        val firstName = annotation.firstName
        if (firstName.status.isActive) {
            unionExtractValidatorList.add({ it.firstName }, finder.find(firstName))
        }
        val lastName = annotation.lastName
        if (lastName.status.isActive) {
            unionExtractValidatorList.add({ it.lastName }, finder.find(lastName))
        }
        val username = annotation.username
        if (username.status.isActive) {
            unionExtractValidatorList.add({ it.username }, finder.find(username))
        }
        val languageCode = annotation.languageCode
        if (languageCode.status.isActive) {
            unionExtractValidatorList.add({ it.languageCode }, finder.find(languageCode))
        }
        val bot = annotation.bot
        if (bot.status.isActive) {
            unionExtractValidatorList.add({ it.bot }, finder.find(bot))
        }

        return unionExtractValidatorList
    }
}
