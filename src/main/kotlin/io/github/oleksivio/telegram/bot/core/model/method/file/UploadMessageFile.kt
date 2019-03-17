package io.github.oleksivio.telegram.bot.core.model.method.file

import io.github.oleksivio.telegram.bot.api.model.objects.std.Message
import io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard.IKeyboard
import io.github.oleksivio.telegram.bot.core.model.MessageResponse

abstract class UploadMessageFile protected constructor() : UploadFile<Message>() {

    override val resultWrapperClass = MessageResponse::class

    abstract val disableNotification: Boolean?

    abstract val replyToMessageId: Long?

    abstract val replyMarkup: IKeyboard?

}
