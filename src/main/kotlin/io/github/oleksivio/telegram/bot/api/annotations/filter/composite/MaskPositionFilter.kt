package io.github.oleksivio.telegram.bot.api.annotations.filter.composite

import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.FloatFilter
import io.github.oleksivio.telegram.bot.api.model.annotation.AnnotationState
import io.github.oleksivio.telegram.bot.api.model.objects.std.sticker.MaskPosition

@Retention
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@MustBeDocumented
annotation class MaskPositionFilter(
        val status: AnnotationState = AnnotationState.ON,
        val validator: Array<String> = [],
        val point: MaskPosition.Type = MaskPosition.Type.UNKNOWN,
        val xShift: FloatFilter = FloatFilter(status = AnnotationState.OFF),
        val yShift: FloatFilter = FloatFilter(status = AnnotationState.OFF),
        val scale: FloatFilter = FloatFilter(status = AnnotationState.OFF)
)
