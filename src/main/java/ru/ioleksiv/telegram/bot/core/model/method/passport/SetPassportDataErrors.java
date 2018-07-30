package ru.ioleksiv.telegram.bot.core.model.method.passport;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.model.method.interfaces.RunnableAction;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;

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
    private Integer userId;
    /**
     * errors	Array of PassportElementError	Yes	A JSON-serialized array describing the errors
     */
    @JsonProperty("errors")
    private List<PassportElementError> errors;

    public Integer getUserId() {
        return userId;
    }

    @Override
    public Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return ResponseCollection.BooleanResponse.class;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public List<PassportElementError> getErrors() {
        return errors;
    }

    public void setErrors(List<PassportElementError> errors) {
        this.errors = errors;
    }
}
