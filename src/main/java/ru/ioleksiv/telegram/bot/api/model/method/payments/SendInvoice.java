package ru.ioleksiv.telegram.bot.api.model.method.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.api.model.objects.payments.LabeledPrice;
import ru.ioleksiv.telegram.bot.api.model.objects.std.Message;
import ru.ioleksiv.telegram.bot.api.model.objects.std.keyboard.InlineKeyboardMarkup;
import ru.ioleksiv.telegram.bot.core.controller.network.ActionNetworker;
import ru.ioleksiv.telegram.bot.core.model.method.ChatAction;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://core.telegram.org/bots/api#sendinvoice>sendInvoice</a>
 */
public class SendInvoice extends ChatAction<Message> {
    private static final String METHOD = "sendInvoice";
    /**
     * title String Yes Product name, 1-32 characters
     */
    @JsonProperty("title")
    private String title = null;
    /**
     * description String Yes Product description, 1-255 characters
     */
    @JsonProperty("description")
    private String description = null;
    /**
     * payload String Yes Bot-defined invoice payload, 1-128 bytes. This will not be displayed to the user, use for
     * your internal processes.
     */
    @JsonProperty("payload")
    private String payload = null;
    /**
     * provider_token String Yes Payments provider token, obtained via Botfather
     */
    @JsonProperty("provider_token")
    private String providerToken = null;
    /**
     * start_parameter String Yes Unique deep-linking parameter that can be used to generate this invoice when used as
     * a start parameter
     */
    @JsonProperty("start_parameter")
    private String startParameter = null;
    /**
     * currency String Yes Three-letter ISO 4217 currency code, see more on currencies
     */
    @JsonProperty("currency")
    private String currency = null;
    /**
     * prices Array of LabeledPrice Yes Price breakdown, a list of components (e.g. product price, tax, discount,
     * delivery cost, delivery tax, bonus, etc.)
     */
    @JsonProperty("prices")
    private List<LabeledPrice> prices = new ArrayList<>();
    /**
     * provider_data String Optional JSON-encoded data about the invoice, which will be shared with the payment
     * provider. A detailed description of required fields should be provided by the payment provider.
     */
    @JsonProperty("provider_data")
    private String providerData = null;
    /**
     * photo_url String Optional URL of the product photo for the invoice. Can be a photo of the goods or a marketing
     * image for a service. People like it better when they see what they are paying for.
     */
    @JsonProperty("photo_url")
    private String photoUrl = null;
    /**
     * photo_size Integer Optional Photo size
     */
    @JsonProperty("photo_size")
    private Integer photoSize = null;
    /**
     * photo_width Integer Optional Photo width
     */
    @JsonProperty("photo_width")
    private Integer photoWidth = null;
    /**
     * photo_height Integer Optional Photo height
     */
    @JsonProperty("photo_height")
    private Integer photoHeight = null;
    /**
     * need_name Boolean Optional Pass True, if you require the user's full name to complete the order
     */
    @JsonProperty("need_name")
    private Boolean needName = null;
    /**
     * need_phone_number Boolean Optional Pass True, if you require the user's phone number to complete the order
     */
    @JsonProperty("need_phone_number")
    private Boolean needPhoneNumber = null;
    /**
     * need_email Boolean Optional Pass True, if you require the user's email address to complete the order
     */
    @JsonProperty("need_email")
    private Boolean needEmail = null;
    /**
     * need_shipping_address Boolean Optional Pass True, if you require the user's shipping address to complete the order
     */
    @JsonProperty("need_shipping_address")
    private Boolean needShippingAddress = null;
    /**
     * send_phone_number_to_provider Boolean Optional Pass True, if user's phone number should be sent to provider
     */
    @JsonProperty("send_phone_number_to_provider")
    private Boolean sendPhoneNumberToProvider = null;
    /**
     * send_email_to_provider Boolean Optional Pass True, if user's email address should be sent to provider
     */
    @JsonProperty("send_email_to_provider")
    private Boolean sendEmailToProvider = null;
    /**
     * is_flexible Boolean Optional Pass True, if the final price depends on the shipping method
     */
    @JsonProperty("is_flexible")
    private Boolean isFlexible = null;
    /**
     * disable_notification Boolean Optional Sends the message silently. Users will receive a notification with no sound.
     */
    @JsonProperty("disable_notification")
    private Boolean disableNotification = null;
    /**
     * reply_to_message_id Integer Optional If the message is a reply, ID of the original message
     */
    @JsonProperty("reply_to_message_id")
    private Integer replyToMessageId = null;
    /**
     * reply_markup InlineKeyboardMarkup Optional A JSON-serialized object for an inline keyboard. If empty, one 'Pay total price' button will be shown. If not empty, the first button must be a Pay button.
     */
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup = null;

