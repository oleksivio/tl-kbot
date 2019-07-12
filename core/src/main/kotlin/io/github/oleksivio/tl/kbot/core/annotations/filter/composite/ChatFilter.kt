package io.github.oleksivio.tl.kbot.core.annotations.filter.composite

import io.github.oleksivio.tl.kbot.core.annotations.filter.primitive.BooleanFilter
import io.github.oleksivio.tl.kbot.core.annotations.filter.primitive.StringFilter
import io.github.oleksivio.tl.kbot.core.model.annotation.AnnotationState
import io.github.oleksivio.tl.kbot.server.api.objects.std.Chat

@Retention
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@MustBeDocumented
annotation class ChatFilter(
    val status: AnnotationState = AnnotationState.ON,
    val type: Chat.Type = Chat.Type.UNKNOWN,
    val validator: Array<String> = [],
    val title: StringFilter = StringFilter(
        status = AnnotationState.OFF
    ),
    val username: StringFilter = StringFilter(
        status = AnnotationState.OFF
    ),
    val firstName: StringFilter = StringFilter(
        status = AnnotationState.OFF
    ),
    val lastName: StringFilter = StringFilter(
        status = AnnotationState.OFF
    ),
    val allMembersAreAdministrators: BooleanFilter = BooleanFilter(
        status = AnnotationState.OFF
    )
)
