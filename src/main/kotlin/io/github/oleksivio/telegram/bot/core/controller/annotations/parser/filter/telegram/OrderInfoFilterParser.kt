package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.telegram

import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.OrderInfoFilter
import io.github.oleksivio.telegram.bot.api.model.objects.payments.OrderInfo
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator
import org.springframework.stereotype.Component

@Component
class OrderInfoFilterParser : FilterParser<OrderInfoFilter, OrderInfo> {

    override val parserAnnotationClass = OrderInfoFilter::class

    override fun createChecker(annotation: OrderInfoFilter, finder: Finder): Validator<OrderInfo> {
        val unionExtractValidator = UnionExtractValidator<OrderInfo>()

        annotation.validator
                .map { validatorName -> finder.find(validatorName, OrderInfo::class) }
                .forEach { validator -> unionExtractValidator.add({ it }, validator) }

        val name = annotation.name
        if (name.status.isActive) {
            unionExtractValidator.add({ it.name }, finder.find(name))
        }
        val phoneNumber = annotation.phoneNumber
        if (phoneNumber.status.isActive) {
            unionExtractValidator.add({ it.phoneNumber }, finder.find(phoneNumber))
        }
        val email = annotation.email
        if (email.status.isActive) {
            unionExtractValidator.add({ it.email }, finder.find(email))
        }
        val shippingAddress = annotation.shippingAddress
        if (shippingAddress.status.isActive) {
            unionExtractValidator.add({ it.shippingAddress }, finder.find(shippingAddress))
        }

        return unionExtractValidator
    }

}

