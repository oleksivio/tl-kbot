package ru.ioleksiv.telegram.bot.core.model.telegram.model.method.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.method.IAction;

public class AnswerCallbackQuery implements IAction {
    private static final Logger LOGGER = LoggerFactory.getLogger(AnswerCallbackQuery.class);
    private static final String METHOD = "answerCallbackQuery";

    /**
     * callback_query_id
     * <p>
     * String
     * <p>
     * Yes	Unique identifier for the query to be answered
     */
    private String mCallbackQueryId = null;
    /**
     * text
     * <p>
     * String
     * <p>
     * Optional	Text of the notification.
     * If not specified, nothing will be shown to the user, 0-200 characters
     */
    private String mText = null;
    /**
     * show_alert
     * <p>
     * Boolean
     * <p>
     * Optional	If true, an alert will be shown by the client instead of a notification
     * at the top of the chat screen. Defaults to false.
     */
    private Boolean mShowAlert = null;
    /**
     * url
     * <p>
     * String
     * <p>
     * Optional	URL that will be opened by the user's client.
     * If you have created a Game and accepted the conditions via @Botfather,
     * specify the URL that opens your game – note that this will only work
     * if the query comes from a callback_game button.
     */
    private String mUrl = null;
    /**
     * cache_time
     * <p>
     * Integer
     * <p>
     * Optional	The maximum amount of time
     * in seconds that the result of the callback query
     * may be cached client-side. Telegram apps will
     * support caching starting in version 3.14. Defaults to 0.
     */
    private Integer mCacheTime = null;

    @JsonProperty("callback_query_id")
    @NotNull
    public String getCallbackQueryId() {
        return mCallbackQueryId;
    }

    @JsonProperty("callback_query_id")
    public void setCallbackQueryId(String callbackQueryId) {
        mCallbackQueryId = callbackQueryId;
    }

    @JsonProperty("text")
    @Nullable
    public String getText() {
        return mText;
    }

    @JsonProperty("text")
    public void setText(String text) {
        mText = text;
    }

    @JsonProperty("show_alert")
    @Nullable
    public Boolean getShowAlert() {
        return mShowAlert;
    }

    @JsonProperty("show_alert")
    public void setShowAlert(Boolean showAlert) {
        mShowAlert = showAlert;
    }

    @JsonProperty("url")
    @Nullable
    public String getUrl() {
        return mUrl;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        mUrl = url;
    }

    @JsonProperty("cache_time")
    public Integer getCacheTime() {
        return mCacheTime;
    }

    @JsonProperty("cache_time")
    public void setCacheTime(Integer cacheTime) {
        mCacheTime = cacheTime;
    }

    @Override
    public boolean isValid() {

        return mCallbackQueryId != null;
    }

    @Override
    public String getMethod() {
        return METHOD;
    }

}
