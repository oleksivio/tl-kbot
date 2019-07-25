package io.github.oleksivio.tl.kbot.core.annotations.filter.composite

import io.github.oleksivio.tl.kbot.core.annotations.filter.primitive.IntegerFilter
import io.github.oleksivio.tl.kbot.core.annotations.filter.primitive.StringFilter
import io.github.oleksivio.tl.kbot.core.model.annotation.AnnotationState

@Retention
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@MustBeDocumented
annotation class DocumentFilter(
    val status: AnnotationState = AnnotationState.ON,
    val validator: Array<String> = [],
    val thumb: PhotoFilter = PhotoFilter(
        status = AnnotationState.OFF
    ),
    val fileName: StringFilter = StringFilter(
        status = AnnotationState.OFF
    ),
    val mimeType: StringFilter = StringFilter(
        status = AnnotationState.OFF
    ),
    val fileSize: IntegerFilter = IntegerFilter(
        status = AnnotationState.OFF
    )
)
