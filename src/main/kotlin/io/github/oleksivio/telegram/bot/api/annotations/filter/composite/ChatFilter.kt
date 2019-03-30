package io.github.oleksivio.telegram.bot.api.annotations.filter.composite

import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.BooleanFilter
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter
import io.github.oleksivio.telegram.bot.api.model.annotation.AnnotationState
import io.github.oleksivio.telegram.bot.api.model.objects.std.Chat

@Retention
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@MustBeDocumented
annotation class ChatFilter(val status: AnnotationState = AnnotationState.ON, val type: Chat.Type = Chat.Type.ALL, val validator: Array<String> = [], val title: StringFilter = StringFilter(status = AnnotationState.OFF), val username: StringFilter = StringFilter(status = AnnotationState.OFF), val firstName: StringFilter = StringFilter(status = AnnotationState.OFF), val lastName: StringFilter = StringFilter(status = AnnotationState.OFF), val allMembersAreAdministrators: BooleanFilter = BooleanFilter(status = AnnotationState.OFF))
