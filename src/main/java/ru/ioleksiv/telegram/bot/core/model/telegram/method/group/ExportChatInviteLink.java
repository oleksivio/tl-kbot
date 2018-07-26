package ru.ioleksiv.telegram.bot.core.model.telegram.method.group;

import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.method.interfaces.ChatAction;
import ru.ioleksiv.telegram.bot.core.model.telegram.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.telegram.responses.ResponseCollection;

/**
 * @see <a href="https://core.telegram.org/bots/api#exportchatinvitelink>exportChatInviteLink</a>
 */
public class ExportChatInviteLink  extends ChatAction<String > {
    private static final String METHOD = "exportChatInviteLink";

    protected ExportChatInviteLink(Networker networker) {
        super(METHOD, networker);
    }

    @Override
    public Class<? extends CommonResponse<String>> getResultWrapperClass() {
        return ResponseCollection.StringResponse.class;
    }

}
