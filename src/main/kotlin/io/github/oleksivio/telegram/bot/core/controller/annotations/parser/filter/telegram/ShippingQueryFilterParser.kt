package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.telegram

import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.ShippingQueryFilter
import io.github.oleksivio.telegram.bot.api.model.objects.payments.ShippingQuery
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator
import org.springframework.stereotype.Component

@Component
class ShippingQueryFilterParser : FilterParser<ShippingQueryFilter, ShippingQuery> {

    override val parserAnnotationClass = ShippingQueryFilter::class

    override fun createChecker(annotation: ShippingQueryFilter, finder: Finder): Validator<ShippingQuery> {
        val unionExtractValidator = UnionExtractValidator<ShippingQuery>()

        annotation.validator
                .map { validatorName -> finder.find(validatorName, ShippingQuery::class) }
                .forEach { validator -> unionExtractValidator.add({ it }, validator) }

        val from = annotation.from
        if (from.status.isActive) {
            unionExtractValidator.add({ it.from }, finder.find(from))
        }
        val invoicePayload = annotation.invoicePayload
        if (invoicePayload.status.isActive) {
            unionExtractValidator.add({ it.invoicePayload }, finder.find(invoicePayload))
        }
        val shippingAddress = annotation.shippingAddress
        if (shippingAddress.status.isActive) {
            unionExtractValidator.add({ it.shippingAddress }, finder.find(shippingAddress))
        }

        return unionExtractValidator
    }

}

