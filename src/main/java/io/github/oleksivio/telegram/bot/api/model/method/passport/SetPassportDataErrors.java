package io.github.oleksivio.telegram.bot.api.model.method.passport;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.oleksivio.telegram.bot.api.model.NetworkError;
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker;
import io.github.oleksivio.telegram.bot.core.model.method.RunnableAction;
import io.github.oleksivio.telegram.bot.core.model.responses.BooleanResponse;
import io.github.oleksivio.telegram.bot.core.model.responses.CommonResponse;
import io.github.oleksivio.telegram.bot.api.model.objects.passport.errors.PassportElementError;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://core.telegram.org/bots/api#setpassportdataerrors">setPassportDataErrors</a>
 */
public class SetPassportDataErrors extends RunnableAction<Boolean> {
    private static final String METHOD = "setPassportDataErrors";
    /**
     * user_id Integer Yes User identifier
     */
    @JsonProperty("user_id")
    private Integer userId = null;
    /**
     * errors Array of PassportElementError Yes A JSON-serialized array describing the errors
     */
    @JsonProperty("errors")
    private List<PassportElementError> errors = new ArrayList<>();

    public SetPassportDataErrors(ActionNetworker actionNetworker) {
        super(METHOD, actionNetworker);
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    protected Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return BooleanResponse.class;
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
