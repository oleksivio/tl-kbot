package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.telegram

import io.github.oleksivio.telegram.bot.api.annotations.filter.composite.SuccessfulPaymentFilter
import io.github.oleksivio.tl.kbot.server.api.objects.payments.SuccessfulPayment
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator
import org.springframework.stereotype.Component

@Component
class SuccessfulPaymentFilterParser : FilterParser<SuccessfulPaymentFilter, SuccessfulPayment> {

    override val parserAnnotationClass = SuccessfulPaymentFilter::class

    override fun createChecker(annotation: SuccessfulPaymentFilter, finder: Finder): Validator<SuccessfulPayment> {
        val unionExtractValidator = UnionExtractValidator<SuccessfulPayment>()

        annotation.validator
                .map { validatorName -> finder.find(validatorName, SuccessfulPayment::class) }
                .forEach { validator -> unionExtractValidator.add({ it }, validator) }

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
        val telegramPaymentChargeId = annotation.telegramPaymentChargeId
        if (telegramPaymentChargeId.status.isActive) {
            unionExtractValidator.add({ it.telegramPaymentChargeId }, finder.find(telegramPaymentChargeId))
        }
        val providerPaymentChargeId = annotation.providerPaymentChargeId
        if (providerPaymentChargeId.status.isActive) {
            unionExtractValidator.add({ it.providerPaymentChargeId }, finder.find(providerPaymentChargeId))
        }

        return unionExtractValidator
    }

}

