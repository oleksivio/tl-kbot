package io.github.oleksivio.telegram.bot.api.model.objects

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.*
import io.github.oleksivio.telegram.bot.api.annotations.receiver.*
import io.github.oleksivio.telegram.bot.api.model.objects.inline.ChosenInlineResult
import io.github.oleksivio.telegram.bot.api.model.objects.inline.InlineQuery
import io.github.oleksivio.telegram.bot.api.model.objects.payments.PreCheckoutQuery
import io.github.oleksivio.telegram.bot.api.model.objects.payments.ShippingQuery
import io.github.oleksivio.telegram.bot.api.model.objects.std.CallbackQuery
import io.github.oleksivio.telegram.bot.api.model.objects.std.Message
import io.github.oleksivio.telegram.bot.core.model.ITelegram

/**
 * @see [Update](https://core.telegram.org/bots/api/#update)
 */
data class Update(
        /**
         * update_id
         *
         *
         * Integer
         *
         *
         * The update's unique identifier. Update identifiers start from a certain positive number and increase sequentially.
         * This ID becomes especially handy if you’re using Webhooks, since it allows you to ignore repeated updates or to
         * restore the correct update sequence, should they get out of order. If there are no new updates for at least a week,
         * then identifier of the next update will be chosen randomly instead of sequentially.
         */
        @JsonProperty("update_id")
        var updateId: Long = 0,
        /**
         * @see MessageReceiver for create reciver
         *
         * @see MessageFilter for setup filter message
         *
         *
         * Message
         *
         *
         * Optional. New incoming message of any kind — text, photo, sticker, etc.
         */
        @JsonProperty("message")
        var message: Message? = null,
        /**
         * @see EditedMessageReceiver for create reciver
         *
         * @see MessageFilter for setup filter edited_message
         *
         *
         * Message
         *
         *
         * Optional. New version of a message that is known to the bot and was edited
         */
        @JsonProperty("edited_message")
        var editedMessage: Message? = null,
        /**
         * @see ChannelPostReceiver for create reciver
         *
         * @see MessageFilter for setup filter channel_post
         *
         *
         * Message
         *
         *
         * Optional. New incoming channel post of any kind — text, photo, sticker, etc.
         */
        @JsonProperty("channel_post")
        var channelPost: Message? = null,
        /**
         * @see EditedChannelPostReceiver for create reciver
         *
         * @see MessageFilter for setup filter edited_channel_post
         *
         *
         * Message
         *
         *
         * Optional. New version of a channel post that is known to the bot and was edited
         */
        @JsonProperty("edited_channel_post")
        var editedChannelPost: Message? = null,
        /**
         * @see InlineQueryReceiver for create reciver
         *
         * @see InlineQueryFilter for setup filter inline_query
         *
         *
         * InlineQueryText
         *
         *
         * Optional. New incoming inline query
         */
        @JsonProperty("inline_query")
        var inlineQuery: InlineQuery? = null,
        /**
         * @see ChosenInlineResultReceiver for create reciver
         *
         * @see ChosenInlineResultFilter for setup filter chosen_inline_result
         *
         *
         * ChosenInlineResult
         *
         *
         * Optional. The result of an inline query that was chosen by a user and sent to their chat partner.
         */
        @JsonProperty("chosen_inline_result")
        var chosenInlineResult: ChosenInlineResult? = null,
        /**
         * @see ShippingQueryReceiver for create reciver
         *
         * @see ShippingQueryFilter for setup filter callback_query
         *
         *
         * CallbackQuery
         *
         *
         * Optional. New incoming callback query
         */
        @JsonProperty("callback_query")
        var callbackQuery: CallbackQuery? = null,
        /**
         * @see ShippingQueryReceiver for create reciver
         *
         * @see ShippingQueryFilter for setup filter shipping_query
         *
         *
         * ShippingQuery
         *
         *
         * Optional. New incoming shipping query. Only for invoices with flexible price
         */
        @JsonProperty("shipping_query")
        var shippingQuery: ShippingQuery? = null,
        /**
         * @see PreCheckoutQueryReceiver for create reciver
         *
         * @see PreCheckoutQueryFilter for setup filter pre_checkout_query
         *
         *
         * PreCheckoutQuery
         *
         *
         * Optional. New incoming pre-checkout query. Contains full information about checkout
         */
        @JsonProperty("pre_checkout_query")
        var preCheckoutQuery: PreCheckoutQuery? = null

) : ITelegram
