package io.github.oleksivio.telegram.bot.api.annotations.filter.telegram

import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter
import io.github.oleksivio.telegram.bot.api.model.annotation.AnnotationState

@Retention
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@MustBeDocumented
annotation class OrderInfoFilter(val status: AnnotationState = AnnotationState.ON, val validator: Array<String> = [], val name: StringFilter = StringFilter(status = AnnotationState.OFF), val phoneNumber: StringFilter = StringFilter(status = AnnotationState.OFF), val email: StringFilter = StringFilter(status = AnnotationState.OFF), val shippingAddress: ShippingAddressFilter = ShippingAddressFilter(status = AnnotationState.OFF))
