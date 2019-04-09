package io.github.oleksivio.telegram.bot.api.annotations.filter.composite

import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.DoubleFilter
import io.github.oleksivio.telegram.bot.api.model.annotation.AnnotationState

@Retention
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@MustBeDocumented
annotation class LocationFilter(
        val status: AnnotationState = AnnotationState.ON,
        val validator: Array<String> = [],
        val longitude: DoubleFilter = DoubleFilter(status = AnnotationState.OFF),
        val latitude: DoubleFilter = DoubleFilter(status = AnnotationState.OFF)
)
