package ru.ioleksiv.telegram.bot.core.model.telegram.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.ioleksiv.telegram.bot.core.model.telegram.interfaces.ITelegram;

public class Message implements ITelegram {
    @JsonProperty("message_id")
    private Integer mId = null;
    @JsonProperty("from")
    private User mSender = null;
    @JsonProperty("text")
    private String mText = null;
    @JsonProperty("chat")
    private Chat mChat = null;
    @JsonProperty("date")
    private long mDate = 0;
    @Nullable
    @JsonProperty("location")
    private Location mLocation = null;
    @Nullable
    @JsonProperty("contact")
    private Contact mContact = null;

    @Override
    public String toString() {
        return "Text{" +
                "id=" + mId +
                ", network=" + mSender +
                ", text='" + mText + '\'' +
                ", chat=" + mChat +
                ", date=" + mDate +
                ", location=" + mLocation +
                ", contact=" + mContact +
                '}';
    }

    public long getDate() {
        return mDate;
    }

    public void setDate(long date) {
        mDate = date;
    }

    @Nullable
    public Location getLocation() {
        return mLocation;
    }

    public void setLocation(Location location) {
        mLocation = location;
    }

    public long getUnixTime() {
        return mDate;
    }

    public void setUnixTime(long date) {
        mDate = date;
    }

    @NotNull
    public Chat getChat() {
        return mChat;
    }

    public void setChat(Chat chat) {
        mChat = chat;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    @NotNull
    public User getSender() {
        return mSender;
    }

    public void setSender(User sender) {
        mSender = sender;
    }

    @Nullable
    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    @Nullable
    public Contact getContact() {
        return mContact;
    }

    public void setContact(@Nullable Contact contact) {
        mContact = contact;
    }

}
