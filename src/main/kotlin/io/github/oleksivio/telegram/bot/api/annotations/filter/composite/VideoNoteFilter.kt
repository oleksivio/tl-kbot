package io.github.oleksivio.telegram.bot.api.annotations.filter.composite

import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.IntegerFilter
import io.github.oleksivio.telegram.bot.api.model.annotation.AnnotationState

@Retention
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@MustBeDocumented
annotation class VideoNoteFilter(val status: AnnotationState = AnnotationState.ON, val validator: Array<String> = [], val length: IntegerFilter = IntegerFilter(status = AnnotationState.OFF), val duration: IntegerFilter = IntegerFilter(status = AnnotationState.OFF), val thumb: PhotoFilter = PhotoFilter(status = AnnotationState.OFF), val fileSize: IntegerFilter = IntegerFilter(status = AnnotationState.OFF))
