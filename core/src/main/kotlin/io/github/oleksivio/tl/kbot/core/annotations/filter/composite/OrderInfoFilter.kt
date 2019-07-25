package io.github.oleksivio.tl.kbot.core.annotations.filter.composite

import io.github.oleksivio.tl.kbot.core.annotations.filter.primitive.StringFilter
import io.github.oleksivio.tl.kbot.core.model.annotation.AnnotationState

@Retention
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@MustBeDocumented
annotation class OrderInfoFilter(
    val status: AnnotationState = AnnotationState.ON,
    val validator: Array<String> = [],
    val name: StringFilter = StringFilter(
        status = AnnotationState.OFF
    ),
    val phoneNumber: StringFilter = StringFilter(
        status = AnnotationState.OFF
    ),
    val email: StringFilter = StringFilter(
        status = AnnotationState.OFF
    ),
    val shippingAddress: ShippingAddressFilter = ShippingAddressFilter(
        status = AnnotationState.OFF
    )
)
