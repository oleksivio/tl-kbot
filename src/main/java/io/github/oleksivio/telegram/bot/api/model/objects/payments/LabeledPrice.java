package io.github.oleksivio.telegram.bot.api.model.objects.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.oleksivio.telegram.bot.core.model.ITelegram;

/**
 * @see <a href="https://core.telegram.org/bots/api#labeledprice">LabeledPrice</a>
 */
public class LabeledPrice implements ITelegram {
    /**
     * label String Portion label
     */
    @JsonProperty("label")
    private String label = null;
    /**
     * amount Integer Price of the product in the smallest units of the currency (integer, not float/double).
     * For example, for a price of US$ 1.45 pass amount = 145.
     * See the exp parameter in currencies.json, it shows the number of digits past the decimal point for each currency
     * (2 for the majority of currencies).
     */
    @JsonProperty("amount")
    private Integer amount = null;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

}
