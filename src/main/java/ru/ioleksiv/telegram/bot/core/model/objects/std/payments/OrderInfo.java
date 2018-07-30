package ru.ioleksiv.telegram.bot.core.model.objects.std.payments;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <a href="https://core.telegram.org/bots/api#orderinfo>OrderInfo</a>
 */
public class OrderInfo {
    /**
     * name	String	Optional. User name
     */
    @JsonProperty("name")
    private String name;
    /**
     * phone_number	String	Optional. User's phone number
     */
    @JsonProperty("phone_number")
    private String phoneNumber;
    /**
     * email	String	Optional. User email
     */
    @JsonProperty("email")
    private String email;
    /**
     * shipping_address	ShippingAddress	Optional. User shipping address
     */
    @JsonProperty("shipping_address")
    private ShippingAddress shippingAddress;

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
