package io.github.oleksivio.tl.kbot.core.core.controller.annotations.parser.filter.telegram

import io.github.oleksivio.tl.kbot.core.annotations.filter.composite.EncryptedPassportElementFilter
import io.github.oleksivio.tl.kbot.core.core.controller.annotations.parser.filter.FilterParser
import io.github.oleksivio.tl.kbot.core.core.controller.annotations.parser.finder.Finder
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.Validator
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.impl.TypeNameValidator
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.impl.UnionExtractValidator
import io.github.oleksivio.tl.kbot.server.api.objects.passport.EncryptedPassportElement

class EncryptedPassportElementFilterParser :
    FilterParser<EncryptedPassportElementFilter, EncryptedPassportElement> {

    override val parserAnnotationClass = EncryptedPassportElementFilter::class

    override fun createChecker(
        annotation: EncryptedPassportElementFilter,
        finder: Finder
    ): Validator<EncryptedPassportElement> {
        val unionExtractValidator =
            UnionExtractValidator<EncryptedPassportElement>()

        val type = annotation.type
        if (type.isChosen) {
            unionExtractValidator.add(
                { it.type },
                TypeNameValidator(type)
            )
        }

        annotation.validator
            .map { validatorName -> finder.find(validatorName, EncryptedPassportElement::class) }
            .forEach { validator -> unionExtractValidator.add({ it }, validator) }

        val data = annotation.data
        if (data.status.isActive) {
            unionExtractValidator.add({ it.data }, finder.find(data))
        }
        val phoneNumber = annotation.phoneNumber
        if (phoneNumber.status.isActive) {
            unionExtractValidator.add({ it.phoneNumber }, finder.find(phoneNumber))
        }
        val email = annotation.email
        if (email.status.isActive) {
            unionExtractValidator.add({ it.email }, finder.find(email))
        }
        val fileArray = annotation.fileArray
        if (fileArray.status.isActive) {
            unionExtractValidator.add({ it.files }, finder.find(fileArray))
        }
        val frontSide = annotation.frontSide
        if (frontSide.status.isActive) {
            unionExtractValidator.add({ it.frontSide }, finder.find(frontSide))
        }
        val reverseSide = annotation.reverseSide
        if (reverseSide.status.isActive) {
            unionExtractValidator.add({ it.reverseSide }, finder.find(reverseSide))
        }
        val selfie = annotation.selfie
        if (selfie.status.isActive) {
            unionExtractValidator.add({ it.selfie }, finder.find(selfie))
        }

        return unionExtractValidator
    }
}

