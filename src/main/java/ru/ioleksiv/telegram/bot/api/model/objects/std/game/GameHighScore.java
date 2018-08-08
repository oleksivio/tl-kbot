package ru.ioleksiv.telegram.bot.api.model.objects.std.game;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.api.model.objects.std.User;
import ru.ioleksiv.telegram.bot.core.model.ITelegram;

/**
 * @see <a href="https://core.telegram.org/bots/api#gamehighscore>GameHighScore</a>
 */
public class GameHighScore implements ITelegram {
    /**
     * position	Integer	Position in high score table for the game
     */
    @JsonProperty("position")
    private Integer position = null;
    /**
     * user	User	User
     */
    @JsonProperty("user")
    private User user = null;
    /**
     * score	Integer	Score
     */
    @JsonProperty("score")
    private Integer score = null;

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
