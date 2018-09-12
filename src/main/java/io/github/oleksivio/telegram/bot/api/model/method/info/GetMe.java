package io.github.oleksivio.telegram.bot.api.model.method.info;

import io.github.oleksivio.telegram.bot.api.model.NetworkError;
import io.github.oleksivio.telegram.bot.api.model.objects.std.User;
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker;
import io.github.oleksivio.telegram.bot.core.model.responses.UserResponse;
import io.github.oleksivio.telegram.bot.core.model.method.RunnableAction;
import io.github.oleksivio.telegram.bot.core.model.responses.CommonResponse;

/**
 * @see <a href="https://core.telegram.org/bots/api#getme">getMe</a>
 */
public class GetMe extends RunnableAction<User> {
    private static final String METHOD = "getMe";

    public GetMe(ActionNetworker actionNetworker) {
        super(METHOD, actionNetworker);
    }

    @Override
    protected Class<? extends CommonResponse<User>> getResultWrapperClass() {
        return UserResponse.class;
    }

    @Override
    public GetMe setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }
}