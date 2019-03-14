package io.github.oleksivio.telegram.bot.api.annotations.filter.primitive

import io.github.oleksivio.telegram.bot.api.model.annotation.AnnotationState

@Retention
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@MustBeDocumented
annotation class IntegerFilter(val status: AnnotationState = AnnotationState.ON, val lessThan: Int = Integer.MAX_VALUE, val lessOrEqual: Int = Integer.MAX_VALUE, val moreThan: Int = Integer.MIN_VALUE, val moreOrEqual: Int = Integer.MIN_VALUE)
