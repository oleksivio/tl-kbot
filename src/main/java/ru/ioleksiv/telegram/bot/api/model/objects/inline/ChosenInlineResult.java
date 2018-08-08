package ru.ioleksiv.telegram.bot.api.model.objects.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.api.annotations.filter.chosenresult.InlineMessageChosenInlineResult;
import ru.ioleksiv.telegram.bot.api.annotations.filter.chosenresult.LocationChosenInlineResult;
import ru.ioleksiv.telegram.bot.api.annotations.filter.chosenresult.QueryChosenInlineResult;
import ru.ioleksiv.telegram.bot.api.annotations.filter.chosenresult.UserChosenInlineResult;
import ru.ioleksiv.telegram.bot.api.model.objects.std.Location;
import ru.ioleksiv.telegram.bot.api.model.objects.std.User;
import ru.ioleksiv.telegram.bot.core.model.ITelegram;

/**
 * @see <a href="https://core.telegram.org/bots/api#choseninlineresult>ChosenInlineResult</a>
 */
public class ChosenInlineResult implements ITelegram {
    /**
     * result_id	String	The unique identifier for the result that was chosen
     */
    @JsonProperty("result_id")
    private String resultId = null;
    /**
     * To setup filter:
     * @see UserChosenInlineResult
     *
     * from	User	The user that chose the result
     */
    @JsonProperty("from")
    private User from = null;
    /**
     * To setup filter:
     * @see LocationChosenInlineResult
     *
     * location	Location	Optional. Sender location, only for bots that require user location
     */
    @JsonProperty("location")
    private Location location = null;
    /**
     * To setup filter:
     * @see InlineMessageChosenInlineResult
     *
     * inline_message_id	String	Optional. Identifier of the sent inline message. Available only if there is an
     * inline keyboard attached to the message.
     * Will be also received in callback queries and can be used to message the message.
     */
    @JsonProperty("inline_message_id")
    private String inlineMessageId = null;
    /**
     * To setup filter:
     * @see QueryChosenInlineResult
     *
     * query	String	The query that was used to obtain the result
     */
    @JsonProperty("query")
    private String query = null;

    public String getResultId() {
        return resultId;
    }

    public void setResultId(String resultId) {
        this.resultId = resultId;
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

    public String getInlineMessageId() {
        return inlineMessageId;
    }

    public void setInlineMessageId(String inlineMessageId) {
        this.inlineMessageId = inlineMessageId;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }
}
