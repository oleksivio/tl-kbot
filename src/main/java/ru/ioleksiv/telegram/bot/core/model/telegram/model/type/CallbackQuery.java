package ru.ioleksiv.telegram.bot.core.model.telegram.model.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.core.model.telegram.interfaces.ITelegram;

public class CallbackQuery implements ITelegram {
    private static final Logger LOGGER = LoggerFactory.getLogger(CallbackQuery.class);
    /**
     * id
     * <p>
     * String
     * <p>
     * Unique identifier for this query
     */
    private String mId = null;

    /**
     * from
     * <p>
     * User
     * <p>
     * Sender
     */
    private User mSender = null;
    /**
     * message
     * <p>
     * Message
     * <p>
     * Optional. Message with the callback button that originated the query.
     * Note that message content and message date will not be available if the message is too old
     */
    @Nullable
    private Message mMessage = null;
    /**
     * inline_message_id	String	Optional. Identifier of the message sent via the bot in inline mode, that originated the query.
     */
    @Nullable
    private String mInlineMessageId = null;
    /**
     * chat_instance
     * <p>
     * String
     * <p>
     * Global identifier, uniquely corresponding to the chat to which the message with the callback button was sent.
     * Useful for high scores in games.
     */

    private String mChatInstance = null;
    /**
     * data
     * <p>
     * String
     * <p>
     * Optional. Data associated with the callback button.
     * Be aware that a bad client can send arbitrary query in this field.
     */
    @Nullable
    private String mData = null;
    /**
     * game_short_name	String	Optional. Short name of a Game to be returned, serves as the unique identifier for the game
     */
    @Nullable
    private String mGameShortName = null;

    @JsonProperty("id")
    public String getId() {
        return mId;
    }

    @JsonProperty("id")
    public void setId(String id) {
        mId = id;
    }

    @JsonProperty("game_short_name")
    public String getGameShortName() {
        return mGameShortName;
    }

    @JsonProperty("game_short_name")
    public void setGameShortName(String gameShortName) {
        mGameShortName = gameShortName;
    }

    @JsonProperty("data")
    public String getData() {
        return mData;
    }

    @JsonProperty("data")
    public void setData(String data) {
        mData = data;
    }

    @JsonProperty("inline_message_id")
    public String getInlineMessageId() {
        return mInlineMessageId;
    }

    @JsonProperty("inline_message_id")
    public void setInlineMessageId(String inlineMessageId) {
        mInlineMessageId = inlineMessageId;
    }

    @JsonProperty("from")
    public User getSender() {
        return mSender;
    }

    @JsonProperty("from")
    public void setSender(User sender) {
        mSender = sender;
    }

    @JsonProperty("message")
    public Message getMessage() {
        return mMessage;
    }

    @JsonProperty("message")
    public void setMessage(Message message) {
        mMessage = message;
    }

    @JsonProperty("chat_instance")
    public String getChatInstance() {
        return mChatInstance;
    }

    @JsonProperty("chat_instance")
    public void setChatInstance(String chatInstance) {
        mChatInstance = chatInstance;
    }
}
