package io.github.oleksivio.telegram.bot.api.model.objects.inline.messagecontent

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *  [InputContactMessageContent](https://core.telegram.org/bots/api/#inputcontactmessagecontent)
 */
data class InputContactMessageContent(
        /**
         * phone_number String Contact's phone number
         */
        @JsonProperty("phone_number")
        var phoneNumber: String? = null,
        /**
         * first_name String Contact's first name
         */
        @JsonProperty("first_name")
        var firstName: String? = null,
        /**
         * last_name [String] Optional. Contact's last name
         */
        @JsonProperty("last_name")
        var lastName: String? = null,
        /**
         * vcard [String] Optional. Additional data about the contact in the form of a vCard, 0-2048 bytes
         */
        @JsonProperty("vcard")
        var vCard: String? = null
) : InputMessageContent
