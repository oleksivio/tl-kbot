package io.github.oleksivio.telegram.bot.api.model.objects.std.files.inputmedia

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @see [InputMediaPhoto](https://core.telegram.org/bots/api/#inputmediaphoto)
 */
data class InputMediaPhoto(
        /**
         * type String Type of the result, must be photo
         */
        @JsonProperty("type")
        override var type: String? = null,
        /**
         * media String File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended), pass an
         * HTTP URL for Telegram to get a file from the Internet, or pass "attach://<file_attach_name>" to upload a new one
         * using multipart/form-data under <file_attach_name> name.
        </file_attach_name></file_attach_name> */
        @JsonProperty("media")
        override var media: String? = null,
        /**
         * caption String Optional. Caption of the photo to be sent, 0-200 characters
         */
        @JsonProperty("caption")
        override var caption: String? = null,
        /**
         * parse_mode String Optional. Send Markdown or HTML, if you want Telegram apps to show bold, italic, fixed-width text
         * or inline URLs in the media caption.
         */
        @JsonProperty("parse_mode")
        override var parseMode: String? = null

) : InputMedia
