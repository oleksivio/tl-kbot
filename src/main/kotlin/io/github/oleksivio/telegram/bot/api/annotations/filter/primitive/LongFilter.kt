package io.github.oleksivio.telegram.bot.api.annotations.filter.primitive

import io.github.oleksivio.telegram.bot.api.model.annotation.AnnotationState

@Retention
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@MustBeDocumented
annotation class LongFilter(val status: AnnotationState = AnnotationState.ON, val lessThan: Long = java.lang.Long.MAX_VALUE, val lessOrEqual: Long = java.lang.Long.MAX_VALUE, val moreThan: Long = java.lang.Long.MIN_VALUE, val moreOrEqual: Long = java.lang.Long.MIN_VALUE)