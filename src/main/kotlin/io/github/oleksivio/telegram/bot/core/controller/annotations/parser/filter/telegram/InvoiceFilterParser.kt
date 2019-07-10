package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.telegram

import io.github.oleksivio.telegram.bot.api.annotations.filter.composite.InvoiceFilter
import io.github.oleksivio.tl.kbot.server.api.objects.payments.Invoice
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator
import org.springframework.stereotype.Component

@Component
class InvoiceFilterParser : FilterParser<InvoiceFilter, Invoice> {

    override val parserAnnotationClass = InvoiceFilter::class

    override fun createChecker(annotation: InvoiceFilter, finder: Finder): Validator<Invoice> {
        val unionExtractValidator = UnionExtractValidator<Invoice>()

        annotation.validator
                .map { validatorName -> finder.find(validatorName, Invoice::class) }
                .forEach { validator -> unionExtractValidator.add({ it }, validator) }

        val title = annotation.title
        if (title.status.isActive) {
            unionExtractValidator.add({ it.title }, finder.find(title))
        }
        val description = annotation.description
        if (description.status.isActive) {
            unionExtractValidator.add({ it.description }, finder.find(description))
        }
        val startParameter = annotation.startParameter
        if (startParameter.status.isActive) {
            unionExtractValidator.add({ it.startParameter }, finder.find(startParameter))
        }
        val currency = annotation.currency
        if (currency.status.isActive) {
            unionExtractValidator.add({ it.currency }, finder.find(currency))
        }
        val totalAmount = annotation.totalAmount
        if (totalAmount.status.isActive) {
            unionExtractValidator.add({ it.totalAmount }, finder.find(totalAmount))
        }

        return unionExtractValidator
    }

}

