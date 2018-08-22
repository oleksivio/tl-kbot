package ru.ioleksiv.telegram.bot.api.model.objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.ChosenInlineResultFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.InlineQueryFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.MessageFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.PreCheckoutQueryFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.ShippingQueryFilter;
import ru.ioleksiv.telegram.bot.api.annotations.receiver.ChannelPostReceiver;
import ru.ioleksiv.telegram.bot.api.annotations.receiver.ChosenInlineResultReceiver;
import ru.ioleksiv.telegram.bot.api.annotations.receiver.EditedChannelPostReceiver;
import ru.ioleksiv.telegram.bot.api.annotations.receiver.EditedMessageReceiver;
import ru.ioleksiv.telegram.bot.api.annotations.receiver.InlineQueryReceiver;
import ru.ioleksiv.telegram.bot.api.annotations.receiver.MessageReceiver;
import ru.ioleksiv.telegram.bot.api.annotations.receiver.PreCheckoutQueryReceiver;
import ru.ioleksiv.telegram.bot.api.annotations.receiver.ShippingQueryReceiver;
import ru.ioleksiv.telegram.bot.api.model.objects.inline.ChosenInlineResult;
import ru.ioleksiv.telegram.bot.api.model.objects.inline.InlineQuery;
import ru.ioleksiv.telegram.bot.api.model.objects.payments.PreCheckoutQuery;
import ru.ioleksiv.telegram.bot.api.model.objects.payments.ShippingQuery;
import ru.ioleksiv.telegram.bot.api.model.objects.std.CallbackQuery;
import ru.ioleksiv.telegram.bot.api.model.objects.std.Message;
import ru.ioleksiv.telegram.bot.core.model.ITelegram;

/**
 * @see <a href="https://core.telegram.org/bots/api#update">Update</a>
 */
public class Update implements ITelegram {
    /**
     * update_id
     * <p>
     * Integer
     * <p>
     * The update's unique identifier.
     * Update identifiers start from a certain positive number and increase
     * sequentially.
     * This ID becomes especially handy if you’re using Webhooks, since it
     * allows you to ignore repeated updates or to restore the correct update
     * sequence, should they get out of order. If there are no new updates for
     * at least a week, then identifier of the next update will be chosen
     * randomly instead of sequentially.
     */
    @JsonProperty("update_id")
    private Long updateId = null;
    /**
     * @see MessageReceiver for create reciver
     * @see MessageFilter for setup filter
     * message
     * <p>
     * Message
     * <p>
     * Optional. New incoming message of any kind — text, photo, sticker, etc.
     */
    @JsonProperty("message")
    private Message message = null;
    /**
     * @see EditedMessageReceiver for create reciver
     * @see MessageFilter for setup filter
     * edited_message
     * <p>
     * Message
     * <p>
     * Optional.
     * New version of a message that is known to the bot and was edited
     */
    @JsonProperty("edited_message")
    private Message editedMessage = null;
    /**
     * @see ChannelPostReceiver for create reciver
     * @see MessageFilter for setup filter
     * channel_post
     * <p>
     * Message
     * <p>
     * Optional.
     * New incoming channel post of any kind — text, photo, sticker, etc.
     */
    @JsonProperty("channel_post")
    private Message channelPost = null;
    /**
     * @see EditedChannelPostReceiver for create reciver
     * @see MessageFilter for setup filter
     * edited_channel_post
     * <p>
     * Message
     * <p>
     * Optional.
     * New version of a channel post that is known to the bot and was edited
     */
    @JsonProperty("edited_channel_post")
    private Message editedChannelPost = null;
    /**
     * @see InlineQueryReceiver for create reciver
     * @see InlineQueryFilter for setup filter
     * inline_query
     * <p>
     * InlineQueryText
     * <p>
     * Optional. New incoming inline query
     */
    @JsonProperty("inline_query")
    private InlineQuery inlineQuery = null;
    /**
     * @see ChosenInlineResultReceiver for create reciver
     * @see ChosenInlineResultFilter for setup filter
     * chosen_inline_result
     * <p>
     * ChosenInlineResult
     * <p>
     * Optional. The result of an inline query that was chosen by a user and sent to
     * their chat partner.
     */
    @JsonProperty("chosen_inline_result")
    private ChosenInlineResult chosenInlineResult = null;
    /**
     * @see ShippingQueryReceiver for create reciver
     * @see ShippingQueryFilter for setup filter
     * callback_query
     * <p>
     * CallbackQuery
     * <p>
     * Optional. New incoming callback query
     */
    @JsonProperty("callback_query")
    private CallbackQuery callbackQuery = null;
    /**
     * @see ShippingQueryReceiver for create reciver
     * @see ShippingQueryFilter for setup filter
     * shipping_query
     * <p>
     * ShippingQuery
     * <p>
     * Optional. New incoming shipping query. Only for invoices with flexible price
     */
    @JsonProperty("shipping_query")
    private ShippingQuery shippingQuery = null;
    /**
     * @see PreCheckoutQueryReceiver for create reciver
     * @see PreCheckoutQueryFilter for setup filter
     * pre_checkout_query
     * <p>
     * PreCheckoutQuery
     * <p>
     * Optional. New incoming pre-checkout query. Contains full information about checkout
     */
    @JsonProperty("pre_checkout_query")
    private PreCheckoutQuery preCheckoutQuery = null;

    public Message getEditedMessage() {
        return editedMessage;
    }

    public void setEditedMessage(Message editedMessage) {
        this.editedMessage = editedMessage;
    }

    public Message getChannelPost() {
        return channelPost;
    }

    public void setChannelPost(Message channelPost) {
        this.channelPost = channelPost;
    }

    public Message getEditedChannelPost() {
        return editedChannelPost;
    }

    public void setEditedChannelPost(Message editedChannelPost) {
        this.editedChannelPost = editedChannelPost;
    }

    public InlineQuery getInlineQuery() {
        return inlineQuery;
    }

    public void setInlineQuery(InlineQuery inlineQuery) {
        this.inlineQuery = inlineQuery;
    }

    public ChosenInlineResult getChosenInlineResult() {
        return chosenInlineResult;
    }

    public void setChosenInlineResult(ChosenInlineResult chosenInlineResult) {
        this.chosenInlineResult = chosenInlineResult;
    }

    public CallbackQuery getCallbackQuery() {
        return callbackQuery;
    }

    public void setCallbackQuery(CallbackQuery callbackQuery) {
        this.callbackQuery = callbackQuery;
    }

    public ShippingQuery getShippingQuery() {
        return shippingQuery;
    }

    public void setShippingQuery(ShippingQuery shippingQuery) {
        this.shippingQuery = shippingQuery;
    }

    public PreCheckoutQuery getPreCheckoutQuery() {
        return preCheckoutQuery;
    }

    public void setPreCheckoutQuery(PreCheckoutQuery preCheckoutQuery) {
        this.preCheckoutQuery = preCheckoutQuery;
    }

    public Long getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Long updateId) {
        this.updateId = updateId;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

}
