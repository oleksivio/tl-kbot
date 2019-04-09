package io.github.oleksivio.telegram.bot.api.annotations.filter.primitive

import io.github.oleksivio.telegram.bot.api.model.annotation.AnnotationState
import io.github.oleksivio.telegram.bot.api.model.annotation.BooleanState

/**
 * [BooleanFilter] annotation used for filtering incoming
 * [Boolean] value.
 *
 * @param state [BooleanState] is enum filtering condition
 * it could be TRUE, FALSE and NON_NULL
 */
@Retention
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@MustBeDocumented
annotation class BooleanFilter(
        val status: AnnotationState = AnnotationState.ON,
        val state: BooleanState = BooleanState.NON_NULL
)
