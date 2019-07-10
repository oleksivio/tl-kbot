package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.telegram

import io.github.oleksivio.telegram.bot.api.annotations.filter.composite.EncryptedPassportElementArrayFilter
import io.github.oleksivio.tl.kbot.server.api.objects.passport.EncryptedPassportElement
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.TypeNameValidator
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.UnionExtractValidatorList
import org.springframework.stereotype.Component

@Component
class EncryptedPassportElemArrayFilterParser : FilterParser<EncryptedPassportElementArrayFilter, List<EncryptedPassportElement>> {

    override val parserAnnotationClass = EncryptedPassportElementArrayFilter::class

    override fun createChecker(annotation: EncryptedPassportElementArrayFilter,
                               finder: Finder): Validator<List<EncryptedPassportElement>> {
        val unionExtractValidatorList = UnionExtractValidatorList<EncryptedPassportElement>()

        val type = annotation.type
        if (type.isChosen) {
            unionExtractValidatorList.add({ it.type }, TypeNameValidator(type))
        }

        annotation.validator
                .map { validatorName -> finder.find(validatorName, EncryptedPassportElement::class) }
                .forEach { validator -> unionExtractValidatorList.add({ it }, validator) }

        val data = annotation.data
        if (data.status.isActive) {
            unionExtractValidatorList.add({ it.data }, finder.find(data))
        }
        val phoneNumber = annotation.phoneNumber
        if (phoneNumber.status.isActive) {
            unionExtractValidatorList.add({ it.phoneNumber }, finder.find(phoneNumber))
        }
        val email = annotation.email
        if (email.status.isActive) {
            unionExtractValidatorList.add({ it.email }, finder.find(email))
        }
        val fileArray = annotation.fileArray
        if (fileArray.status.isActive) {
            unionExtractValidatorList.add({ it.files }, finder.find(fileArray))
        }
        val frontSide = annotation.frontSide
        if (frontSide.status.isActive) {
            unionExtractValidatorList.add({ it.frontSide }, finder.find(frontSide))
        }
        val reverseSide = annotation.reverseSide
        if (reverseSide.status.isActive) {
            unionExtractValidatorList.add({ it.reverseSide }, finder.find(reverseSide))
        }
        val selfie = annotation.selfie
        if (selfie.status.isActive) {
            unionExtractValidatorList.add({ it.selfie }, finder.find(selfie))
        }

        return unionExtractValidatorList
    }
}
