package io.github.oleksivio.telegram.bot.api.annotations.filter.composite

import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.BooleanFilter
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter
import io.github.oleksivio.telegram.bot.api.model.annotation.AnnotationState

@Retention
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@MustBeDocumented
annotation class UserFilter(
        val status: AnnotationState = AnnotationState.ON,
        val validator: Array<String> = [],
        val firstName: StringFilter = StringFilter(status = AnnotationState.OFF),
        val lastName: StringFilter = StringFilter(status = AnnotationState.OFF),
        val username: StringFilter = StringFilter(status = AnnotationState.OFF),
        val languageCode: StringFilter = StringFilter(status = AnnotationState.OFF),
        val bot: BooleanFilter = BooleanFilter(status = AnnotationState.OFF)
)
