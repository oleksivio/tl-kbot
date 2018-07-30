package ru.ioleksiv.telegram.bot.core.model.method.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.method.interfaces.RunnableAction;
import ru.ioleksiv.telegram.bot.core.model.objects.payments.ShippingOption;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;

import java.util.List;

/**
 * @see <a href="https://core.telegram.org/bots/api#answershippingquery>answerShippingQuery</a>
 */
public class AnswerShippingQuery extends RunnableAction<Boolean> {
    private static final String METHOD = "answerShippingQuery";
    /**
     * shipping_query_id	String	Yes	Unique identifier for the query to be answered
     */
    @JsonProperty("shipping_query_id")
    private String shippingQueryId;
    /**
     * ok	Boolean	Yes	Specify True if delivery to the specified address is possible and False if there are any problems (for example, if delivery to the specified address is not possible)
     */
    @JsonProperty("ok")
    private Boolean ok;
    /**
     * shipping_options	Array of ShippingOption	Optional	Required if ok is True. A JSON-serialized array of available shipping options.
     */
    @JsonProperty("shipping_options")
    private List<ShippingOption> shippingOptions;
    /**
     * error_message	String	Optional	Required if ok is False. Error message in human readable form that explains why it is impossible to complete the order (e.g. "Sorry, delivery to your desired address is unavailable'). Telegram will display this message to the user.
     */
    @JsonProperty("error_message")
    private String errorMessage;

    protected AnswerShippingQuery(Networker networker) {
        super(METHOD, networker);
    }

    public String getShippingQueryId() {
        return shippingQueryId;
    }

    public AnswerShippingQuery setShippingQueryId(String shippingQueryId) {
        this.shippingQueryId = shippingQueryId;
        return this;
    }

    @Override
    public Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return ResponseCollection.BooleanResponse.class;
    }

    public Boolean getOk() {
        return ok;
    }

    public AnswerShippingQuery setOk(Boolean ok) {
        this.ok = ok;
        return this;
    }

    public List<ShippingOption> getShippingOptions() {
        return shippingOptions;
    }

    public AnswerShippingQuery setShippingOptions(List<ShippingOption> shippingOptions) {
        this.shippingOptions = shippingOptions;
        return this;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public AnswerShippingQuery setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
}
