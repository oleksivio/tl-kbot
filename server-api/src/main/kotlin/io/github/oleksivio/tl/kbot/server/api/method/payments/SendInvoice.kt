package io.github.oleksivio.tl.kbot.server.api.method.payments

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.tl.kbot.server.api.model.ApiDict
import io.github.oleksivio.tl.kbot.server.api.model.MessageResponse
import io.github.oleksivio.tl.kbot.server.api.model.method.common.ChatAction
import io.github.oleksivio.tl.kbot.server.api.objects.ChatId
import io.github.oleksivio.tl.kbot.server.api.objects.payments.LabeledPrice
import io.github.oleksivio.tl.kbot.server.api.objects.std.Message
import io.github.oleksivio.tl.kbot.server.api.objects.std.keyboard.InlineKeyboardMarkup

/**
 * @see [sendInvoice](https://core.telegram.org/bots/api/#sendinvoice)
 */
data class SendInvoice(
    /**
     * chat_id Integer Yes Unique identifier for the target private chat
     */
    override val chatId: ChatId,
    /**
     * title String Yes Product name, 1-32 characters
     */
    @JsonProperty("title")
    val title: String,
    /**
     * description String Yes Product description, 1-255 characters
     */
    @JsonProperty("description")
    val description: String,
    /**
     * payload String Yes Bot-defined invoice payload, 1-128 bytes. This will not be displayed to the user, use for
     * your internal processes.
     */
    @JsonProperty("payload")
    val payload: String,
    /**
     * provider_token String Yes Payments provider token, obtained via Botfather
     */
    @JsonProperty("provider_token")
    val providerToken: String,
    /**
     * start_parameter String Yes Unique deep-linking parameter that can be used to generate this invoice when used as
     * a start parameter
     */
    @JsonProperty("start_parameter")
    val startParameter: String,
    /**
     * currency String Yes Three-letter ISO 4217 currency code, see more on currencies
     */
    @JsonProperty("currency")
    val currency: String,
    /**
     * prices Array of LabeledPrice Yes Price breakdown, a list of components (e.g. product price, tax, discount,
     * delivery cost, delivery tax, bonus, etc.)
     */
    @JsonProperty("prices")
    val prices: List<LabeledPrice>,
    /**
     * provider_data [String] Optional JSON-encoded data about the invoice, which will be shared with the payment
     * provider. A detailed description of required fields should be provided by the payment provider.
     */
    @JsonProperty("provider_data")
    val providerData: String? = null,
    /**
     * photo_url [String] Optional URL of the product photo for the invoice. Can be a photo of the goods or a marketing
     * image for a service. People like it better when they see what they are paying for.
     */
    @JsonProperty("photo_url")
    val photoUrl: String? = null,
    /**
     * photo_size [Integer] OptionalPhoto size
     */
    @JsonProperty("photo_size")
    val photoSize: Int? = null,
    /**
     * photo_width [Integer] OptionalPhoto width
     */
    @JsonProperty("photo_width")
    val photoWidth: Int? = null,
    /**
     * photo_height [Integer] OptionalPhoto height
     */
    @JsonProperty("photo_height")
    val photoHeight: Int? = null,
    /**
     * need_name [Boolean] OptionalPass True, if you require the user's full name to complete the order
     */
    @JsonProperty("need_name")
    val needName: Boolean? = null,
    /**
     * need_phone_number [Boolean] OptionalPass True, if you require the user's phone number to complete the order
     */
    @JsonProperty("need_phone_number")
    val needPhoneNumber: Boolean? = null,
    /**
     * need_email [Boolean] OptionalPass True, if you require the user's email address to complete the order
     */
    @JsonProperty("need_email")
    val needEmail: Boolean? = null,
    /**
     * need_shipping_address [Boolean] OptionalPass True, if you require the user's shipping address to complete the order
     */
    @JsonProperty("need_shipping_address")
    val needShippingAddress: Boolean? = null,
    /**
     * send_phone_number_to_provider [Boolean] OptionalPass True, if user's phone number should be sent to provider
     */
    @JsonProperty("send_phone_number_to_provider")
    val sendPhoneNumberToProvider: Boolean? = null,
    /**
     * send_email_to_provider [Boolean] OptionalPass True, if user's email address should be sent to provider
     */
    @JsonProperty("send_email_to_provider")
    val sendEmailToProvider: Boolean? = null,
    /**
     * is_flexible [Boolean] OptionalPass True, if the final price depends on the shipping method
     */
    @JsonProperty("is_flexible")
    val isFlexible: Boolean? = null,
    /**
     * disable_notification [Boolean] OptionalSends the message silently. Users will receive a notification with no sound.
     */
    @JsonProperty("disable_notification")
    val disableNotification: Boolean? = null,
    /**
     * reply_to_message_id [Integer] OptionalIf the message is a reply, ID of the original message
     */
    @JsonProperty("reply_to_message_id")
    val replyToMessageId: Int? = null,
    /**
     * reply_markup InlineKeyboardMarkup Optional A JSON-serialized object for an inline keyboard. If empty, one 'Pay total price' button will be shown. If not empty, the first button must be a Pay button.
     */
    @JsonProperty("reply_markup")
    val replyMarkup: InlineKeyboardMarkup? = null

) : ChatAction<Message>() {

    @JsonProperty(ApiDict.METHOD_KEY)
    override val method = "sendInvoice"
    @JsonIgnore
    override val resultWrapperClass = MessageResponse::class
}
