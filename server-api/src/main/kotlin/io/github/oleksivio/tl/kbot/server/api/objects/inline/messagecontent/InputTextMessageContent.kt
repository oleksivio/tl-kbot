package io.github.oleksivio.tl.kbot.server.api.objects.inline.messagecontent

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *  [InputTextMessageContent](https://core.telegram.org/bots/api/#inputtextmessagecontent)
 */
class InputTextMessageContent(
    /**
     * message_text String Text of the message to be sent, 1-4096 characters
     */
    @JsonProperty("message_text")
    var messageText: String? = null,
    /**
     * parse_mode [String] Optional. Send Markdown or HTML, if you want Telegram apps to show bold, italic, fixed-width text
     * or inline URLs in your bot's message.
     */
    @JsonProperty("parse_mode")
    var parseMode: String? = null,
    /**
     * disable_web_page_preview Boolean Optional. Disables link previews for links in the sent message
     */
    @JsonProperty("disable_web_page_preview")
    var disableWebPagePreview: Boolean? = null
) : InputMessageContent
