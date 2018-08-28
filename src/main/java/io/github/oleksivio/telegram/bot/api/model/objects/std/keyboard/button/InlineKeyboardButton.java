package io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard.button;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.oleksivio.telegram.bot.api.model.objects.std.game.CallbackGame;

/**
 * @see <a href="https://core.telegram.org/bots/api#inlinekeyboardbutton">InlineKeyboardButton</a>
 */
public class InlineKeyboardButton {
    /**
     * text String Label text on the button
     */
    @JsonProperty("text")
    private String text = null;
    /**
     * url String Optional. HTTP url to be opened when button is pressed
     */
    @JsonProperty("url")
    private String url = null;
    /**
     * callback_data String Optional. Data to be sent in a callback query to the bot when button
     * is pressed, 1-64 bytes
     */
    @JsonProperty("callback_data")
    private String callbackData = null;
    /**
     * switch_inline_query String Optional. If set, pressing the button will prompt the user to
     * select one of their chats, open that chat and insert the bot‘s username and the specified
     * inline query in the input field. Can be empty, in which case just the bot’s username will
     * be inserted.
     */
    @JsonProperty("switch_inline_query")
    private String switchInlineQuery = null;
    /**
     * switch_inline_query_current_chat String Optional. If set, pressing the button will insert
     * the bot‘s username and the specified inline query in the current chat's input field. Can be
     * empty, in which case only the bot’s username will be inserted.
     */
    @JsonProperty("switch_inline_query_current_chat")
    private String switchInlineQueryCurrentChat = null;
    /**
     * callback_game CallbackGame Optional. Description of the game that will be launched when the user presses
     * the button.
     */
    @JsonProperty("callback_game")
    private CallbackGame callbackGame = null;
    /**
     * pay Boolean Optional. Specify True, to send a Pay button.
     */
    @JsonProperty("pay")
    private Boolean pay = null;

    private InlineKeyboardButton() {
    }

    public static InlineKeyboardButton create() {
        return new InlineKeyboardButton();
    }

    public String getText() {
        return text;
    }

    public InlineKeyboardButton setText(String text) {
        this.text = text;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public InlineKeyboardButton setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getCallbackData() {
        return callbackData;
    }

    public InlineKeyboardButton setCallbackData(String callbackData) {
        this.callbackData = callbackData;
        return this;
    }

    public String getSwitchInlineQuery() {
        return switchInlineQuery;
    }

    public InlineKeyboardButton setSwitchInlineQuery(String switchInlineQuery) {
        this.switchInlineQuery = switchInlineQuery;
        return this;
    }

    public String getSwitchInlineQueryCurrentChat() {
        return switchInlineQueryCurrentChat;
    }

    public InlineKeyboardButton setSwitchInlineQueryCurrentChat(String switchInlineQueryCurrentChat) {
        this.switchInlineQueryCurrentChat = switchInlineQueryCurrentChat;
        return this;
    }

    public CallbackGame getCallbackGame() {
        return callbackGame;
    }

    public InlineKeyboardButton setCallbackGame(CallbackGame callbackGame) {
        this.callbackGame = callbackGame;
        return this;
    }

    public Boolean getPay() {
        return pay;
    }

    public InlineKeyboardButton setPay(Boolean pay) {
        this.pay = pay;
        return this;
    }

}
