package ru.ioleksiv.telegram.bot.api.model.method.info;

import ru.ioleksiv.telegram.bot.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.api.model.objects.std.User;
import ru.ioleksiv.telegram.bot.core.controller.network.ActionNetworker;
import ru.ioleksiv.telegram.bot.core.model.method.RunnableAction;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.UserResponse;

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
