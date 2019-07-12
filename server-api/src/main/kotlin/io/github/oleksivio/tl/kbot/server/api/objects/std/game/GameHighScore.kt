package io.github.oleksivio.tl.kbot.server.api.objects.std.game

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.model.ITelegram
import io.github.oleksivio.tl.kbot.server.api.objects.std.User

/**
 *  [GameHighScore](https://core.telegram.org/bots/api/#gamehighscore)
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
