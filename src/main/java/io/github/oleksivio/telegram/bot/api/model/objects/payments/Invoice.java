package io.github.oleksivio.telegram.bot.api.model.objects.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter;
import io.github.oleksivio.telegram.bot.core.model.ITelegram;

/**
 * @see <a href="https://core.telegram.org/bots/api#invoice">Invoice</a>
 */
public class Invoice implements ITelegram {
    /**
     * To setup filter:
     *
     * @see StringFilter title
     * title String Product name
     */
    @JsonProperty("title")
    private String title = null;
    /**
     * To setup filter:
     *
     * @see StringFilter description
     * description String Product description
     */
    @JsonProperty("description")
    private String description = null;
    /**
     * To setup filter:
     *
     * @see StringFilter startParameter
     * start_parameter String Unique bot deep-linking parameter that can be used to generate this invoice
     */
    @JsonProperty("start_parameter")
    private String startParameter = null;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStartParameter() {
        return startParameter;
    }

    public void setStartParameter(String startParameter) {
        this.startParameter = startParameter;
    }

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
}