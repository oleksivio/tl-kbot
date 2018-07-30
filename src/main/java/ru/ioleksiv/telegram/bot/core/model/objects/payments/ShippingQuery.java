package ru.ioleksiv.telegram.bot.core.model.objects.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.model.objects.std.User;

/**
 * @see <a href="https://core.telegram.org/bots/api#shippingquery>ShippingQuery</a>
 */
public class ShippingQuery {
    /**
     * id	String	Unique query identifier
     */
    @JsonProperty("id")
    private String id;
    /**
     * from	User	User who sent the query
     */
    @JsonProperty("from")
    private User from;
    /**
     * invoice_payload	String	Bot specified invoice payload
     */
    @JsonProperty("invoice_payload")
    private String invoicePayload;
    /**
     * shipping_address	ShippingAddress	User specified shipping address
     */
    @JsonProperty("shipping_address")
    private ShippingAddress shippingAddress;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getFrom() {
        return from;
    }

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
