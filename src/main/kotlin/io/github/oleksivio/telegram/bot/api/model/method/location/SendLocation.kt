package io.github.oleksivio.telegram.bot.api.model.method.location

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard.IKeyboard
import io.github.oleksivio.telegram.bot.core.model.ApiDict
import io.github.oleksivio.telegram.bot.core.model.method.common.MessageAction

/**
 * @see [sendLocation](https://core.telegram.org/bots/api/#sendlocation)
 */
data class SendLocation(
        /**
         *  Unique identifier for the target chat or username of the target channel
         */
        @JsonProperty(ApiDict.CHAT_ID_KEY)
        override val chatId: Long,
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
         * live_period Integer Optional Period in seconds for which the location will be
         * updated (see Live Locations, should be between 60 and 86400
         */
        @JsonProperty(ApiDict.LIVE_PERIOD_KEY)
        val livePeriod: Int? = null,
        /**
         * disable_notification Boolean Optional Sends the message silently.
         * Users will receive a notification with no sound.
         */
        @JsonProperty(ApiDict.DISABLE_NOTIFICATION_KEY)
        override val disableNotification: Boolean? = null,
        /**
         * reply_to_message_id Integer Optional If the message is a reply, ID of the original message
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
    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "sendLocation"

}
