package ru.ioleksiv.telegram.bot.api.model.objects.std.game;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.AnimationFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.MessageEntityArrayFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.PhotoArrayFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.std.MessageEntity;
import ru.ioleksiv.telegram.bot.api.model.objects.std.files.PhotoSize;
import ru.ioleksiv.telegram.bot.core.model.ITelegram;

import java.util.List;

/**
 * @see <a href="https://core.telegram.org/bots/api#game">Game</a>
 */
public class Game implements ITelegram {
    /**
     * To setup filter:
     *
     * @see StringFilter title
     * title String Title of the game
     */
    @JsonProperty("title")
    private String title = null;
    /**
     * To setup filter:
     *
     * @see StringFilter description
     * description String Description of the game
     */
    @JsonProperty("description")
    private String description = null;
    /**
     * To setup filter:
     *
     * @see PhotoArrayFilter photoArray
     * photo Array of PhotoSize Photo that will be displayed in the game message in chats.
     */
    @JsonProperty("photo")
    private List<PhotoSize> photo = null;
    /**
     * To setup filter:
     *
     * @see StringFilter text
     * text String Optional. Brief description of the game or high scores included in the game message.
     * Can be automatically edited to include current high scores for the game when the bot calls setGameScore,
     * or manually edited using editMessageText. 0-4096 characters.
     */
    @JsonProperty("text")
    private String text = null;
    /**
     * To setup filter:
     *
     * @see MessageEntityArrayFilter textEntityArray
     * text_entities Array of MessageEntity Optional. Special entities that appear in text, such as usernames, URLs,
     * bot commands, etc.
     */
    @JsonProperty("text_entities")
    private List<MessageEntity> textEntities = null;
    /**
     * To setup filter:
     *
     * @see AnimationFilter animation
     * animation Animation Optional. Animation that will be displayed in the game message in chats. Upload via BotFather
     */
    @JsonProperty("animation")
    private Animation animation = null;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<PhotoSize> getPhoto() {
        return photo;
    }

    public void setPhoto(List<PhotoSize> photo) {
        this.photo = photo;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<MessageEntity> getTextEntities() {
        return textEntities;
    }

    public void setTextEntities(List<MessageEntity> textEntities) {
        this.textEntities = textEntities;
    }

    public Animation getAnimation() {
        return animation;
    }

    public void setAnimation(Animation animation) {
        this.animation = animation;
    }
}
