package ru.ioleksiv.telegram.bot.api.model.objects.std;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.UserFilter;
import ru.ioleksiv.telegram.bot.core.model.ITelegram;
import ru.ioleksiv.telegram.bot.core.model.type.TelegramType;

/**
 * @see <a href="https://core.telegram.org/bots/api#messageentity">MessageEntity</a>
 */
public class MessageEntity implements ITelegram {
    /**
     * To setup filter:
     *
     * @see Type type
     * type String Type of the entity. Can be mention (@username), hashtag, bot_command, url, email,
     * bold (bold text), italic (italic text), code (monowidth string), pre (monowidth block),
     * text_link (for clickable text URLs), text_mention (for users without usernames)
     */
    @JsonProperty("type")
    private String type = null;
    /**
     * offset Integer Offset in UTF-16 code units to the start of the entity
     */
    @JsonProperty("offset")
    private String offset = null;
    /**
     * To setup filter:
     *
     * @see IntegerFilter length
     * length Integer Length of the entity in UTF-16 code units
     */
    @JsonProperty("length")
    private Integer length = null;
    /**
     * To setup filter:
     *
     * @see StringFilter url
     * url String Optional. For “text_link” only, url that will be opened after user taps on the text
     */
    @JsonProperty("url")
    private String url = null;
    /**
     * To setup filter:
     *
     * @see UserFilter user
     * user User Optional. For “text_mention” only, the mentioned user
     */
    @JsonProperty("user")
    private User user = null;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public enum Type implements TelegramType {
        MENTION("mention"),
        HASHTAG("hashtag"),
        CASHTAG("cashtag"),
        BOT_COMMAND("bot_command"),
        URL("url"),
        EMAIL("email"),
        PHONE_NUMBER("phone_number"),
        BOLD_TEXT("bold"),
        ITALIC_TEXT("italic"),
        CODE("code"),
        PRE("pre"),
        TEXT_LINK("text_link"),
        TEXT_MENTION("text_mention"),
        ALL("");

        private final String name;

        Type(String name) {
            this.name = name;
        }

        @Override
        public String stringName() {
            return name;
        }

        @Override

        public boolean isChosen() {
            return this != ALL;
        }
    }
}
