package io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.telegram

import io.github.oleksivio.tl.kbot.core.annotations.filter.composite.ContactFilter
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.FilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.finder.Finder
import io.github.oleksivio.tl.kbot.core.controller.handler.check.Validator
import io.github.oleksivio.tl.kbot.core.controller.handler.check.impl.UnionExtractValidator
import io.github.oleksivio.tl.kbot.server.api.objects.std.Contact

class ContactFilterParser :
    FilterParser<ContactFilter, Contact> {

    override val parserAnnotationClass = ContactFilter::class

    override fun createChecker(annotation: ContactFilter, finder: Finder): Validator<Contact> {
        val unionExtractValidator =
            UnionExtractValidator<Contact>()

        annotation.validator
            .map { validatorName -> finder.find(validatorName, Contact::class) }
            .forEach { validator -> unionExtractValidator.add({ it }, validator) }

        val phoneNumber = annotation.phoneNumber
        if (phoneNumber.status.isActive) {
            unionExtractValidator.add({ it.phoneNumber }, finder.find(phoneNumber))
        }
        val firstName = annotation.firstName
        if (firstName.status.isActive) {
            unionExtractValidator.add({ it.firstName }, finder.find(firstName))
        }
        val lastName = annotation.lastName
        if (lastName.status.isActive) {
            unionExtractValidator.add({ it.lastName }, finder.find(lastName))
        }
        val vCard = annotation.vCard
        if (vCard.status.isActive) {
            unionExtractValidator.add({ it.vCard }, finder.find(vCard))
        }
        val userId = annotation.userId
        if (userId.status.isActive) {
            unionExtractValidator.add({ it.userId }, finder.find(userId))
        }

        return unionExtractValidator
    }
}

