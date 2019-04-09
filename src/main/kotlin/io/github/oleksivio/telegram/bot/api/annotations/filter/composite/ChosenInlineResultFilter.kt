package io.github.oleksivio.telegram.bot.api.annotations.filter.composite

import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter
import io.github.oleksivio.telegram.bot.api.model.annotation.AnnotationState

@Retention
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@MustBeDocumented
annotation class ChosenInlineResultFilter(
        val from: UserFilter = UserFilter(status = AnnotationState.OFF),
        val validator: Array<String> = [],
        val location: LocationFilter = LocationFilter(status = AnnotationState.OFF),
        val inlineMessageId: StringFilter = StringFilter(status = AnnotationState.OFF),
        val query: StringFilter = StringFilter(status = AnnotationState.OFF)
)
