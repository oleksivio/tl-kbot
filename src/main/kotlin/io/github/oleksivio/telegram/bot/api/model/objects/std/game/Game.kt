package io.github.oleksivio.telegram.bot.api.model.objects.std.game

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.AnimationFilter
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.MessageEntityArrayFilter
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.PhotoArrayFilter
import io.github.oleksivio.telegram.bot.api.model.objects.std.MessageEntity
import io.github.oleksivio.telegram.bot.api.model.objects.std.files.PhotoSize
import io.github.oleksivio.telegram.bot.core.model.ITelegram

/**
 * @see [Game](https://core.telegram.org/bots/api/#game)
 */
data class Game(
        /**
         * To setup filter:
         *
         * @see StringFilter title title String Title of the game
         */
        @JsonProperty("title")
        var title: String? = null,
        /**
         * To setup filter:
         *
         * @see StringFilter description description String Description of the game
         */
        @JsonProperty("description")
        var description: String? = null,
        /**
         * To setup filter:
         *
         * @see PhotoArrayFilter photoArray photo Array of PhotoSize Photo that will be displayed in the game message in
         * chats.
         */
        @JsonProperty("photo")
        var photo: List<PhotoSize>? = null,
        /**
         * To setup filter:
         *
         * @see StringFilter text text String Optional. Brief description of the game or high scores included in the game
         * message. Can be automatically edited to include current high scores for the game when the bot calls setGameScore,
         * or manually edited using editMessageText. 0-4096 characters.
         */
        @JsonProperty("text")
        var text: String? = null,
        /**
         * To setup filter:
         *
         * @see MessageEntityArrayFilter textEntityArray text_entities Array of MessageEntity Optional. Special entities that
         * appear in text, such as usernames, URLs, bot commands, etc.
         */
        @JsonProperty("text_entities")
        var textEntities: List<MessageEntity>? = null,
        /**
         * To setup filter:
         *
         * @see AnimationFilter animation animation Animation Optional. Animation that will be displayed in the game message
         * in chats. Upload via BotFather
         */
        @JsonProperty("animation")
        var animation: Animation? = null
) : ITelegram 
