package ru.ioleksiv.telegram.bot.api.model.method.info;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.core.controller.network.ActionNetworker;
import ru.ioleksiv.telegram.bot.core.model.method.RunnableAction;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;

/**
 * @see <a href="https://core.telegram.org/bots/api#answercallbackquery">answerCallbackQuery</a>
 */
public class AnswerCallbackQuery extends RunnableAction<Boolean> {
    private static final String METHOD = "answerCallbackQuery";

    /**
     * callback_query_id	String Unique identifier for the query to be answered
     */
    @JsonProperty("callback_query_id")
    private String callbackQueryId = null;
    /**
     * text	String	Optional	Text of the notification. If not specified, nothing will be shown to the
     * user, 0-200 characters
     */
    @JsonProperty("text")
    private String text = null;
    /**
     * show_alert	Boolean	Optional	If true, an alert will be shown by the client instead of a
     * notification at the top of the chat screen. Defaults to false.
     */
    @JsonProperty("show_alert")
    private Boolean showAlert = null;
    /**
     * url	String	Optional	URL that will be opened by the user's client. If you have created a
     * Game and accepted the conditions via @BotFather, specify the URL that opens your game – note
     * that this will only work if the query comes from a callback_game button.
     */
    @JsonProperty("url")
    private String url = null;
    /**
     * cache_time	Integer	Optional	The maximum amount of time in seconds that the result of the
     * callback query may be cached client-side. Telegram apps will support caching starting in
     * version 3.14. Defaults to 0.
     */
    @JsonProperty("cache_time")
    private Integer cacheTime = null;

    public AnswerCallbackQuery(ActionNetworker actionNetworker) {
        super(METHOD, actionNetworker);
    }

    public String getCallbackQueryId() {
        return callbackQueryId;
    }

    public void setCallbackQueryId(String callbackQueryId) {
        this.callbackQueryId = callbackQueryId;
    }

    @Override
    protected Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return ResponseCollection.BooleanResponse.class;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Boolean getShowAlert() {
        return showAlert;
    }

    public void setShowAlert(Boolean showAlert) {
        this.showAlert = showAlert;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getCacheTime() {
        return cacheTime;
    }

    public void setCacheTime(Integer cacheTime) {
        this.cacheTime = cacheTime;
    }

    @Override
    public AnswerCallbackQuery setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }
}
