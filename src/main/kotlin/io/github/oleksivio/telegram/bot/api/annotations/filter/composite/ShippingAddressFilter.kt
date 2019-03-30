package io.github.oleksivio.telegram.bot.api.annotations.filter.composite

import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter
import io.github.oleksivio.telegram.bot.api.model.annotation.AnnotationState

@Retention
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@MustBeDocumented
annotation class ShippingAddressFilter(val status: AnnotationState = AnnotationState.ON, val validator: Array<String> = [], val countryCode: StringFilter = StringFilter(status = AnnotationState.OFF), val state: StringFilter = StringFilter(status = AnnotationState.OFF), val city: StringFilter = StringFilter(status = AnnotationState.OFF), val streetLine1: StringFilter = StringFilter(status = AnnotationState.OFF), val streetLine2: StringFilter = StringFilter(status = AnnotationState.OFF), val postCode: StringFilter = StringFilter(status = AnnotationState.OFF))
