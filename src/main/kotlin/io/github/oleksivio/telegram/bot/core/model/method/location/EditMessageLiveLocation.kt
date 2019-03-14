package io.github.oleksivio.telegram.bot.core.model.method.location

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.method.EditAction

/**
 * @see [editMessageLiveLocation](https://core.telegram.org/bots/api.editmessagelivelocation)
 */
abstract class EditMessageLiveLocation<RES>(actionNetworker: ActionNetworker) : EditAction<RES>(METHOD, actionNetworker) {

    /**
     * latitude Float number Latitude of new location
     */
    @JsonProperty("latitude")
    var latitude: Double? = null
    /**
     * longitude Float number Longitude of new location
     */
    @JsonProperty("longitude")
    var longitude: Double? = null

    companion object {
        private const val METHOD = "editMessageLiveLocation"
    }
}
