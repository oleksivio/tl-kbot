package io.github.oleksivio.tl.kbot.server.api.model.method.common

import com.fasterxml.jackson.annotation.JsonIgnore
import io.github.oleksivio.tl.kbot.server.api.model.MessageResponse
import io.github.oleksivio.tl.kbot.server.api.objects.std.Message
import io.github.oleksivio.tl.kbot.server.api.objects.std.keyboard.IKeyboard

abstract class MessageAction : ChatAction<Message>() {
    abstract val disableNotification: Boolean?
    abstract val replyToMessageId: Long?
    abstract val replyMarkup: IKeyboard?

    @JsonIgnore
    override val resultWrapperClass = MessageResponse::class
}
