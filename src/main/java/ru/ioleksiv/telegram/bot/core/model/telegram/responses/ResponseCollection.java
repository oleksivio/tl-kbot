package ru.ioleksiv.telegram.bot.core.model.telegram.responses;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.Update;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.type.Message;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.type.User;

import java.util.List;

public final class ResponseCollection {
    private static final Logger LOG = LoggerFactory.getLogger(ResponseCollection.class);

    public class MessageResponse extends CommonResponse<Message> {
    }

    public class UserResponse extends CommonResponse<User> {
    }

    public class UpdatesArrayResponse extends CommonResponse<List<Update>> {
    }

    public class BooleanResponse extends CommonResponse<Boolean>{
    }

}
