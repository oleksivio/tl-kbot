package io.github.oleksivio.tl.kbot.server.api.objects.inline.queryresult

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *  [InlineQueryResultContact](https://core.telegram.org/bots/api/#inlinequeryresultcontact)
 */
data class InlineQueryResultContact(
        /**
         * phone_number String Contact's phone number
         */
        @JsonProperty("phone_number")
        var phoneNumber: String,
        /**
         * first_name String Contact's first name
         */
        @JsonProperty("firstName")
        var firstName: String,
        /**
         * last_name [String] Optional Contact's last name
         */
        @JsonProperty("last_name")
        var lastName: String? = null,
        /**
         * vcard [String] Optional Additional data about the contact in the form of a vCard, 0-2048 bytes
         */
        @JsonProperty("vcard")
        var vcard: String? = null,
        /**
         * thumb_url [String] Optional. URL of the thumbnail (jpeg only) for the file
         */
        @JsonProperty("thumb_url")
        var thumbUrl: String? = null,
        /**
         * thumb_width Integer Optional. Thumbnail width
         */
        @JsonProperty("thumb_width")
        var thumbWidth: Int? = null,
        /**
         * thumb_height Integer Optional. Thumbnail height
         */
        @JsonProperty("thumb_height")
        var thumbHeight: Int? = null,
        /**
         * type String Type of the result
         */
        @JsonProperty("type")
        val type: String = "contact"
) : ContentInlineResult()
