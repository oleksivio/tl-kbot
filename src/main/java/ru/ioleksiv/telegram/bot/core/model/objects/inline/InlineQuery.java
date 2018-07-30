package ru.ioleksiv.telegram.bot.core.model.objects.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.model.objects.std.Location;
import ru.ioleksiv.telegram.bot.core.model.objects.std.User;

/**
 * @see <a href="https://core.telegram.org/bots/api#inlinequery>InlineQuery</a>
 */
public class InlineQuery {
    /**
     * id	String	Unique identifier for this query
     */
    @JsonProperty("id")
    private String id = null;
    /**
     * from	User	Sender
     */
    @JsonProperty("from")
    private User from = null;
    /**
     * location	Location	Optional. Sender location, only for bots that request user location
     */
    @JsonProperty("location")
    private Location location = null;
    /**
     * query	String	Text of the query (up to 512 characters)
     */
    @JsonProperty("query")
    private String query = null;
    /**
     * offset	String	Offset of the results to be returned, can be controlled by the bot
     */
    @JsonProperty("offset")
    private String offset = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getFrom() {
        return from;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }
}