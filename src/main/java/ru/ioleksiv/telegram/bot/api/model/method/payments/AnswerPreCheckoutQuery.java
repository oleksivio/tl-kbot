package ru.ioleksiv.telegram.bot.api.model.method.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.core.model.method.RunnableAction;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;

/**
 * @see <a href="https://core.telegram.org/bots/api#answerprecheckoutquery>answerPreCheckoutQuery</a>
 */
public class AnswerPreCheckoutQuery extends RunnableAction<Boolean> {
    private static final String METHOD = "answerPreCheckoutQuery";
    /**
     * pre_checkout_query_id	String	Yes	Unique identifier for the query to be answered
     */
    @JsonProperty("pre_checkout_query_id")
    private String preCheckoutQueryId = null;
    /**
     * ok	Boolean	Yes	Specify True if everything is alright (goods are available, etc.) and the bot is ready to proceed with the order. Use False if there are any problems.
     */
    @JsonProperty("ok")
    private Boolean ok = null;
    /**
     * error_message	String	Optional	Required if ok is False. Error message in human readable form that explains the reason for failure to proceed with the checkout (e.g. "Sorry, somebody just bought the last of our amazing black T-shirts while you were busy filling out your payment details. Please choose a different color or garment!"). Telegram will display this message to the user.
     */
    @JsonProperty("error_message")
    private String errorMessage = null;

    public AnswerPreCheckoutQuery(Networker networker) {
        super(METHOD, networker);
    }

    public String getPreCheckoutQueryId() {
        return preCheckoutQueryId;
    }

    public AnswerPreCheckoutQuery setPreCheckoutQueryId(String preCheckoutQueryId) {
        this.preCheckoutQueryId = preCheckoutQueryId;
        return this;
    }

    @Override
    protected Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return ResponseCollection.BooleanResponse.class;
    }

    public Boolean getOk() {
        return ok;
    }

    public AnswerPreCheckoutQuery setOk(Boolean ok) {
        this.ok = ok;
        return this;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public AnswerPreCheckoutQuery setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    @Override
    public AnswerPreCheckoutQuery setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }
}
