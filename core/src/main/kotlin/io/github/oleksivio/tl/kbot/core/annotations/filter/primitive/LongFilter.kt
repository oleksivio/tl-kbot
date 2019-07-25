package io.github.oleksivio.tl.kbot.core.annotations.filter.primitive

import io.github.oleksivio.tl.kbot.core.model.annotation.AnnotationState

/**
 * [LongFilter] annotation is used to filter incoming [Long] value
 *
 * @param lessThan - passes only less values
 *
 * @param lessOrEqual - passes  less and equal values
 *
 * @param greatThan - passes only great values
 *
 * @param greatOrEqual - passes great and equals values
 *
 */
@Retention
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@MustBeDocumented
annotation class LongFilter(
    val status: AnnotationState = AnnotationState.ON,
    val lessThan: Long = java.lang.Long.MAX_VALUE,
    val lessOrEqual: Long = java.lang.Long.MAX_VALUE,
    val greatThan: Long = java.lang.Long.MIN_VALUE,
    val greatOrEqual: Long = java.lang.Long.MIN_VALUE
)
