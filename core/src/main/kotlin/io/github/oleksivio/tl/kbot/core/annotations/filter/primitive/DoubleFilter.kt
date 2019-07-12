package io.github.oleksivio.tl.kbot.core.annotations.filter.primitive

import io.github.oleksivio.tl.kbot.core.model.annotation.AnnotationState

/**
 * [DoubleFilter] annotation is used to filter incoming [Double] value
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
annotation class DoubleFilter(
    val status: AnnotationState = AnnotationState.ON,
    val lessThan: Double = java.lang.Double.MAX_VALUE,
    val lessOrEqual: Double = java.lang.Double.MAX_VALUE,
    val greatThan: Double = java.lang.Double.MIN_VALUE,
    val greatOrEqual: Double = java.lang.Double.MIN_VALUE,
    val equal: Double = java.lang.Double.NaN)
