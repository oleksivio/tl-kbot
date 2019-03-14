package io.github.oleksivio.telegram.bot.api.annotations.filter.telegram

import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.IntegerFilter
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter
import io.github.oleksivio.telegram.bot.api.model.annotation.AnnotationState

@Retention
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@MustBeDocumented
annotation class InvoiceFilter(val status: AnnotationState = AnnotationState.ON, val validator: Array<String> = [], val title: StringFilter = StringFilter(status = AnnotationState.OFF), val description: StringFilter = StringFilter(status = AnnotationState.OFF), val startParameter: StringFilter = StringFilter(status = AnnotationState.OFF), val currency: StringFilter = StringFilter(status = AnnotationState.OFF), val totalAmount: IntegerFilter = IntegerFilter(status = AnnotationState.OFF))
