package ru.ioleksiv.telegram.bot.core.model.telegram.method.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.method.interfaces.RunnableAction;
import ru.ioleksiv.telegram.bot.core.model.telegram.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.telegram.responses.ResponseCollection;

/**
 * @see <a href="https://core.telegram.org/bots/api#answercallbackquery">answerCallbackQuery</a>
 */
public class AnswerCallbackQuery extends RunnableAction<Boolean> {
    private static final Logger LOGGER = LoggerFactory.getLogger(AnswerCallbackQuery.class);
    private static final String METHOD = "answerCallbackQuery";

    /**
     * callback_query_id	String	Yes	Unique identifier for the query to be answered
     */
    @JsonProperty("callback_query_id")
    private String mCallbackQueryId = null;
    /**
     * text	String	Optional	Text of the notification. If not specified, nothing will be shown to the user, 0-200 characters
     */
    @JsonProperty("text")
    private String mText = null;
    /**
     * show_alert	Boolean	Optional	If true, an alert will be shown by the client instead of a
     * notification at the top of the chat screen. Defaults to false.
     */
    @JsonProperty("show_alert")
    private Boolean mShowAlert = null;
    /**
     * url	String	Optional	URL that will be opened by the user's client. If you have created a
     * Game and accepted the conditions via @Botfather, specify the URL that opens your game – note
     * that this will only work if the query comes from a callback_game button.
     */
    @JsonProperty("url")
    private String mUrl = null;
    /**
     * cache_time	Integer	Optional	The maximum amount of time in seconds that the result of the
     * callback query may be cached client-side. Telegram apps will support caching starting in
     * version 3.14. Defaults to 0.
     */
    @JsonProperty("cache_time")
    private Integer mCacheTime = null;

    protected AnswerCallbackQuery(Networker networker) {
        super(METHOD, networker);
    }

    public String getCallbackQueryId() {
        return mCallbackQueryId;
    }

    public void setCallbackQueryId(String callbackQueryId) {
        mCallbackQueryId = callbackQueryId;
    }

    @Override
    public Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return ResponseCollection.BooleanResponse.class;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public Boolean getShowAlert() {
        return mShowAlert;
    }

    public void setShowAlert(Boolean showAlert) {
        mShowAlert = showAlert;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public Integer getCacheTime() {
        return mCacheTime;
    }

    public void setCacheTime(Integer cacheTime) {
        mCacheTime = cacheTime;
    }

}
