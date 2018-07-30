package ru.ioleksiv.telegram.bot.core.model.method.group;

import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.method.interfaces.ChatAction;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;

/**
 * @see <a href="https://core.telegram.org/bots/api#deletechatphoto">deleteChatPhoto</a>
 */
public class DeleteChatPhoto extends ChatAction<Boolean> {
    private static final String METHOD = "deleteChatPhoto";

    protected DeleteChatPhoto(Networker networker) {
        super(METHOD, networker);
    }

    @Override
    public Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return ResponseCollection.BooleanResponse.class;
    }

    @Override
    public DeleteChatPhoto setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }
}
