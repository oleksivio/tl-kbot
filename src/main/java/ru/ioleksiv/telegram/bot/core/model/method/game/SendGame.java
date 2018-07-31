package ru.ioleksiv.telegram.bot.core.model.method.game;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.method.interfaces.ChatAction;
import ru.ioleksiv.telegram.bot.core.model.objects.std.Message;
import ru.ioleksiv.telegram.bot.core.model.objects.std.keyboard.InlineKeyboardMarkup;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;

/**
 * @see <a href="https://core.telegram.org/bots/api#sendgame>sendGame</a>
 */
public class SendGame extends ChatAction<Message> {
    private static final String METHOD = "sendGame";
    /**
     * game_short_name	String	Yes	Short name of the game, serves as the unique identifier for the game. Set up your games via Botfather.
     */
    @JsonProperty("game_short_name")
    private String gameShortName;
    /**
     * reply_markup	InlineKeyboardMarkup	Optional	A JSON-serialized object for an inline keyboard.
     * If empty, one ‘Play game_title’ button will be shown. If not empty, the first button must launch the game.
     */
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup = null;
    /**
     * disable_notification	Boolean	Optional	Sends the message silently. Users will receive a notification with
     * no sound.
     */
    @JsonProperty("disable_notification")
    private Boolean disableNotification = null;
    /**
     * reply_to_message_id	Integer	Optional	If the message is a reply, ID of the original message
     */
    @JsonProperty("reply_to_message_id")
    private Long replyToMessageId = null;

    public SendGame(Networker networker) {
        super(METHOD, networker);
    }

    public String getGameShortName() {
        return gameShortName;
    }

    public SendGame setGameShortName(String gameShortName) {
        this.gameShortName = gameShortName;
        return this;
    }

    public InlineKeyboardMarkup getReplyMarkup() {
        return replyMarkup;
    }

    public SendGame setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
        return this;
    }

    public Boolean getDisableNotification() {
        return disableNotification;
    }

    public SendGame setDisableNotification(Boolean disableNotification) {
        this.disableNotification = disableNotification;
        return this;
    }

    public Long getReplyToMessageId() {
        return replyToMessageId;
    }

    public SendGame setReplyToMessageId(Long replyToMessageId) {
        this.replyToMessageId = replyToMessageId;
        return this;
    }

    @Override
   protected Class<? extends CommonResponse<Message>> getResultWrapperClass() {
        return ResponseCollection.MessageResponse.class;
    }

    @Override
    public SendGame setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }
}
