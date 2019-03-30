package io.github.oleksivio.telegram.bot.api.model.objects.inline.queryresult

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *  [InlineQueryResultGame](https://core.telegram.org/bots/api/#inlinequeryresultgame)
 */
class InlineQueryResultGame(
        /**
         * game_short_name String Short name of the game
         */
        @JsonProperty("game_short_name")
        val gameShortName: String,
        /**
         * type String Type of the result
         */
        @JsonProperty("type")
        val type: String = "game"
) : InlineQueryResult()
