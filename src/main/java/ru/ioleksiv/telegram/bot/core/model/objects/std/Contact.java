package ru.ioleksiv.telegram.bot.core.model.objects.std;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.jetbrains.annotations.NotNull;

public class Contact {
    /**
     * phone_number	String	Contact's phone number
     */
    @JsonProperty("phone_number")
    private String mPhoneNumber = "";
    /**
     * first_name	String	Contact's first name
     */
    @JsonProperty("first_name")
    private String mFirstName = "";
    /**
     * last_name	String	Optional. Contact's last name
     */
    @JsonProperty("last_name")
    private String mLastName = "";
    /**
     * user_id	Integer	Optional. Contact's user identifier in Telegram
     */
    @JsonProperty("user_id")
    private Integer mUserId = null;
    /**
     * vCard	String	Optional	Additional data about the contact in the form of a vCard, 0-2048 bytes
     */
    @JsonProperty("vCard")
    private String vCard = null;

    public String getPhoneNumber() {
        return mPhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        mPhoneNumber = phoneNumber;
    }

    public String getvCard() {
        return vCard;
    }

    public void setvCard(String vCard) {
        this.vCard = vCard;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public void setLastName(@NotNull String lastName) {
        mLastName = lastName;
    }

    public Integer getUserId() {
        return mUserId;
    }

    public void setUserId(int userId) {
        mUserId = userId;
    }
}

