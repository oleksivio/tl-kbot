package ru.ioleksiv.telegram.bot.api.model.objects.std;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.BooleanFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.UserFilter;
import ru.ioleksiv.telegram.bot.core.model.ITelegram;

/**
 * To setup filter:
 *
 * @see UserFilter
 * @see <a href="https://core.telegram.org/bots/api#user">User</a>
 */
public class User implements ITelegram {
    /**
     * id Integer Unique identifier for this user or bot
     */
    @JsonProperty("id")
    private long id = 0;
    /**
     * To setup filter:
     *
     * @see StringFilter firstName
     * first_name String User‘s or bot’s first name
     */
    @JsonProperty("first_name")
    private String firstName = "";
    /**
     * To setup filter:
     *
     * @see StringFilter lastName
     * last_name String Optional. User‘s or bot’s last name
     */
    @JsonProperty("last_name")
    private String lastName = "";
    /**
     * To setup filter:
     *
     * @see StringFilter username
     * username String Optional. User‘s or bot’s username
     */
    @JsonProperty("username")
    private String username = "";
    /**
     * To setup filter:
     *
     * @see StringFilter languageCode
     * language_code String Optional. IETF language tag of the user's language
     */
    @JsonProperty("language_code")
    private String languageCode = "";
    /**
     * To setup filter:
     *
     * @see BooleanFilter isBot
     * is_bot Boolean True, if this user is a bot
     */
    @JsonProperty("is_bot")
    private Boolean isBot = null;

    public Boolean getIsBot() {
        return isBot;
    }

    public void setIsBot(Boolean bot) {
        isBot = bot;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

}
