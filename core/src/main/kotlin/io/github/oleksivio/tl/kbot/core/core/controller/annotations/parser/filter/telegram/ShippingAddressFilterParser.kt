package io.github.oleksivio.tl.kbot.core.core.controller.annotations.parser.filter.telegram

import io.github.oleksivio.tl.kbot.core.annotations.filter.composite.ShippingAddressFilter
import io.github.oleksivio.tl.kbot.core.core.controller.annotations.parser.filter.FilterParser
import io.github.oleksivio.tl.kbot.core.core.controller.annotations.parser.finder.Finder
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.Validator
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.impl.UnionExtractValidator
import io.github.oleksivio.tl.kbot.server.api.objects.payments.ShippingAddress

class ShippingAddressFilterParser :
    FilterParser<ShippingAddressFilter, ShippingAddress> {

    override val parserAnnotationClass = ShippingAddressFilter::class

    override fun createChecker(annotation: ShippingAddressFilter, finder: Finder): Validator<ShippingAddress> {
        val unionExtractValidator =
            UnionExtractValidator<ShippingAddress>()

        annotation.validator
            .map { validatorName -> finder.find(validatorName, ShippingAddress::class) }
            .forEach { validator -> unionExtractValidator.add({ it }, validator) }

        val countryCode = annotation.countryCode
        if (countryCode.status.isActive) {
            unionExtractValidator.add({ it.countryCode }, finder.find(countryCode))
        }
        val state = annotation.state
        if (state.status.isActive) {
            unionExtractValidator.add({ it.state }, finder.find(state))
        }
        val city = annotation.city
        if (city.status.isActive) {
            unionExtractValidator.add({ it.city }, finder.find(city))
        }
        val streetLine1 = annotation.streetLine1
        if (streetLine1.status.isActive) {
            unionExtractValidator.add({ it.streetLine1 }, finder.find(streetLine1))
        }
        val streetLine2 = annotation.streetLine2
        if (streetLine2.status.isActive) {
            unionExtractValidator.add({ it.streetLine2 }, finder.find(streetLine2))
        }
        val postCode = annotation.postCode
        if (postCode.status.isActive) {
            unionExtractValidator.add({ it.postCode }, finder.find(postCode))
        }

        return unionExtractValidator
    }
}

