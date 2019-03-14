package io.github.oleksivio.telegram.bot.api.annotations.filter.primitive

import io.github.oleksivio.telegram.bot.api.model.annotation.AnnotationState

@Retention
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@MustBeDocumented
annotation class FloatFilter(val status: AnnotationState = AnnotationState.ON, val lessThan: Float = java.lang.Float.MAX_VALUE, val lessOrEqual: Float = java.lang.Float.MAX_VALUE, val moreThan: Float = java.lang.Float.MIN_VALUE, val moreOrEqual: Float = java.lang.Float.MIN_VALUE, val equal: Float = java.lang.Float.NaN)
