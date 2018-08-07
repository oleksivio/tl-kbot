package ru.ioleksiv.telegram.bot.api.model.method.game;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.api.model.objects.std.game.GameHighScore;
import ru.ioleksiv.telegram.bot.core.model.method.ChatAction;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;

import java.util.List;

/**
 * @see <a href="https://core.telegram.org/bots/api#getgamehighscores>getGameHighScores</a>
 */
public class GetGameHighScores extends ChatAction<List<GameHighScore>> {
    private static final String METHOD = "getGameHighScores";

    /**
     * user_id	Integer	Yes	Target user id
     */
    @JsonProperty("user_id")
    private Long userId = null;
    /**
     * message_id	Integer	Optional	Required if inline_message_id is not specified. Identifier of the sent message
     */
    @JsonProperty("message_id")
    private Long messageId = null;
    /**
     * inline_message_id	String	Optional	Required if chat_id and message_id are not specified. Identifier of the inline message
     */
    @JsonProperty("inline_message_id")
    private String inlineMessageId = null;

    public GetGameHighScores(Networker networker) {
        super(METHOD, networker);
    }

    public Long getUserId() {
        return userId;
    }

    public GetGameHighScores setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public Long getMessageId() {
        return messageId;
    }

    public GetGameHighScores setMessageId(Long messageId) {
        this.messageId = messageId;
        return this;
    }

    public String getInlineMessageId() {
        return inlineMessageId;
    }

    public GetGameHighScores setInlineMessageId(String inlineMessageId) {
        this.inlineMessageId = inlineMessageId;
        return this;
    }

    @Override
    protected Class<? extends CommonResponse<List<GameHighScore>>> getResultWrapperClass() {
        return ResponseCollection.GameHightScoresResponse.class;
    }

    @Override
    public GetGameHighScores setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }

    @Override
    public GetGameHighScores setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }
}
