package io.github.oleksivio.tl.kbot.core.annotations.filter.primitive

import io.github.oleksivio.tl.kbot.core.model.annotation.AnnotationState

/**
 * [NotNullFilter] annotation is used to filter incoming value
 *
 * Pass only not null values
 */
@Retention
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@MustBeDocumented
annotation class NotNullFilter(val status: AnnotationState = AnnotationState.ON)
