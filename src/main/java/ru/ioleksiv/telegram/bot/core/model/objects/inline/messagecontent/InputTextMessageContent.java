package ru.ioleksiv.telegram.bot.core.model.objects.inline.messagecontent;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <a href="https://core.telegram.org/bots/api#inputtextmessagecontent>InputTextMessageContent</a>
 */
public class InputTextMessageContent implements InputMessageContent {
    /**
     * message_text	String	Text of the message to be sent, 1-4096 characters
     */
    @JsonProperty("message_text")
    private String messageText = null;
    /**
     * parse_mode	String	Optional. Send Markdown or HTML, if you want Telegram apps to show bold, italic, fixed-width text or inline URLs in your bot's message.
     */
    @JsonProperty("parse_mode")
    private String parseMode = null;
    /**
     * disable_web_page_preview	Boolean	Optional. Disables link previews for links in the sent message
     */
    @JsonProperty("disable_web_page_preview")
    private Boolean disableWebPagePreview = null;

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public String getParseMode() {
        return parseMode;
    }

    public void setParseMode(String parseMode) {
        this.parseMode = parseMode;
    }

    public Boolean getDisableWebPagePreview() {
        return disableWebPagePreview;
    }

    public void setDisableWebPagePreview(Boolean disableWebPagePreview) {
        this.disableWebPagePreview = disableWebPagePreview;
    }
}
