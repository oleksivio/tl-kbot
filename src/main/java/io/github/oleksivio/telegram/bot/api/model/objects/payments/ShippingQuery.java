package io.github.oleksivio.telegram.bot.api.model.objects.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.ShippingAddressFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.UserFilter;
import io.github.oleksivio.telegram.bot.api.model.objects.std.User;
import io.github.oleksivio.telegram.bot.core.model.objects.IUserFrom;

/**
 * @see <a href="https://core.telegram.org/bots/api#shippingquery">ShippingQuery</a>
 */
public class ShippingQuery implements IUserFrom {
    /**
     * id String Unique query identifier
     */
    @JsonProperty("id")
    private String id = null;
    /**
     * To setup filter:
     *
     * @see UserFilter from
     * from User User who sent the query
     */
    @JsonProperty("from")
    private User from = null;
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
     * @see ShippingAddressFilter shippingAddress
     * shipping_address ShippingAddress User specified shipping address
     */
    @JsonProperty("shipping_address")
    private ShippingAddress shippingAddress = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public User getFrom() {
        return from;
    }

    @Override
    public void setFrom(User from) {
        this.from = from;
    }

    public String getInvoicePayload() {
        return invoicePayload;
    }

    public void setInvoicePayload(String invoicePayload) {
        this.invoicePayload = invoicePayload;
    }

    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
}
