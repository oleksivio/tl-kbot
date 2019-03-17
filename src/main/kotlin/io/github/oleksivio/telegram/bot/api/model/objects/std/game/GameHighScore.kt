package io.github.oleksivio.telegram.bot.api.model.objects.std.game

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.model.objects.std.User
import io.github.oleksivio.telegram.bot.core.model.ITelegram

/**
 * @see [GameHighScore](https://core.telegram.org/bots/api/#gamehighscore)
 */
data class GameHighScore(
        /**
         * position Integer Position in high score table for the game
         */
        @JsonProperty("position")
        var position: Int? = null,
        /**
         * user User User
         */
        @JsonProperty("user")
        var user: User? = null,
        /**
         * score Integer Score
         */
        @JsonProperty("score")
        var score: Int? = null
) : ITelegram
