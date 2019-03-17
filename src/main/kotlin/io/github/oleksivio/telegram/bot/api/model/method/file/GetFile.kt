package io.github.oleksivio.telegram.bot.api.model.method.file

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.model.objects.std.files.File
import io.github.oleksivio.telegram.bot.core.model.ApiDict
import io.github.oleksivio.telegram.bot.core.model.FileResponse
import io.github.oleksivio.telegram.bot.core.model.method.Action

/**
 * @see [getFile](https://core.telegram.org/bots/api/#getfile)
 */
data class GetFile(
        /**
         * file_id String  File identifier to get info about
         */
        @JsonProperty("file_id")
        val fileId: String

) : Action<File>() {
    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "getFile"
    @JsonIgnore
    override val resultWrapperClass = FileResponse::class
}
