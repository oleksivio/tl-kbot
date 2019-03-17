package io.github.oleksivio.telegram.bot.core.model.method.common

import com.fasterxml.jackson.annotation.JsonIgnore
import io.github.oleksivio.telegram.bot.api.model.objects.std.Message
import io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard.IKeyboard
import io.github.oleksivio.telegram.bot.core.model.MessageResponse

abstract class MessageAction : ChatAction<Message>() {
    abstract val disableNotification: Boolean?
    abstract val replyToMessageId: Long?
    abstract val replyMarkup: IKeyboard?

    @JsonIgnore
    override val resultWrapperClass = MessageResponse::class
}
