package ru.ioleksiv.telegram.bot.core.model.telegram.model.type.files;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.type.User;

/**
 * @link https://core.telegram.org/bots/api#messageentity
 */
public class MessageEntity {
    /**
     * type	String	Type of the entity. Can be mention (@username), hashtag, bot_command, url, email,
     * bold (bold text), italic (italic text), code (monowidth string), pre (monowidth block),
     * text_link (for clickable text URLs), text_mention (for users without usernames)
     */
    @JsonProperty("type")
    private String type;
    /**
     * offset	Integer	Offset in UTF-16 code units to the start of the entity
     */
    @JsonProperty("offset")
    private String offset;
    /**
     * length	Integer	Length of the entity in UTF-16 code units
     */
    @JsonProperty("length")
    private Integer length;
    /**
     * url	String	Optional. For “text_link” only, url that will be opened after user taps on the text
     */
    @JsonProperty("url")
    private String url;
    /**
     * user	User	Optional. For “text_mention” only, the mentioned user
     */
    @JsonProperty("user")
    private User user;

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
