package io.github.oleksivio.telegram.bot.api.model.objects.std;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.NotNullFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter;
import io.github.oleksivio.telegram.bot.core.model.ITelegram;

/**
 * @see <a href="https://core.telegram.org/bots/api#contact">Contact</a>
 */
public class Contact implements ITelegram {
    /**
     * To setup filter:
     *
     * @see StringFilter phoneNumber
     * phone_number String Contact's phone number
     */
    @JsonProperty("phone_number")
    private String phoneNumber = "";
    /**
     * To setup filter:
     *
     * @see StringFilter firstName
     * first_name String Contact's first name
     */
    @JsonProperty("first_name")
    private String firstName = "";
    /**
     * To setup filter:
     *
     * @see StringFilter lastName
     * last_name String Optional. Contact's last name
     */
    @JsonProperty("last_name")
    private String lastName = "";
    /**
     * To setup filter:
     *
     * @see NotNullFilter userId
     * user_id Integer Optional. Contact's user identifier in Telegram
     */
    @JsonProperty("user_id")
    private Long userId = null;
    /**
     * To setup filter:
     *
     * @see StringFilter vCard
     * vCard String Optional Additional data about the contact in the form of a vCard, 0-2048 bytes
     */
    @JsonProperty("vCard")
    private String vCard = null;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getvCard() {
        return vCard;
    }

    public void setvCard(String vCard) {
        this.vCard = vCard;
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}

