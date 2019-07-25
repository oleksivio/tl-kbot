package io.github.oleksivio.tl.kbot.core.annotations.filter.composite

import io.github.oleksivio.tl.kbot.core.annotations.filter.primitive.IntegerFilter
import io.github.oleksivio.tl.kbot.core.annotations.filter.primitive.StringFilter
import io.github.oleksivio.tl.kbot.core.model.annotation.AnnotationState

@Retention
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@MustBeDocumented
annotation class InvoiceFilter(
    val status: AnnotationState = AnnotationState.ON,
    val validator: Array<String> = [],
    val title: StringFilter = StringFilter(
        status = AnnotationState.OFF
    ),
    val description: StringFilter = StringFilter(
        status = AnnotationState.OFF
    ),
    val startParameter: StringFilter = StringFilter(
        status = AnnotationState.OFF
    ),
    val currency: StringFilter = StringFilter(
        status = AnnotationState.OFF
    ),
    val totalAmount: IntegerFilter = IntegerFilter(
        status = AnnotationState.OFF
    )
)
