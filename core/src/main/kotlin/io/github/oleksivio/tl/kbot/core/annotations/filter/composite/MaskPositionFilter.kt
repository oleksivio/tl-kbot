package io.github.oleksivio.tl.kbot.core.annotations.filter.composite

import io.github.oleksivio.tl.kbot.core.annotations.filter.primitive.FloatFilter
import io.github.oleksivio.tl.kbot.core.model.annotation.AnnotationState
import io.github.oleksivio.tl.kbot.server.api.objects.std.sticker.MaskPosition

@Retention
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@MustBeDocumented
annotation class MaskPositionFilter(
    val status: AnnotationState = AnnotationState.ON,
    val validator: Array<String> = [],
    val point: MaskPosition.Type = MaskPosition.Type.UNKNOWN,
    val xShift: FloatFilter = FloatFilter(
        status = AnnotationState.OFF
    ),
    val yShift: FloatFilter = FloatFilter(
        status = AnnotationState.OFF
    ),
    val scale: FloatFilter = FloatFilter(
        status = AnnotationState.OFF
    )
)
