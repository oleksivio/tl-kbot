package ru.ioleksiv.telegram.bot.core.model.telegram.method;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.method.interfaces.ChatAction;
import ru.ioleksiv.telegram.bot.core.model.telegram.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.telegram.responses.ResponseCollection;

/**
 * @see <a href="https://core.telegram.org/bots/api#sendchataction">sendChatAction</a>
 */
public class SendChatAction extends ChatAction<Boolean> {
    private static final String METHOD = "sendChatAction";

    /**
     * action	String	Yes	Type of action to broadcast.
     * Choose one, depending on what the user is about to receive:
     * typing for text messages,
     * upload_photo for photos,
     * record_video or upload_video for videos,
     * record_audio or upload_audio for audio files,
     * upload_document for general files,
     * find_location for location data,
     * record_video_note or
     * upload_video_note for video notes.
     */
    @JsonProperty("action")
    private String action = null;

    public SendChatAction(Networker networker) {
        super(METHOD, networker);
    }

    public String getAction() {
        return action;
    }

    public SendChatAction setAction(String action) {
        this.action = action;
        return this;
    }

    @Override
    public Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return ResponseCollection.BooleanResponse.class;
    }

    @Override
    public SendChatAction setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }
}
