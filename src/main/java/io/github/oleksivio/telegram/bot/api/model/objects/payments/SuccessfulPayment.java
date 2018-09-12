package io.github.oleksivio.telegram.bot.api.model.objects.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.NotNullFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.OrderInfoFilter;
import io.github.oleksivio.telegram.bot.core.model.ITelegram;

/**
 * @see <a href="https://core.telegram.org/bots/api#successfulpayment">SuccessfulPayment</a>
 */
public class SuccessfulPayment implements ITelegram {
    /**
     * To setup filter:
     *
     * @see StringFilter currency
     * currency String Three-letter ISO 4217 currency code
     */
    @JsonProperty("currency")
    private String currency = null;
    /**
     * To setup filter:
     *
     * @see IntegerFilter totalAmount
     * total_amount Integer Total price in the smallest units of the currency (integer, not float/double).
     * For example, for a price of US$ 1.45 pass amount = 145. See the exp parameter in currencies.json, it shows the
     * number of digits past the decimal point for each currency (2 for the majority of currencies).
     */
    @JsonProperty("total_amount")
    private Integer totalAmount = null;
    /**
     * To setup filter:
     *
     * @see StringFilter invoicePayload
     * invoice_payload String Bot specified invoice payload
     */
    @JsonProperty("invoice_payload")
    private String invoicePayload = null;
    /**
     * To setup filter:
     *
     * @see NotNullFilter shippingOptionId
     * shipping_option_id String Optional. Identifier of the shipping option chosen by the user
     */
    @JsonProperty("shipping_option_id")
    private String shippingOptionId = null;
    /**
     * To setup filter:
     *
     * @see OrderInfoFilter orderInfo
     * order_info OrderInfo Optional. Order info provided by the user
     */
    @JsonProperty("order_info")
    private OrderInfo orderInfo = null;
    /**
     * To setup filter:
     *
     * @see NotNullFilter telegramPaymentChargeId
     * telegram_payment_charge_id String Telegram payment identifier
     */
    @JsonProperty("telegram_payment_charge_id")
    private String telegramPaymentChargeId = null;
    /**
     * To setup filter:
     *
     * @see NotNullFilter providerPaymentChargeId
     * provider_payment_charge_id String Provider payment identifier
     */
    @JsonProperty("provider_payment_charge_id")
    private String providerPaymentChargeId = null;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getInvoicePayload() {
        return invoicePayload;
    }

    public void setInvoicePayload(String invoicePayload) {
        this.invoicePayload = invoicePayload;
    }

    public String getShippingOptionId() {
        return shippingOptionId;
    }

    public void setShippingOptionId(String shippingOptionId) {
        this.shippingOptionId = shippingOptionId;
    }

    public OrderInfo getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(OrderInfo orderInfo) {
        this.orderInfo = orderInfo;
    }

    public String getTelegramPaymentChargeId() {
        return telegramPaymentChargeId;
    }

    public void setTelegramPaymentChargeId(String telegramPaymentChargeId) {
        this.telegramPaymentChargeId = telegramPaymentChargeId;
    }

    public String getProviderPaymentChargeId() {
        return providerPaymentChargeId;
    }

    public void setProviderPaymentChargeId(String providerPaymentChargeId) {
        this.providerPaymentChargeId = providerPaymentChargeId;
    }
}