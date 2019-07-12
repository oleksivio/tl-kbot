package io.github.oleksivio.tl.kbot.server.api.method.message

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.model.ApiDict
import io.github.oleksivio.tl.kbot.server.api.model.method.common.FormattedMessageAction
import io.github.oleksivio.tl.kbot.server.api.objects.ChatId
import io.github.oleksivio.tl.kbot.server.api.objects.std.keyboard.IKeyboard

/**
 * @see [sendMessage](https://core.telegram.org/bots/api/#sendmessage)
 */
data class SendMessage(
    @JsonProperty(ApiDict.CHAT_ID_KEY)
    override val chatId: ChatId,
    /**
     * text String Text of the message to be sent
     */
    @JsonProperty(ApiDict.TEXT_KEY)
    val text: String,
    /**
     * parse_mode [String] Optional Send Markdown or HTML,
     * if you want Telegram apps to show bold, italic, fixed-width text or inline URLs in your bot's message.
     */
    @JsonProperty(ApiDict.PARSE_MODE_KEY)
    override val parseMode: String? = null,
    /**
     * disable_web_page_preview [Boolean] OptionalDisables link previews for links in this message
     */
    @JsonProperty(ApiDict.DISABLE_WEB_PAGE_PREVIEW_KEY)
    val disableWebPagePreview: Boolean? = null,
    /**
     * disable_notification [Boolean] OptionalSends the message silently.
     * Users will receive a notification with no sound.
     */
    @JsonProperty(ApiDict.DISABLE_NOTIFICATION_KEY)
    override val disableNotification: Boolean? = null,
    /**
     * reply_to_message_id [Integer] OptionalIf the message is a reply, ID of the original message
     */
    @JsonProperty(ApiDict.REPLY_TO_MESSAGE_ID_KEY)
    override val replyToMessageId: Long? = null,
    /**
     * reply_markup
     * InlineKeyboardMarkup or ReplyKeyboardMarkup or ReplyKeyboardRemove or ForceReply
     * Optional
     * Additional interface options.
     * A JSON-serialized object for an inline keyboard, custom reply keyboard,
     * instructions to remove reply keyboard or to force a reply from the user.
     */
    @JsonProperty(ApiDict.REPLY_MARKUP_KEY)
    override val replyMarkup: IKeyboard? = null
) : FormattedMessageAction() {

    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "sendMessage"
}
