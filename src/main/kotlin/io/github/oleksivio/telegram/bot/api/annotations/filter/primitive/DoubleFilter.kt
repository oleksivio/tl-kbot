package io.github.oleksivio.telegram.bot.api.annotations.filter.primitive

import io.github.oleksivio.telegram.bot.api.model.annotation.AnnotationState

@Retention
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@MustBeDocumented
annotation class DoubleFilter(val status: AnnotationState = AnnotationState.ON, val lessThan: Double = java.lang.Double.MAX_VALUE, val lessOrEqual: Double = java.lang.Double.MAX_VALUE, val moreThan: Double = java.lang.Double.MIN_VALUE, val moreOrEqual: Double = java.lang.Double.MIN_VALUE, val equal: Double = java.lang.Double.NaN)
