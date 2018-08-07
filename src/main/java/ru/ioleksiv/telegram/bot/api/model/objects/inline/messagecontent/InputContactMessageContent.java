package ru.ioleksiv.telegram.bot.api.model.objects.inline.messagecontent;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <a href="https://core.telegram.org/bots/api#inputcontactmessagecontent>InputContactMessageContent</a>
 */
public class InputContactMessageContent implements InputMessageContent {
    /**
     * phone_number	String	Contact's phone number
     */
    @JsonProperty("phone_number")
    private String phoneNumber = null;
    /**
     * first_name	String	Contact's first name
     */
    @JsonProperty("first_name")
    private String firstName = null;
    /**
     * last_name	String	Optional. Contact's last name
     */
    @JsonProperty("last_name")
    private String lastName = null;
    /**
     * vcard	String	Optional. Additional data about the contact in the form of a vCard, 0-2048 bytes
     */
    @JsonProperty("vcard")
    private String vCard = null;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getvCard() {
        return vCard;
    }

    public void setvCard(String vCard) {
        this.vCard = vCard;
    }
}
