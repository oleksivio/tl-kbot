package io.github.oleksivio.telegram.bot.api.annotations.filter.primitive

import io.github.oleksivio.telegram.bot.api.model.annotation.AnnotationState
import io.github.oleksivio.telegram.bot.api.model.annotation.BooleanState

@Retention
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@MustBeDocumented
annotation class BooleanFilter(val status: AnnotationState = AnnotationState.ON, val state: BooleanState = BooleanState.NON_NULL)
