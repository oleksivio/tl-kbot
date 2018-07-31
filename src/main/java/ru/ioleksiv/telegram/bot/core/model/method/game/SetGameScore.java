package ru.ioleksiv.telegram.bot.core.model.method.game;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.method.interfaces.ChatAction;

/**
 * @see <a href="https://core.telegram.org/bots/api#setgamescore>setGameScore</a>
 */
public abstract class SetGameScore<RES> extends ChatAction<RES> {
    private static final String METHOD = "setGameScore";
    /**
     * score	Integer	Yes	New score, must be non-negative
     */
    @JsonProperty("score")
    private Integer score;
    /**
     * force	Boolean	Optional	Pass True, if the high score is allowed to decrease. This can be useful when fixing
     * mistakes or banning cheaters
     */
    @JsonProperty("force")
    private Boolean force;
    /**
     * disable_edit_message	Boolean	Optional	Pass True, if the game message should not be automatically edited to
     * include the current scoreboard
     */
    @JsonProperty("disable_edit_message")
    private Boolean disableEditMessage;

    /**
     * user_id	Integer	Yes	Target user id
     */
    @JsonProperty("user_id")
    private Long userId;
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

    public SetGameScore(Networker networker) {
        super(METHOD, networker);
    }

    public Integer getScore() {
        return score;
    }

    public SetGameScore<RES> setScore(Integer score) {
        this.score = score;
        return this;
    }

    public Boolean getForce() {
        return force;
    }

    public SetGameScore<RES> setForce(Boolean force) {
        this.force = force;
        return this;
    }

    public Boolean getDisableEditMessage() {
        return disableEditMessage;
    }

    public SetGameScore<RES> setDisableEditMessage(Boolean disableEditMessage) {
        this.disableEditMessage = disableEditMessage;
        return this;
    }

    public Long getUserId() {
        return userId;
    }

    public SetGameScore<RES> setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public Long getMessageId() {
        return messageId;
    }

    public SetGameScore<RES> setMessageId(Long messageId) {
        this.messageId = messageId;
        return this;
    }

    public String getInlineMessageId() {
        return inlineMessageId;
    }

    public SetGameScore<RES> setInlineMessageId(String inlineMessageId) {
        this.inlineMessageId = inlineMessageId;
        return this;
    }

    @Override
    public SetGameScore<RES> setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }
}
