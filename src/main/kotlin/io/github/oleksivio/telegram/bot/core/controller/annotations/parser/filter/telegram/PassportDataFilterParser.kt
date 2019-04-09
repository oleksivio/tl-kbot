package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.telegram

import io.github.oleksivio.telegram.bot.api.annotations.filter.composite.PassportDataFilter
import io.github.oleksivio.telegram.bot.api.model.objects.passport.PassportData
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator
import org.springframework.stereotype.Component

@Component
class PassportDataFilterParser : FilterParser<PassportDataFilter, PassportData> {

    override val parserAnnotationClass = PassportDataFilter::class

    override fun createChecker(annotation: PassportDataFilter, finder: Finder): Validator<PassportData> {
        val unionExtractValidator = UnionExtractValidator<PassportData>()

        annotation.validator
                .map { validatorName -> finder.find(validatorName, PassportData::class) }
                .forEach { validator -> unionExtractValidator.add({ it }, validator) }

        val encryptedPassportElements = annotation.encryptedPassportElements
        if (encryptedPassportElements.status.isActive) {
            unionExtractValidator.add({ it.encryptedPassportElements }, finder.find(encryptedPassportElements))
        }
        val encryptedCredentials = annotation.encryptedCredentials
        if (encryptedCredentials.status.isActive) {
            unionExtractValidator.add({ it.encryptedCredentials }, finder.find(encryptedCredentials))
        }

        return unionExtractValidator
    }

}

