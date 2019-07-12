package io.github.oleksivio.tl.kbot.server.api.method.location

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.model.ApiDict
import io.github.oleksivio.tl.kbot.server.api.model.method.common.MessageAction
import io.github.oleksivio.tl.kbot.server.api.objects.ChatId
import io.github.oleksivio.tl.kbot.server.api.objects.std.keyboard.IKeyboard

/**
 * @see [sendVenue](https://core.telegram.org/bots/api/#sendvenue)
 */
data class SendVenue(
    /**
     *  chat_id Integer or [String] Optional Required if inline_message_id is not specified.
     * Unique identifier for the target chat
     */
    @JsonProperty(ApiDict.CHAT_ID_KEY)
    override val chatId: ChatId,
    /**
     * latitude Float number Yes Latitude of new location
     */
    @JsonProperty(ApiDict.LATITUDE_KEY)
    val latitude: Double,
    /**
     * longitude Float number Yes Longitude of new location
     */
    @JsonProperty(ApiDict.LONGITUDE_KEY)
    val longitude: Double,
    /**
     * title String Name of the venue
     */
    @JsonProperty("title")
    val title: String,
    /**
     * address String Address of the venue
     */
    @JsonProperty("address")
    val address: String,
    /**
     * foursquare_id [String] Optional Foursquare identifier of the venue
     */
    @JsonProperty("foursquare_id")
    val foursquareId: String? = null,
    /**
     * foursquare_type [String] Optional. Foursquare type of the venue. (For example,
     * “arts_entertainment/default”, “arts_entertainment/aquarium” or “food/icecream”.)
     */
    @JsonProperty("foursquare_type")
    val foursquareType: String? = null,
    /**
     * disable_notification [Boolean] OptionalSends the message silently.
     * Users will receive a notification with no sound.
     */
    @JsonProperty(ApiDict.DISABLE_NOTIFICATION_KEY)
    override val disableNotification: Boolean? = null,
    /**
     * reply_to_message_id [Integer] OptionalIf the message is a reply, ID of the original message
     */
    @JsonProperty(ApiDict.REPLY_TO_MESSAGE_ID_KEY)
    override val replyToMessageId: Long? = null,
    /**
     * reply_markup
     * InlineKeyboardMarkup or ReplyKeyboardMarkup or ReplyKeyboardRemove or ForceReply
     * Optional
     * Additional interface options.
     * A JSON-serialized object for an inline keyboard, custom reply keyboard,
     * instructions to remove reply keyboard or to force a reply from the user.
     */
    @JsonProperty(ApiDict.REPLY_MARKUP_KEY)
    override val replyMarkup: IKeyboard? = null

) : MessageAction() {

    override val method = "sendVenue"
}
