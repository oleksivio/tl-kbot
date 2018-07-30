package ru.ioleksiv.telegram.bot.core.model.objects.payments;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <a href="https://core.telegram.org/bots/api#shippingaddress>ShippingAddress</a>
 */
public class ShippingAddress {
    /**
     * country_code	String	ISO 3166-1 alpha-2 country code
     */
    @JsonProperty("country_code")
    private String countryCode;
    /**
     * state	String	State, if applicable
     */
    @JsonProperty("state")
    private String state;
    /**
     * city	String	City
     */
    @JsonProperty("city")
    private String city;
    /**
     * street_line1	String	First line for the address
     */
    @JsonProperty("street_line1")
    private String streetLine1;
    /**
     * street_line2	String	Second line for the address
     */
    @JsonProperty("street_line2")
    private String streetLine2;
    /**
     * post_code	String	Address post code
     */
    @JsonProperty("post_code")
    private String postCode;

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetLine1() {
        return streetLine1;
    }

    public void setStreetLine1(String streetLine1) {
        this.streetLine1 = streetLine1;
    }

    public String getStreetLine2() {
        return streetLine2;
    }

    public void setStreetLine2(String streetLine2) {
        this.streetLine2 = streetLine2;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
}
