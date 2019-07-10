package io.github.oleksivio.tl.kbot.server.api.method.file

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.model.ApiDict
import io.github.oleksivio.tl.kbot.server.api.model.FileResponse
import io.github.oleksivio.tl.kbot.server.api.model.method.Action
import io.github.oleksivio.tl.kbot.server.api.objects.std.files.File

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
