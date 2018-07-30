package ru.ioleksiv.telegram.bot.core.model.method;

import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.method.interfaces.RunnableAction;
import ru.ioleksiv.telegram.bot.core.model.objects.std.User;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;

/**
 * @see <a href="https://core.telegram.org/bots/api#getme">getMe</a>
 */
public class GetMe extends RunnableAction<User> {
    private static final String METHOD = "getMe";

    public GetMe(Networker networker) {
        super(METHOD, networker);
    }

    @Override
    public Class<? extends CommonResponse<User>> getResultWrapperClass() {
        return ResponseCollection.UserResponse.class;
    }
}
