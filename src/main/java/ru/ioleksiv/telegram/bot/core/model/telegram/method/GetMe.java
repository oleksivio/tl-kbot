package ru.ioleksiv.telegram.bot.core.model.telegram.method;

import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.method.interfaces.RunnableAction;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.type.User;
import ru.ioleksiv.telegram.bot.core.model.telegram.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.telegram.responses.ResponseCollection;

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
