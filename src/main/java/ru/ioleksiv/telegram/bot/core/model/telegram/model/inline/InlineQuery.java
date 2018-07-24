package ru.ioleksiv.telegram.bot.core.model.telegram.model.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.core.model.telegram.interfaces.ITelegram;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.type.Location;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.type.User;

public class InlineQuery implements ITelegram {
    private static final Logger LOGGER = LoggerFactory.getLogger(InlineQuery.class);
    /**
     * id
     * <p>
     * String
     * <p>
     * Unique identifier for this query
     */
    private String mId = "";
    /**
     * from
     * <p>
     * User
     * <p>
     * Sender
     */
    private User mSender = null;
    /**
     * location
     * <p>
     * Location
     * <p>
     * Optional. Sender location, only for bots that update user location
     */
    @Nullable
    private Location mLocation;
    /**
     * query
     * <p>
     * String
     * <p>
     * Text of the query (up to 512 characters)
     */
    @NotNull
    private String mQuery = "";
    /**
     * offset
     * <p>
     * String
     * <p>
     * Offset of the results to be returned, can be controlled by the bot
     */
    @NotNull
    private String mOffset = "";

    @JsonProperty("id")
    @NotNull
    public String getId() {
        return mId;
    }

    @JsonProperty("id")
    public void setId(@NotNull String id) {
        mId = id;
    }

    @Nullable
    @JsonProperty("location")
    public Location getLocation() {
        return mLocation;
    }

    @JsonProperty("location")
    public void setLocation(Location location) {
        mLocation = location;
    }

    @JsonProperty("query")
    @NotNull
    public String getQuery() {
        return mQuery;
    }

    @JsonProperty("query")
    public void setQuery(@NotNull String query) {
        mQuery = query;
    }

    @JsonProperty("offset")
    @NotNull
    public String getOffset() {
        return mOffset;
    }

    public void setOffset(@NotNull String offset) {
        mOffset = offset;
    }

    @JsonProperty("from")
    @NotNull
    public User getSender() {
        return mSender;
    }

    @JsonProperty("from")
    public void setSender(@NotNull User sender) {
        mSender = sender;
    }
}
