package io.github.oleksivio.telegram.bot.api.model.method.file

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.model.objects.std.files.File
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.FileResponse
import io.github.oleksivio.telegram.bot.core.model.method.RunnableAction

/**
 * @see [getFile](https://core.telegram.org/bots/api.getfile)
 */
class GetFile(actionNetworker: ActionNetworker) : RunnableAction<File>(METHOD, actionNetworker) {
    /**
     * file_id String  File identifier to get info about
     */
    @JsonProperty("file_id")
    var fileId: String? = null

    override val resultWrapperClass = FileResponse::class

    companion object {
        private const val METHOD = "getFile"
    }
}
