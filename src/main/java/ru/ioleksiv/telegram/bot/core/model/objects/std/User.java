package ru.ioleksiv.telegram.bot.core.model.objects.std;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    /**
     * id	Integer	Unique identifier for this user or bot
     */
    @JsonProperty("id")
    private long id = 0;
    /**
     * first_name	String	User‘s or bot’s first name
     */
    @JsonProperty("first_name")
    private String firstName = "";
    /**
     * last_name	String	Optional. User‘s or bot’s last name
     */
    @JsonProperty("last_name")
    private String lastName = "";
    /**
     * username	String	Optional. User‘s or bot’s username
     */
    @JsonProperty("username")
    private String username = "";
    /**
     * language_code	String	Optional. IETF language tag of the user's language
     */
    @JsonProperty("language_code")
    private String languageCode = "";
    /**
     * is_bot	Boolean	True, if this user is a bot
     */
    @JsonProperty("is_bot")
    private Boolean isBot = null;

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

    public boolean isBot() {
        return isBot;
    }

    public void setBot(boolean isBot) {
        this.isBot = isBot;
    }

}
