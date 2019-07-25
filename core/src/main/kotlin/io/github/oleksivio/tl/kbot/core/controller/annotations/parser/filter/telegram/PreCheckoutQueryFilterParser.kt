package io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.telegram

import io.github.oleksivio.tl.kbot.core.annotations.filter.composite.PreCheckoutQueryFilter
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.FilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.finder.Finder
import io.github.oleksivio.tl.kbot.core.controller.handler.check.Validator
import io.github.oleksivio.tl.kbot.core.controller.handler.check.impl.UnionExtractValidator
import io.github.oleksivio.tl.kbot.server.api.objects.payments.PreCheckoutQuery

class PreCheckoutQueryFilterParser :
    FilterParser<PreCheckoutQueryFilter, PreCheckoutQuery> {

    override val parserAnnotationClass = PreCheckoutQueryFilter::class

    override fun createChecker(annotation: PreCheckoutQueryFilter, finder: Finder): Validator<PreCheckoutQuery> {
        val unionExtractValidator =
            UnionExtractValidator<PreCheckoutQuery>()

        annotation.validator
            .map { validatorName -> finder.find(validatorName, PreCheckoutQuery::class) }
            .forEach { validator -> unionExtractValidator.add({ it }, validator) }

        val from = annotation.from
        if (from.status.isActive) {
            unionExtractValidator.add({ it.from }, finder.find(from))
        }
        val currency = annotation.currency
        if (currency.status.isActive) {
            unionExtractValidator.add({ it.currency }, finder.find(currency))
        }
        val totalAmount = annotation.totalAmount
        if (totalAmount.status.isActive) {
            unionExtractValidator.add({ it.totalAmount }, finder.find(totalAmount))
        }
        val invoicePayload = annotation.invoicePayload
        if (invoicePayload.status.isActive) {
            unionExtractValidator.add({ it.invoicePayload }, finder.find(invoicePayload))
        }
        val shippingOptionId = annotation.shippingOptionId
        if (shippingOptionId.status.isActive) {
            unionExtractValidator.add({ it.shippingOptionId }, finder.find(shippingOptionId))
        }
        val orderInfo = annotation.orderInfo
        if (orderInfo.status.isActive) {
            unionExtractValidator.add({ it.orderInfo }, finder.find(orderInfo))
        }

        return unionExtractValidator
    }
}

