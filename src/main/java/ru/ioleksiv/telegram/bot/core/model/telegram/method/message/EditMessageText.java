package ru.ioleksiv.telegram.bot.core.model.telegram.method.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.method.interfaces.EditAction;

/**
 * @see <a href="https://core.telegram.org/bots/api#editmessagetext>editMessageText</a>
 */
abstract class EditMessageText<RES > extends EditAction<RES > {
    private static final String METHOD = "editMessageText";
    /**
     * text	String	Yes	New text of the message
     */
    @JsonProperty("text")
    private String text = null;
    /**
     * parse_mode	String	Optional	Send Markdown or HTML, if you want Telegram apps to show bold,
     * italic, fixed-width text or inline URLs in your bot's message.
     */
    @JsonProperty("parse_mode")
    private String parseMode = null;
    /**
     * disable_web_page_preview	Boolean	Optional	Disables link previews for links in this message
     */
    @JsonProperty("disable_web_page_preview")
    private Boolean disableWebPagePreview = null;

    EditMessageText(Networker networker) {
        super(METHOD, networker);
    }

    public String getText() {
        return text;
    }

    public EditMessageText<RES > setText(String text) {
        this.text = text;
        return this;
    }

    public String getParseMode() {
        return parseMode;
    }

    public EditMessageText<RES > setParseMode(String parseMode) {
        this.parseMode = parseMode;
        return this;
    }

    public Boolean getDisableWebPagePreview() {
        return disableWebPagePreview;
    }

    public EditMessageText<RES > setDisableWebPagePreview(Boolean disableWebPagePreview) {
        this.disableWebPagePreview = disableWebPagePreview;
        return this;
    }

}
