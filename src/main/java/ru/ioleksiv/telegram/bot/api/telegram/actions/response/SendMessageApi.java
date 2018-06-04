package ru.ioleksiv.telegram.bot.api.telegram.actions.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

import ru.ioleksiv.telegram.bot.api.telegram.actions.IAction;

public class SendMessageApi implements IAction {
    private static final String METHOD = "sendMessage";
    private Long mChatId = null;
    private String mText = "";

    @JsonIgnore
    @Override
    public String toString() {
        return "SendMessageApi{" +
                "method:'" + METHOD + '\'' +
                ", chatId:" + mChatId +
                ", text:'" + mText + '\'' +
                '}';
    }

    @JsonProperty("chat_id")
    public Long getChatId() {
        return mChatId;
    }

    @JsonProperty("chat_id")
    public void setChatId(Long chatId) {
        mChatId = chatId;
    }

    @JsonProperty("text")
    public String getText() {
        return mText;
    }

    @JsonProperty("text")
    public void setText(String text) {
        mText = text;
    }

    @Override
    @JsonProperty("method")
    public String getMethod() {
        return METHOD;
    }

    @JsonIgnore
    @Override
    public boolean isValid() {
        return mChatId != null && mText != null && !mText.isEmpty() && Objects.equals("sendMessage", METHOD);
    }

}
