package io.github.oleksivio.telegram.bot.core.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.model.objects.Update
import io.github.oleksivio.telegram.bot.api.model.objects.WebhookInfo
import io.github.oleksivio.telegram.bot.api.model.objects.std.Chat
import io.github.oleksivio.telegram.bot.api.model.objects.std.ChatMember
import io.github.oleksivio.telegram.bot.api.model.objects.std.Message
import io.github.oleksivio.telegram.bot.api.model.objects.std.User
import io.github.oleksivio.telegram.bot.api.model.objects.std.files.File
import io.github.oleksivio.telegram.bot.api.model.objects.std.files.UserProfilePhotos
import io.github.oleksivio.telegram.bot.api.model.objects.std.game.GameHighScore
import io.github.oleksivio.telegram.bot.api.model.objects.std.sticker.StickerSet

/**
 * Created by oleksivio on 13.03.19 at 12:46
 * Project: telegram-bot-api
 */
@JsonIgnoreProperties(ignoreUnknown = true)
open class CommonResponse<T> {
    @JsonProperty("ok")
    var isStatus = false
    @JsonProperty("result")
    private var telegramObject: T? = null

    fun get(): T? {
        return telegramObject
    }

    fun set(telegramObject: T) {
        this.telegramObject = telegramObject
    }

}

class WebhookInfoResponse : CommonResponse<WebhookInfo>()

class ChatResponse : CommonResponse<Chat>()

class BooleanResponse : CommonResponse<Boolean>()

class ChatMemberResponse : CommonResponse<ChatMember>()

class ChatMembersResponse : CommonResponse<List<ChatMember>>()

class FileResponse : CommonResponse<File>()

class GameHighScoresResponse : CommonResponse<List<GameHighScore>>()

class IntegerResponse : CommonResponse<Int>()

class MessageResponse : CommonResponse<Message>()

class StickerSetResponse : CommonResponse<StickerSet>()

class StringResponse : CommonResponse<String>()

class UpdatesArrayResponse : CommonResponse<List<Update>>()

class UserProfilePhotosResponse : CommonResponse<UserProfilePhotos>()

class UserResponse : CommonResponse<User>()

