package io.github.oleksivio.telegram.bot.api.model.method.group

import io.github.oleksivio.telegram.bot.core.model.ApiDict
import io.github.oleksivio.telegram.bot.core.model.BooleanResponse
import io.github.oleksivio.telegram.bot.core.model.method.ActionMap
import io.github.oleksivio.telegram.bot.core.model.method.file.UploadFile
import org.springframework.core.io.FileSystemResource

/**
 * @see [setChatPhoto](https://core.telegram.org/bots/api/#setchatphoto)
 */
data class SetChatPhoto(

        /**
         * chat_id Integer or String Unique identifier for the target chat or username of the
         * target channel (in the format @channelusername)
         */
        val chatId: Long,
        /**
         * photo InputFile New chat photo, uploaded using multipart/form-data
         */
        val photo: FileSystemResource

) : UploadFile<Boolean>() {
    override fun ActionMap.fill() {
        putFile(ApiDict.PHOTO_KEY, photo)
        putLong(ApiDict.CHAT_ID_KEY, chatId)
    }

    override val resultWrapperClass = BooleanResponse::class

    override val method = "setChatPhoto"
}
