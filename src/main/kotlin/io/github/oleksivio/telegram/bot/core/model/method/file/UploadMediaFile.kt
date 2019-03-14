package io.github.oleksivio.telegram.bot.core.model.method.file

import io.github.oleksivio.telegram.bot.core.controller.network.FileNetworker
import io.github.oleksivio.telegram.bot.core.model.method.UploadMessageFile

abstract class UploadMediaFile protected constructor(method: String, fileNetworker: FileNetworker) : UploadMessageFile(method, fileNetworker) {
    companion object {
        /**
         * caption String Optional File caption (may also be used when resending file by file_id),
         * 0-200 characters
         */
        const val CAPTION_KEY = "caption"
        /**
         * parse_mode String Optional Send Markdown or HTML, if you want Telegram apps to show bold,
         * italic, fixed-width text or inline URLs in your bot's message.
         */
        const val PARSE_MODE_KEY = "parse_mode"
    }
}
