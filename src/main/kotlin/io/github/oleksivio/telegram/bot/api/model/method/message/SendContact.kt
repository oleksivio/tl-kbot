package io.github.oleksivio.telegram.bot.api.model.method.message

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.method.MessageAction

/**
 * @see [sendContact](https://core.telegram.org/bots/api.sendcontact)
 */
class SendContact(actionNetworker: ActionNetworker) : MessageAction(METHOD, actionNetworker) {
    /**
     * phone_number String Contact's phone number
     */
    @JsonProperty("phone_number")
    var phoneNumber: String? = null
    /**
     * first_name String Contact's first name
     */
    @JsonProperty("firstName")
    var firstName: String? = null
    /**
     * last_name String Optional Contact's last name
     */
    @JsonProperty("last_name")
    var lastName: String? = null
    /**
     * vcard String Optional Additional data about the contact in the form of a vCard, 0-2048 bytes
     */
    @JsonProperty("vcard")
    var vcard: String? = null

    companion object {
        private const val METHOD = "sendContact"
    }
}
