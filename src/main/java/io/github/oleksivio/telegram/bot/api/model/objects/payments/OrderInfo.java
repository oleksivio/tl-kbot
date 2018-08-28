package io.github.oleksivio.telegram.bot.api.model.objects.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.ShippingAddressFilter;
import io.github.oleksivio.telegram.bot.core.model.ITelegram;

/**
 * @see <a href="https://core.telegram.org/bots/api#orderinfo>OrderInfo</a>
 */
public class OrderInfo implements ITelegram {
    /**
     * To setup filter:
     *
     * @see StringFilter name
     * name String Optional. User name
     */
    @JsonProperty("name")
    private String name = null;
    /**
     * To setup filter:
     *
     * @see StringFilter phoneNumber
     * phone_number String Optional. User's phone number
     */
    @JsonProperty("phone_number")
    private String phoneNumber = null;
    /**
     * To setup filter:
     *
     * @see StringFilter email
     * email String Optional. User email
     */
    @JsonProperty("email")
    private String email = null;
    /**
     * To setup filter:
     *
     * @see ShippingAddressFilter  shippingAddress
     * shipping_address ShippingAddress Optional. User shipping address
     */
    @JsonProperty("shipping_address")
    private ShippingAddress shippingAddress = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
}