    public SendInvoice(ActionNetworker actionNetworker) {
        super(METHOD, actionNetworker);
    }

    public String getTitle() {
        return title;
    }

    public SendInvoice setTitle(String title) {
        this.title = title;
        return this;
    }

    @Override
    protected Class<? extends CommonResponse<Message>> getResultWrapperClass() {
        return ResponseCollection.MessageResponse.class;
    }

    public String getDescription() {
        return description;
    }

    public SendInvoice setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getPayload() {
        return payload;
    }

    public SendInvoice setPayload(String payload) {
        this.payload = payload;
        return this;
    }

    public String getProviderToken() {
        return providerToken;
    }

    public SendInvoice setProviderToken(String providerToken) {
        this.providerToken = providerToken;
        return this;
    }

    public String getStartParameter() {
        return startParameter;
    }

    public SendInvoice setStartParameter(String startParameter) {
        this.startParameter = startParameter;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public SendInvoice setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public List<LabeledPrice> getPrices() {
        return prices;
    }

    public SendInvoice setPrices(List<LabeledPrice> prices) {
        this.prices = prices;
        return this;
    }

    public String getProviderData() {
        return providerData;
    }

    public SendInvoice setProviderData(String providerData) {
        this.providerData = providerData;
        return this;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public SendInvoice setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
        return this;
    }

    public Integer getPhotoSize() {
        return photoSize;
    }

    public SendInvoice setPhotoSize(Integer photoSize) {
        this.photoSize = photoSize;
        return this;
    }

    public Integer getPhotoWidth() {
        return photoWidth;
    }

    public SendInvoice setPhotoWidth(Integer photoWidth) {
        this.photoWidth = photoWidth;
        return this;
    }

    public Integer getPhotoHeight() {
        return photoHeight;
    }

    public SendInvoice setPhotoHeight(Integer photoHeight) {
        this.photoHeight = photoHeight;
        return this;
    }

    public Boolean getNeedName() {
        return needName;
    }

    public SendInvoice setNeedName(Boolean needName) {
        this.needName = needName;
        return this;
    }

    public Boolean getNeedPhoneNumber() {
        return needPhoneNumber;
    }

    public SendInvoice setNeedPhoneNumber(Boolean needPhoneNumber) {
        this.needPhoneNumber = needPhoneNumber;
        return this;
    }

    public Boolean getNeedEmail() {
        return needEmail;
    }

    public SendInvoice setNeedEmail(Boolean needEmail) {
        this.needEmail = needEmail;
        return this;
    }

    public Boolean getNeedShippingAddress() {
        return needShippingAddress;
    }

    public SendInvoice setNeedShippingAddress(Boolean needShippingAddress) {
        this.needShippingAddress = needShippingAddress;
        return this;
    }

    public Boolean getSendPhoneNumberToProvider() {
        return sendPhoneNumberToProvider;
    }

    public SendInvoice setSendPhoneNumberToProvider(Boolean sendPhoneNumberToProvider) {
        this.sendPhoneNumberToProvider = sendPhoneNumberToProvider;
        return this;
    }

    public Boolean getSendEmailToProvider() {
        return sendEmailToProvider;
    }

    public SendInvoice setSendEmailToProvider(Boolean sendEmailToProvider) {
        this.sendEmailToProvider = sendEmailToProvider;
        return this;
    }

    public Boolean getFlexible() {
        return isFlexible;
    }

    public SendInvoice setFlexible(Boolean flexible) {
        isFlexible = flexible;
        return this;
    }

    public Boolean getDisableNotification() {
        return disableNotification;
    }

    public SendInvoice setDisableNotification(Boolean disableNotification) {
        this.disableNotification = disableNotification;
        return this;
    }

    public Integer getReplyToMessageId() {
        return replyToMessageId;
    }

    public SendInvoice setReplyToMessageId(Integer replyToMessageId) {
        this.replyToMessageId = replyToMessageId;
        return this;
    }

    public InlineKeyboardMarkup getReplyMarkup() {
        return replyMarkup;
    }

    public SendInvoice setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
        return this;
    }

    @Override
    public SendInvoice setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }

    @Override
    public SendInvoice setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }
}
