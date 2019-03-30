package io.github.oleksivio.telegram.bot.api.annotations.filter.composite

import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter
import io.github.oleksivio.telegram.bot.api.model.annotation.AnnotationState

@Retention
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@MustBeDocumented
annotation class GameFilter(val status: AnnotationState = AnnotationState.ON, val validator: Array<String> = [], val title: StringFilter = StringFilter(status = AnnotationState.OFF), val description: StringFilter = StringFilter(status = AnnotationState.OFF), val photoArray: PhotoArrayFilter = PhotoArrayFilter(status = AnnotationState.OFF), val text: StringFilter = StringFilter(status = AnnotationState.OFF), val textEntities: MessageEntityFilter = MessageEntityFilter(status = AnnotationState.OFF), val animation: AnimationFilter = AnimationFilter(status = AnnotationState.OFF))
