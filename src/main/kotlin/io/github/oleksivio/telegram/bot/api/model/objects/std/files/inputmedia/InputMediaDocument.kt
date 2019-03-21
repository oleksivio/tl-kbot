package io.github.oleksivio.telegram.bot.api.model.objects.std.files.inputmedia

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @see [InputMediaDocument](https://core.telegram.org/bots/api/#inputmediadocument)
 */
data class InputMediaDocument(
        /**
         * type String Type of the result, must be document
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
         * thumb InputFile or String Optional. Thumbnail of the file sent. The thumbnail should be in JPEG format and less
         * than 200 kB in size. A thumbnail‘s width and height should not exceed 90. Ignored if the file is not uploaded using
         * multipart/form-data. Thumbnails can’t be reused and can be only uploaded as a new file, so you can pass
         * “attach://<file_attach_name>” if the thumbnail was uploaded using multipart/form-data under <file_attach_name>.
        </file_attach_name></file_attach_name> */
        @JsonProperty("thumb")
        var thumb: String? = null,
        /**
         * caption String Optional. Caption of the video to be sent, 0-200 characters
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
