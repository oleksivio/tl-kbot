package ru.ioleksiv.telegram.bot.api.telegram.model;

import com.fasterxml.jackson.annotation.JsonProperty;


import ru.ioleksiv.telegram.bot.api.telegram.interfaces.ITelegram;

public class Contact implements ITelegram {
    @JsonProperty("phone_number")
    private String mPhoneNumber = "";
    @JsonProperty("first_name")
    private String mFirstName = "";
    @JsonProperty("last_name")
    private String mLastName = "";
    
    @JsonProperty("user_id")
    private Integer mUserId = null;

    @Override
    public String toString() {
        return "Contact{" +
                "phone_number='" + mPhoneNumber + '\'' +
                ", first_name='" + mFirstName + '\'' +
                ", last_name='" + mLastName + '\'' +
                ", user_id=" + mUserId +
                '}';
    }

    public String getPhoneNumber() {
        return mPhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        mPhoneNumber = phoneNumber;
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

