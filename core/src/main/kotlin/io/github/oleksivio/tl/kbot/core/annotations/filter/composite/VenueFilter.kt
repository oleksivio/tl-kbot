package io.github.oleksivio.tl.kbot.core.annotations.filter.composite

import io.github.oleksivio.tl.kbot.core.annotations.filter.primitive.NotNullFilter
import io.github.oleksivio.tl.kbot.core.annotations.filter.primitive.StringFilter
import io.github.oleksivio.tl.kbot.core.model.annotation.AnnotationState

@Retention
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@MustBeDocumented
annotation class VenueFilter(
    val status: AnnotationState = AnnotationState.ON,
    val validator: Array<String> = [],
    val location: LocationFilter = LocationFilter(
        status = AnnotationState.OFF
    ),
    val title: StringFilter = StringFilter(
        status = AnnotationState.OFF
    ),
    val address: StringFilter = StringFilter(
        status = AnnotationState.OFF
    ),
    val foursquareId: NotNullFilter = NotNullFilter(
        status = AnnotationState.OFF
    ),
    val foursquareType: StringFilter = StringFilter(
        status = AnnotationState.OFF
    )
)
