package ru.ioleksiv.telegram.bot.core.model.objects.std;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <a href="https://core.telegram.org/bots/api#callbackquery">CallbackQuery</a>
 */
public class CallbackQuery {
    /**
     * id	String	Unique identifier for this query
     */
    @JsonProperty("id")
    private String id = null;
    /**
     * from	User	Sender
     */
    @JsonProperty("from")
    private User from = null;
    /**
     * message	Message	Optional. Message with the callback button that originated the query. Note
     * that message content and message date will not be available if the message is too old
     */
    @JsonProperty("message")
    private Message message = null;
    /**
     * inline_message_id	String	Optional. Identifier of the message sent via the bot in inline mode,
     * that originated the query.
     */
    @JsonProperty("inline_message_id")
    private String inlineMessageId = null;
    /**
     * chat_instance	String	Global identifier, uniquely corresponding to the chat to which the
     * message with the callback button was sent. Useful for high scores in games.
     */
    @JsonProperty("chat_instance")
    private String chatInstance = null;
    /**
     * data	String	Optional. Data associated with the callback button. Be aware that a bad client
     * can send arbitrary data in this field.
     */
    @JsonProperty("data")
    private String data = null;
    /**
     * game_short_name	String	Optional. Short name of a Game to be returned, serves as the unique
     * identifier for the game
     */
    @JsonProperty("game_short_name")
    private String gameShortName = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getFrom() {
        return from;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public String getInlineMessageId() {
        return inlineMessageId;
    }

    public void setInlineMessageId(String inlineMessageId) {
        this.inlineMessageId = inlineMessageId;
    }

    public String getChatInstance() {
        return chatInstance;
    }

    public void setChatInstance(String chatInstance) {
        this.chatInstance = chatInstance;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getGameShortName() {
        return gameShortName;
    }

    public void setGameShortName(String gameShortName) {
        this.gameShortName = gameShortName;
    }
}
