package io.github.oleksivio.tl.kbot.server.api.method.file

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.model.ApiDict
import io.github.oleksivio.tl.kbot.server.api.model.method.common.CaptionAction
import io.github.oleksivio.tl.kbot.server.api.objects.ChatId
import io.github.oleksivio.tl.kbot.server.api.objects.InputFile
import io.github.oleksivio.tl.kbot.server.api.objects.std.keyboard.IKeyboard

/**
 * @see [sendVoice](https://core.telegram.org/bots/api/#sendvoice)
 */
data class SendVoice(
    /**
     * chat_id Integer Yes Unique identifier for the target chat
     */
    @JsonProperty(ApiDict.CHAT_ID_KEY)
    override val chatId: ChatId,
    /**
     * voice  String Audio file to send. Pass a file_id as String to send a file
     * that exists on the Telegram servers (recommended), pass an HTTP URL as a String for Telegram
     * to get a file from the Internet
     */
    @JsonProperty(ApiDict.VOICE_KEY)
    val voice: InputFile,
    /**
     * duration [Integer] OptionalDuration of the voice message in seconds
     */
    @JsonProperty(ApiDict.DURATION_KEY)
    val duration: Int? = null,
    /**
     * caption	String	Optional	Document caption (may also be used when resending documents by file_id), 0-1024 characters
     */
    @JsonProperty(ApiDict.CAPTION_KEY)
    override val caption: String? = null,
    /**
     * parse_mode	String	Optional	Send Markdown or HTML, if you want Telegram apps to show bold, italic, fixed-width text or inline URLs in the media caption.
     */
    @JsonProperty(ApiDict.PARSE_MODE_KEY)
    override val parseMode: String? = null,
    /**
     * disable_notification	Boolean	Optional	Sends the message silently. Users will receive a notification with no sound.
     */
    @JsonProperty(ApiDict.DISABLE_NOTIFICATION_KEY)
    override val disableNotification: Boolean? = null,
    /**
     * reply_to_message_id	Integer	Optional	If the message is a reply, ID of the original message
     */
    @JsonProperty(ApiDict.REPLY_TO_MESSAGE_ID_KEY)
    override val replyToMessageId: Long? = null,
    /**
     * reply_markup	InlineKeyboardMarkup or ReplyKeyboardMarkup or ReplyKeyboardRemove or ForceReply	Optional	Additional interface options. A JSON-serialized object for an inline keyboard, custom reply keyboard, instructions to remove reply keyboard or to force a reply from the user.
     */
    @JsonProperty(ApiDict.REPLY_MARKUP_KEY)
    override val replyMarkup: IKeyboard? = null
) : CaptionAction() {

    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "sendVoice"
}

