package io.github.oleksivio.telegram.bot.api.annotations.filter.primitive

import io.github.oleksivio.telegram.bot.api.model.annotation.AnnotationState

/**
 * [IntegerFilter] annotation is used to filter incoming [Int] value
 *
 * @param lessThan - passes only less values
 *
 * @param lessOrEqual - passes  less and equal values
 *
 * @param greatThan - passes only great values
 *
 * @param greatOrEqual - passes great and equals values
 */
@Retention
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@MustBeDocumented
annotation class IntegerFilter(
        val status: AnnotationState = AnnotationState.ON,
        val lessThan: Int = Integer.MAX_VALUE,
        val lessOrEqual: Int = Integer.MAX_VALUE,
        val greatThan: Int = Integer.MIN_VALUE,
        val greatOrEqual: Int = Integer.MIN_VALUE
)
