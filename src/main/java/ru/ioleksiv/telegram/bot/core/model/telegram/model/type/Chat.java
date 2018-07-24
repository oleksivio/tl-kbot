package ru.ioleksiv.telegram.bot.core.model.telegram.model.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.model.telegram.interfaces.ITelegram;

/**
 * @link https://core.telegram.org/bots/api#chat
 */
public class Chat implements ITelegram {
    /**
     * id	Integer	Unique identifier for this chat. This number may be greater than 32 bits and some
     * programming languages may have difficulty/silent defects in interpreting it. But it is
     * smaller than 52 bits, so a signed 64 bit integer or double-precision float type are safe for
     * storing this identifier.
     */
    @JsonProperty("id")
    private long id = 0;
    /**
     * type	String	Type of chat, can be either “private”, “group”, “supergroup” or “channel”
     */
    @JsonProperty("type")
    private String type;
    /**
     * title	String	Optional. Title, for supergroups, channels and group chats
     */
    @JsonProperty("title")
    private String title;
    /**
     * username	String	Optional. Username, for private chats, supergroups and channels if available
     */
    @JsonProperty("username")
    private String username;

    /**
     * first_name	String	Optional. First name of the other party in a private chat
     */
    @JsonProperty("first_name")
    private String firstName;
    /**
     * last_name	String	Optional. Last name of the other party in a private chat
     */
    @JsonProperty("last_name")
    private String lastName;
    /**
     * all_members_are_administrators	Boolean	Optional. True if a group has ‘All Members Are Admins’ enabled.
     */
    @JsonProperty("all_members_are_administrators")
    private Boolean allMembersAreAdmin;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean getAllMembersAreAdmin() {
        return allMembersAreAdmin;
    }

    public void setAllMembersAreAdmin(Boolean allMembersAreAdmin) {
        this.allMembersAreAdmin = allMembersAreAdmin;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
