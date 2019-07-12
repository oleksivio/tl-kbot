package io.github.oleksivio.tl.kbot.core.annotations.filter.composite

import io.github.oleksivio.tl.kbot.core.annotations.filter.primitive.IntegerFilter
import io.github.oleksivio.tl.kbot.core.annotations.filter.primitive.StringFilter
import io.github.oleksivio.tl.kbot.core.model.annotation.AnnotationState
import io.github.oleksivio.tl.kbot.server.api.objects.std.MessageEntity

@Retention
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@MustBeDocumented
annotation class MessageEntityArrayFilter(
    val status: AnnotationState = AnnotationState.ON,
    val type: MessageEntity.Type = MessageEntity.Type.UNKNOWN,
    val validator: Array<String> = [],
    val length: IntegerFilter = IntegerFilter(
        status = AnnotationState.OFF
    ),
    val url: StringFilter = StringFilter(
        status = AnnotationState.OFF
    ),
    val user: UserFilter = UserFilter(
        status = AnnotationState.OFF
    )
)
