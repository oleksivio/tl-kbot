package io.github.oleksivio.telegram.bot.core.model.method.file

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.method.CaptionAction

abstract class ThumbAction(method: String, actionNetworker: ActionNetworker) : CaptionAction(method, actionNetworker) {
    /**
     * thumb String Optional Thumbnail of the file sent. The thumbnail should be
     * in JPEG format and less than 200 kB in size. A thumbnail‘s width and height should not exceed
     * 90. Ignored if the file is not uploaded using multipart/form-data. Thumbnails can’t be reused
     * and can be only uploaded as a new file, so you can pass “attach://<file_attach_name>” if the
     * thumbnail was uploaded using multipart/form-data under <file_attach_name>.
    </file_attach_name></file_attach_name> */
    @JsonProperty("thumb")
    val thumb: String? = null
}
