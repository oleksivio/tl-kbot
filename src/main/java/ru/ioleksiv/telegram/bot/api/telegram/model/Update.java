package ru.ioleksiv.telegram.bot.api.telegram.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import ru.ioleksiv.telegram.bot.api.telegram.interfaces.ITelegram;
import ru.ioleksiv.telegram.bot.api.telegram.model.query.CallbackQuery;
import ru.ioleksiv.telegram.bot.api.telegram.model.query.InlineQuery;
import ru.ioleksiv.telegram.bot.api.telegram.model.query.PreCheckoutQuery;
import ru.ioleksiv.telegram.bot.api.telegram.model.query.ShippingQuery;

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
    private int mUpdateId = -1;
    /**
     * message
     * <p>
     * Message
     * <p>
     * Optional. New incoming message of any kind — text, photo, sticker, etc.
     */
    @Nullable
    private Message mMessage = null;
    /**
     * edited_message
     * <p>
     * Message
     * <p>
     * Optional.
     * New version of a message that is known to the bot and was edited
     */
    @Nullable
    private Message mEditedMessage = null;
    /**
     * channel_post
     * <p>
     * Message
     * <p>
     * Optional.
     * New incoming channel post of any kind — text, photo, sticker, etc.
     */
    @Nullable
    private Message mChannelPost = null;
    /**
     * edited_channel_post
     * <p>
     * Message
     * <p>
     * Optional.
     * New version of a channel post that is known to the bot and was edited
     */
    @Nullable
    private Message mEditedChannelPost = null;
    /**
     * inline_query
     * <p>
     * InlineQuery
     * <p>
     * Optional. New incoming inline query
     */
    @Nullable
    private InlineQuery mInlineQuery = null;
    /**
     * chosen_inline_result
     * <p>
     * ChosenInlineResult
     * <p>
     * Optional. The result of an inline query that was chosen by a user and sent to
     * their chat partner.
     */
    @Nullable
    private ChosenInlineResult mChoosenInlineResult = null;
    /**
     * callback_query
     * <p>
     * CallbackQuery
     * <p>
     * Optional. New incoming callback query
     */
    @Nullable
    private CallbackQuery mCallbackQuery = null;
    /**
     * shipping_query
     * <p>
     * ShippingQuery
     * <p>
     * Optional. New incoming shipping query. Only for invoices with flexible price
     */
    @Nullable
    private ShippingQuery mShippingQuery = null;
    /**
     * pre_checkout_query
     * <p>
     * PreCheckoutQuery
     * <p>
     * Optional. New incoming pre-checkout query. Contains full information about checkout
     */
    @Nullable
    private PreCheckoutQuery mPreCheckoutQuery = null;

  

    @JsonProperty("edited_message")
    public Message getEditedMessage() {
        return mEditedMessage;
    }

    @JsonProperty("edited_message")
    public void setEditedMessage(Message editedMessage) {
        mEditedMessage = editedMessage;
    }

    @JsonProperty("channel_post")
    public Message getChannelPost() {
        return mChannelPost;
    }

    @JsonProperty("channel_post")
    public void setChannelPost(Message channelPost) {
        mChannelPost = channelPost;
    }

    @JsonProperty("edited_channel_post")
    public Message getEditedChannelPost() {
        return mEditedChannelPost;
    }

    @JsonProperty("edited_channel_post")
    public void setEditedChannelPost(Message editedChannelPost) {
        mEditedChannelPost = editedChannelPost;
    }

    @JsonProperty("inline_query")
    public InlineQuery getInlineQuery() {
        return mInlineQuery;
    }

    @JsonProperty("inline_query")
    public void setInlineQuery(InlineQuery inlineQuery) {
        mInlineQuery = inlineQuery;
    }

    @JsonProperty("chosen_inline_result")
    public ChosenInlineResult getChoosenInlineResult() {
        return mChoosenInlineResult;
    }

    @JsonProperty("chosen_inline_result")
    public void setChoosenInlineResult(ChosenInlineResult choosenInlineResult) {
        mChoosenInlineResult = choosenInlineResult;
    }

    @JsonProperty("callback_query")
    public CallbackQuery getCallbackQuery() {
        return mCallbackQuery;
    }

    @JsonProperty("callback_query")
    public void setCallbackQuery(CallbackQuery callbackQuery) {
        mCallbackQuery = callbackQuery;
    }

    @JsonProperty("shipping_query")
    public ShippingQuery getShippingQuery() {
        return mShippingQuery;
    }

    @JsonProperty("shipping_query")
    public void setShippingQuery(ShippingQuery shippingQuery) {
        mShippingQuery = shippingQuery;
    }

    @JsonProperty("pre_checkout_query")
    public PreCheckoutQuery getPreCheckoutQuery() {
        return mPreCheckoutQuery;
    }

    @JsonProperty("pre_checkout_query")
    public void setPreCheckoutQuery(PreCheckoutQuery preCheckoutQuery) {
        mPreCheckoutQuery = preCheckoutQuery;
    }

    @JsonProperty("update_id")
    public int getUpdateId() {
        return mUpdateId;
    }

    @JsonProperty("update_id")
    public void setUpdateId(int updateId) {
        mUpdateId = updateId;
    }

    @JsonProperty("message")
    public Message getMessage() {
        return mMessage;
    }

    @JsonProperty("message")
    public void setMessage(@NotNull Message message) {
        mMessage = message;
    }

}
