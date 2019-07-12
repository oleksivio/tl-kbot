package io.github.oleksivio.tl.kbot.core.annotations.filter.primitive

import io.github.oleksivio.tl.kbot.core.model.annotation.AnnotationState

/**
 * [FloatFilter] annotation is used to filter incoming [Float] value
 *
 * @param lessThan - passes only less values
 *
 * @param lessOrEqual - passes  less and equal values
 *
 * @param greatThan - passes only great values
 *
 * @param greatOrEqual - passes great and equals values
 *
 * @param equal - passes only equal values
 */
@Retention
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@MustBeDocumented
annotation class FloatFilter(
    val status: AnnotationState = AnnotationState.ON,
    val lessThan: Float = java.lang.Float.MAX_VALUE,
    val lessOrEqual: Float = java.lang.Float.MAX_VALUE,
    val greatThan: Float = java.lang.Float.MIN_VALUE,
    val greatOrEqual: Float = java.lang.Float.MIN_VALUE,
    val equal: Float = java.lang.Float.NaN)
