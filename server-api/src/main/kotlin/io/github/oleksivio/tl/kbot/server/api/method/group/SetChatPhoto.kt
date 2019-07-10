package io.github.oleksivio.tl.kbot.server.api.method.group

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.model.ApiDict
import io.github.oleksivio.tl.kbot.server.api.model.BooleanResponse
import io.github.oleksivio.tl.kbot.server.api.model.method.Action
import io.github.oleksivio.tl.kbot.server.api.objects.ChatId
import io.github.oleksivio.tl.kbot.server.api.objects.InputFile

/**
 * @see [setChatPhoto](https://core.telegram.org/bots/api/#setchatphoto)
 */
data class SetChatPhoto(

    /**
     * chat_id Integer or String Unique identifier for the target chat or username of the
     * target channel (in the format @channelusername)
     */
    @JsonProperty(ApiDict.CHAT_ID_KEY)
    val chatId: ChatId,
    /**
     * photo InputFile New chat photo, uploaded using multipart/form-data
     */
    @JsonProperty(ApiDict.PHOTO_KEY)
    val photo: InputFile

) : Action<Boolean>() {

    @JsonIgnore
    override val resultWrapperClass = BooleanResponse::class

    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "setChatPhoto"
}
