package ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.keyboard.button;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.game.CallbackGame;

/**
 * @see <a href="https://core.telegram.org/bots/api#inlinekeyboardbutton">InlineKeyboardButtonb</a>
 */
public class InlineKeyboardButton implements IButton {
    private static final Logger LOGGER = LoggerFactory.getLogger(InlineKeyboardButton.class);
    /**
     * text	String	Label text on the button
     */
    @JsonProperty("text")
    private String text = null;
    /**
     * url	String	Optional. HTTP url to be opened when button is pressed
     */
    @JsonProperty("url")
    private String url = null;
    /**
     * callback_data	String	Optional. Data to be sent in a callback query to the bot when button
     * is pressed, 1-64 bytes
     */
    @JsonProperty("callback_data")
    private String mCallbackData = null;
    /**
     * switch_inline_query	String	Optional. If set, pressing the button will prompt the user to
     * select one of their chats, open that chat and insert the bot‘s username and the specified
     * inline query in the input field. Can be empty, in which case just the bot’s username will
     * be inserted.
     */
    @JsonProperty("switch_inline_query")
    private String switchInlineQuery;
    /**
     * switch_inline_query_current_chat	String	Optional. If set, pressing the button will insert
     * the bot‘s username and the specified inline query in the current chat's input field. Can be
     * empty, in which case only the bot’s username will be inserted.
     */
    @JsonProperty("switch_inline_query_current_chat")
    private String switchInlineQueryCurrentChat;
    /**
     * callback_game	CallbackGame	Optional. Description of the game that will be launched when the user presses the button.
     */
    @JsonProperty("callback_game")
    private CallbackGame callbackGame;
    /**
     * pay	Boolean	Optional. Specify True, to send a Pay button.
     */
    @JsonProperty("pay")
    private Boolean pay;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getmCallbackData() {
        return mCallbackData;
    }

    public void setmCallbackData(String mCallbackData) {
        this.mCallbackData = mCallbackData;
    }

    public String getSwitchInlineQuery() {
        return switchInlineQuery;
    }

    public void setSwitchInlineQuery(String switchInlineQuery) {
        this.switchInlineQuery = switchInlineQuery;
    }

    public String getSwitchInlineQueryCurrentChat() {
        return switchInlineQueryCurrentChat;
    }

    public void setSwitchInlineQueryCurrentChat(String switchInlineQueryCurrentChat) {
        this.switchInlineQueryCurrentChat = switchInlineQueryCurrentChat;
    }

    public CallbackGame getCallbackGame() {
        return callbackGame;
    }

    public void setCallbackGame(CallbackGame callbackGame) {
        this.callbackGame = callbackGame;
    }

    public Boolean getPay() {
        return pay;
    }

    public void setPay(Boolean pay) {
        this.pay = pay;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }

    public String getCallbackData() {
        return mCallbackData;
    }

    public void setCallbackData(String callbackData) {
        mCallbackData = callbackData;
    }

}
