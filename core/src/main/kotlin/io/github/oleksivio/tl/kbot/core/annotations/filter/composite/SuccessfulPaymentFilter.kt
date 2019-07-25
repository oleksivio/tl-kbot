package io.github.oleksivio.tl.kbot.core.annotations.filter.composite

import io.github.oleksivio.tl.kbot.core.annotations.filter.primitive.IntegerFilter
import io.github.oleksivio.tl.kbot.core.annotations.filter.primitive.NotNullFilter
import io.github.oleksivio.tl.kbot.core.annotations.filter.primitive.StringFilter
import io.github.oleksivio.tl.kbot.core.model.annotation.AnnotationState

@Retention
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@MustBeDocumented
annotation class SuccessfulPaymentFilter(
    val status: AnnotationState = AnnotationState.ON,
    val validator: Array<String> = [],
    val currency: StringFilter = StringFilter(
        status = AnnotationState.OFF
    ),
    val totalAmount: IntegerFilter = IntegerFilter(
        status = AnnotationState.OFF
    ),
    val invoicePayload: StringFilter = StringFilter(
        status = AnnotationState.OFF
    ),
    val shippingOptionId: NotNullFilter = NotNullFilter(
        status = AnnotationState.OFF
    ),
    val orderInfo: OrderInfoFilter = OrderInfoFilter(
        status = AnnotationState.OFF
    ),
    val telegramPaymentChargeId: NotNullFilter = NotNullFilter(
        status = AnnotationState.OFF
    ),
    val providerPaymentChargeId: NotNullFilter = NotNullFilter(
        status = AnnotationState.OFF
    )
)
