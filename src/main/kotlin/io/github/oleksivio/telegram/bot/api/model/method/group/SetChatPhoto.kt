package io.github.oleksivio.telegram.bot.api.model.method.group

import io.github.oleksivio.telegram.bot.core.controller.network.FileNetworker
import io.github.oleksivio.telegram.bot.core.model.BooleanResponse
import io.github.oleksivio.telegram.bot.core.model.method.UploadFile
import org.springframework.core.io.FileSystemResource

/**
 * @see [setChatPhoto](https://core.telegram.org/bots/api.setchatphoto)
 */
class SetChatPhoto(fileNetworker: FileNetworker) : UploadFile<Boolean>(METHOD, fileNetworker) {

    override val resultWrapperClass = BooleanResponse::class

    fun setPhoto(photo: FileSystemResource) {
        putFile(PHOTO_KEY, photo)

    }

    fun setChatId(chatId: Long?) {
        putLong(CHAT_ID_KEY, chatId)

    }

    companion object {
        private const val METHOD = "setChatPhoto"

        /**
         * chat_id Integer or String Unique identifier for the target chat or username of the
         * target channel (in the format @channelusername)
         */
        private const val CHAT_ID_KEY = "chat_id"
        /**
         * photo InputFile New chat photo, uploaded using multipart/form-data
         */
        private const val PHOTO_KEY = "photo"
    }

}
