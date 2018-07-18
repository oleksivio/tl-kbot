package ru.ioleksiv.telegram.bot.core.model.telegram.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.jetbrains.annotations.NotNull;
import ru.ioleksiv.telegram.bot.core.model.telegram.interfaces.ITelegram;

public class User implements ITelegram {
    @JsonProperty("id")
    private long mId = 0;
    @JsonProperty("first_name")
    @NotNull
    private String mFirstName = "";
    @JsonProperty("last_name")
    @NotNull
    private String mLastName = "";
    @JsonProperty("username")
    @NotNull
    private String mUsername = "";
    @JsonProperty("language_code")
    private String mLanguageCode = "";
    @JsonProperty("is_bot")
    private boolean mIsBot = false;

    @Override
    public String toString() {
        return "User{" +
                "id:" + mId +
                ", first_name:'" + mFirstName + '\'' +
                ", last_name:'" + mLastName + '\'' +
                ", username:'" + mUsername + '\'' +
                ", language_code:'" + mLanguageCode + '\'' +
                ", is_bot:" + mIsBot +
                '}';
    }

    @NotNull
    public long getId() {
        return mId;
    }

    public void setId(long id) {
        mId = id;
    }

    @NotNull
    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(@NotNull String firstName) {
        mFirstName = firstName;
    }

    @NotNull
    public String getLastName() {
        return mLastName;
    }

    public void setLastName(@NotNull String lastName) {
        mLastName = lastName;
    }

    @NotNull
    public String getUsername() {
        return mUsername;
    }

    public void setUsername(@NotNull String username) {
        mUsername = username;
    }

    @NotNull
    public String getLanguageCode() {
        return mLanguageCode;
    }

    public void setLanguageCode(@NotNull String languageCode) {
        mLanguageCode = languageCode;
    }

    public boolean isIsBot() {
        return mIsBot;
    }

    public void setIsBot(boolean isBot) {
        mIsBot = isBot;
    }

}
