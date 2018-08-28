package io.github.oleksivio.telegram.bot.api.model.objects.std;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.MessageFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.UserFilter;
import io.github.oleksivio.telegram.bot.core.model.objects.IUserFrom;

/**
 * @see <a href="https://core.telegram.org/bots/api#callbackquery">CallbackQuery</a>
 */
public class CallbackQuery implements IUserFrom {
    /**
     * id String Unique identifier for this query
     */
    @JsonProperty("id")
    private String id = null;
    /**
     * To setup filter:
     *
     * @see UserFilter from
     * from User Sender
     */
    @JsonProperty("from")
    private User from = null;
    /**
     * To setup filter:
     *
     * @see MessageFilter message
     * message Message Optional. Message with the callback button that originated the query. Note
     * that message content and message date will not be available if the message is too old
     */
    @JsonProperty("message")
    private Message message = null;
    /**
     * To setup filter:
     *
     * @see StringFilter inlineMessageId
     * inline_message_id String Optional. Identifier of the message sent via the bot in inline mode,
     * that originated the query.
     */
    @JsonProperty("inline_message_id")
    private String inlineMessageId = null;
    /**
     * To setup filter:
     *
     * @see StringFilter chatInstance
     * chat_instance String Global identifier, uniquely corresponding to the chat to which the
     * message with the callback button was sent. Useful for high scores in games.
     */
    @JsonProperty("chat_instance")
    private String chatInstance = null;
    /**
     * To setup filter:
     *
     * @see StringFilter data
     * data String Optional. Data associated with the callback button. Be aware that a bad client
     * can send arbitrary data in this field.
     */
    @JsonProperty("data")
    private String data = null;
    /**
     * To setup filter:
     *
     * @see StringFilter gameShortName
     * game_short_name String Optional. Short name of a Game to be returned, serves as the unique
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

    @Override
    public User getFrom() {
        return from;
    }

    @Override
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
