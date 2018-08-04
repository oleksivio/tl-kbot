package ru.ioleksiv.telegram.bot.core.api.model.objects.inline.queryresult;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <a href="https://core.telegram.org/bots/api#inlinequeryresultgame>InlineQueryResultGame</a>
 */
public class InlineQueryResultGame extends InlineQueryResult {
    private static final String TYPE = "game";
    /**
     * game_short_name	String	Short name of the game
     */
    @JsonProperty("game_short_name")
    private String gameShortName = null;

    InlineQueryResultGame() {
        super(TYPE);
    }
}