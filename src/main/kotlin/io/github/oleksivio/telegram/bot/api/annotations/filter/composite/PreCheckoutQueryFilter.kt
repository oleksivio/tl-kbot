package io.github.oleksivio.telegram.bot.api.annotations.filter.composite

import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter
import io.github.oleksivio.telegram.bot.api.model.annotation.AnnotationState

@Retention
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@MustBeDocumented
annotation class PreCheckoutQueryFilter(
        val from: UserFilter = UserFilter(status = AnnotationState.OFF),
        val validator: Array<String> = [],
        val currency: StringFilter = StringFilter(status = AnnotationState.OFF),
        val totalAmount: StringFilter = StringFilter(status = AnnotationState.OFF),
        val invoicePayload: StringFilter = StringFilter(status = AnnotationState.OFF),
        val shippingOptionId: StringFilter = StringFilter(status = AnnotationState.OFF),
        val orderInfo: OrderInfoFilter = OrderInfoFilter(status = AnnotationState.OFF)
)
