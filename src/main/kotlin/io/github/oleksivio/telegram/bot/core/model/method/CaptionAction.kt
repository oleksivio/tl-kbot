package io.github.oleksivio.telegram.bot.core.model.method

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker

abstract class CaptionAction protected
constructor(method: String, actionNetworker: ActionNetworker)
    : FormattedMessageAction(method, actionNetworker) {

    /**
     * caption String Optional File caption (may also be used when resending file by file_id),
     * 0-200 characters
     */
    @JsonProperty("caption")
    var caption: String? = null

}
