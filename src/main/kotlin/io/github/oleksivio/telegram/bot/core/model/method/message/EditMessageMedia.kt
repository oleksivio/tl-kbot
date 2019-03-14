package io.github.oleksivio.telegram.bot.core.model.method.message

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.model.objects.std.files.inputmedia.InputMedia
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.method.EditAction

/**
 * @see [editMessageMedia](https://core.telegram.org/bots/api.editmessagemedia)
 */
abstract class EditMessageMedia<RES> protected constructor(actionNetworker: ActionNetworker) : EditAction<RES>(METHOD, actionNetworker) {
    /**
     * media InputMedia Yes A JSON-serialized object for a new media content of the message
     */
    @JsonProperty("media")
    var inputMedia: InputMedia? = null

    companion object {
        private const val METHOD = "editMessageMedia"
    }

}
