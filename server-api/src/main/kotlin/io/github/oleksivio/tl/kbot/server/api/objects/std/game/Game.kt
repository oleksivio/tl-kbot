package io.github.oleksivio.tl.kbot.server.api.objects.std.game

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.model.ITelegram
import io.github.oleksivio.tl.kbot.server.api.objects.std.MessageEntity
import io.github.oleksivio.tl.kbot.server.api.objects.std.files.PhotoSize

/**
 *  [Game](https://core.telegram.org/bots/api/#game)
 */
data class Game(
    /**
     * To setup filter:
     *
     *  StringFilter title title String Title of the game
     */
    @JsonProperty("title")
    var title: String? = null,
    /**
     * To setup filter:
     *
     *  StringFilter description description String Description of the game
     */
    @JsonProperty("description")
    var description: String? = null,
    /**
     * To setup filter:
     *
     *  PhotoArrayFilter photoArray photo Array of PhotoSize Photo that will be displayed in the game message in
     * chats.
     */
    @JsonProperty("photo")
    var photo: List<PhotoSize>? = null,
    /**
     * To setup filter:
     *
     *  StringFilter text text [String] Optional. Brief description of the game or high scores included in the game
     * message. Can be automatically edited to include current high scores for the game when the bot calls setGameScore,
     * or manually edited using editMessageText. 0-4096 characters.
     */
    @JsonProperty("text")
    var text: String? = null,
    /**
     * To setup filter:
     *
     *  MessageEntityArrayFilter textEntityArray text_entities Array of MessageEntity Optional. Special entities that
     * appear in text, such as usernames, URLs, bot commands, etc.
     */
    @JsonProperty("text_entities")
    var textEntities: List<MessageEntity>? = null,
    /**
     * To setup filter:
     *
     *  AnimationFilter animation animation Animation Optional. Animation that will be displayed in the game message
     * in chats. Upload via BotFather
     */
    @JsonProperty("animation")
    var animation: Animation? = null
) : ITelegram
