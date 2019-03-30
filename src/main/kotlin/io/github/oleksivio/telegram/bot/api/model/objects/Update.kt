package io.github.oleksivio.telegram.bot.api.model.objects

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.oleksivio.telegram.bot.api.annotations.filter.composite.MessageFilter
import io.github.oleksivio.telegram.bot.api.model.objects.inline.ChosenInlineResult
import io.github.oleksivio.telegram.bot.api.model.objects.inline.InlineQuery
import io.github.oleksivio.telegram.bot.api.model.objects.payments.PreCheckoutQuery
import io.github.oleksivio.telegram.bot.api.model.objects.payments.ShippingQuery
import io.github.oleksivio.telegram.bot.api.model.objects.std.CallbackQuery
import io.github.oleksivio.telegram.bot.api.model.objects.std.Message
import io.github.oleksivio.telegram.bot.core.model.ITelegram

/**
 *  [Update](https://core.telegram.org/bots/api/#update)
 */
data class Update(
        /**
         * update_id
         *
         * [Long]
         *
         * The update's unique identifier. Update identifiers start from a certain positive number and increase sequentially.
         * This ID becomes especially handy if you’re using Webhooks, since it allows you to ignore repeated updates or to
         * restore the correct update sequence, should they get out of order. If there are no new updates for at least a week,
         * then identifier of the next update will be chosen randomly instead of sequentially.
         */
        @JsonProperty("update_id")
        var updateId: Long = 0,
        /**
         *  [io.github.oleksivio.telegram.bot.api.annotations.receiver.MessageReceiver] for create receiver
         *
         *  Use [MessageFilter] for setup filter message
         *
         * [Message]
         *
         * Optional. New incoming message of any kind — text, photo, sticker, etc.
         */
        @JsonProperty("message")
        var message: Message? = null,
        /**
         *  [io.github.oleksivio.telegram.bot.api.annotations.receiver.EditedMessageReceiver] for create receiver
         *
         *  [MessageFilter] for setup filter edited_message
         *
         * [Message]
         *
         * Optional. New version of a message that is known to the bot and was edited
         */
        @JsonProperty("edited_message")
        var editedMessage: Message? = null,
        /**
         *  [io.github.oleksivio.telegram.bot.api.annotations.receiver.ChannelPostReceiver] for create receiver
         *
         * Use [MessageFilter] for setup filter channel_post
         *
         * [Message]
         *
         * Optional. New incoming channel post of any kind — text, photo, sticker, etc.
         */
        @JsonProperty("channel_post")
        var channelPost: Message? = null,
        /**
         *  [io.github.oleksivio.telegram.bot.api.annotations.receiver.EditedChannelPostReceiver] for create receiver
         *
         *  Use [MessageFilter] for setup filter edited_channel_post
         *
         * [Message]
         *
         * Optional. New version of a channel post that is known to the bot and was edited
         */
        @JsonProperty("edited_channel_post")
        var editedChannelPost: Message? = null,
        /**
         *  [io.github.oleksivio.telegram.bot.api.annotations.receiver.InlineQueryReceiver] for create receiver
         *
         * [io.github.oleksivio.telegram.bot.api.annotations.filter.composite.InlineQueryFilter] for setup filter inline_query
         *
         * InlineQueryText
         *
         * Optional. New incoming inline query
         */
        @JsonProperty("inline_query")
        var inlineQuery: InlineQuery? = null,
        /**
         *  [io.github.oleksivio.telegram.bot.api.annotations.receiver.ChosenInlineResultReceiver] for create receiver
         *
         *  [io.github.oleksivio.telegram.bot.api.annotations.filter.composite.ChosenInlineResultFilter] for setup filter chosen_inline_result
         *
         * [ChosenInlineResult]
         *
         * Optional. The result of an inline query that was chosen by a user and sent to their chat partner.
         */
        @JsonProperty("chosen_inline_result")
        var chosenInlineResult: ChosenInlineResult? = null,
        /**
         *  [io.github.oleksivio.telegram.bot.api.annotations.receiver.ShippingQueryReceiver] for create receiver
         *
         *  [io.github.oleksivio.telegram.bot.api.annotations.filter.composite.ShippingQueryFilter] for setup filter callback_query
         *
         * CallbackQuery
         *
         * Optional. New incoming callback query
         */
        @JsonProperty("callback_query")
        var callbackQuery: CallbackQuery? = null,
        /**
         *  [io.github.oleksivio.telegram.bot.api.annotations.receiver.ShippingQueryReceiver]
         *  for create receiver
         *
         *  [io.github.oleksivio.telegram.bot.api.annotations.filter.composite.ShippingQueryFilter]
         *  for setup filter shipping_query
         *
         * ShippingQuery
         *
         *
         * Optional. New incoming shipping query. Only for invoices with flexible price
         */
        @JsonProperty("shipping_query")
        var shippingQuery: ShippingQuery? = null,
        /**
         *  [io.github.oleksivio.telegram.bot.api.annotations.receiver.PreCheckoutQueryReceiver] for create receiver
         *
         *  [io.github.oleksivio.telegram.bot.api.annotations.filter.composite.PreCheckoutQueryFilter]
         *  for setup filter pre_checkout_query
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
