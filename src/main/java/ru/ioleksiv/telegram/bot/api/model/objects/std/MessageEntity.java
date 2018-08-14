package ru.ioleksiv.telegram.bot.api.model.objects.std;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.UserFilter;
import ru.ioleksiv.telegram.bot.core.model.ITelegram;

/**
 * @see <a href="https://core.telegram.org/bots/api#messageentity">MessageEntity</a>
 */
public class MessageEntity implements ITelegram {
    public static final String TYPE_MENTION = "mention";
    public static final String TYPE_HASHTAG = "hashtag";
    public static final String TYPE_CASHTAG = "cashtag";
    public static final String TYPE_BOT_COMMAND = "bot_command";
    public static final String TYPE_URL = "url";
    public static final String TYPE_EMAIL = "email";
    public static final String TYPE_PHONE_NUMBER = "phone_number";
    public static final String TYPE_BOLD_TEXT = "bold";
    public static final String TYPE_ITALIC_TEXT = "italic";
    public static final String TYPE_CODE = "code";
    public static final String TYPE_PRE = "pre";
    public static final String TYPE_TEXT_LINK = "text_link";
    public static final String TYPE_TEXT_MENTION = "text_mention";
    /**
     * To setup filter:
     *
     * @see StringFilter type
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
}