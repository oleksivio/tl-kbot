package io.github.oleksivio.telegram.bot.api.annotations.filter.telegram

import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter
import io.github.oleksivio.telegram.bot.api.model.annotation.AnnotationState

@Retention
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@MustBeDocumented
annotation class CallbackQueryFilter(val message: MessageFilter = MessageFilter(status = AnnotationState.OFF), val validator: Array<String> = [], val inlineMessageId: StringFilter = StringFilter(status = AnnotationState.OFF), val chatInstance: StringFilter = StringFilter(status = AnnotationState.OFF), val data: StringFilter = StringFilter(status = AnnotationState.OFF), val gameShortName: StringFilter = StringFilter(status = AnnotationState.OFF))
