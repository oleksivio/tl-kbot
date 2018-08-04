package ru.ioleksiv.telegram.bot.core.api.model.method.passport;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.api.model.objects.passport.errors.PassportElementError;
import ru.ioleksiv.telegram.bot.core.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.core.model.method.RunnableAction;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;

import java.util.List;

/**
 * @see <a href="https://core.telegram.org/bots/api#setpassportdataerrors>setPassportDataErrors</a>
 */
public class SetPassportDataErrors extends RunnableAction<Boolean> {
    private static final String METHOD = "setPassportDataErrors";
    /**
     * user_id	Integer	Yes	User identifier
     */
    @JsonProperty("user_id")
    private Integer userId = null;
    /**
     * errors	Array of PassportElementError	Yes	A JSON-serialized array describing the errors
     */
    @JsonProperty("errors")
    private List<PassportElementError> errors = null;

    public SetPassportDataErrors(Networker networker) {
        super(METHOD, networker);
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    protected Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return ResponseCollection.BooleanResponse.class;
    }

    public List<PassportElementError> getErrors() {
        return errors;
    }

    public void setErrors(List<PassportElementError> errors) {
        this.errors = errors;
    }

    @Override
    public SetPassportDataErrors setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }
}