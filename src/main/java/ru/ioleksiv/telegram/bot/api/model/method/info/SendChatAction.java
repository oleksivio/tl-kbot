package ru.ioleksiv.telegram.bot.api.model.method.info;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.core.controller.network.ActionNetworker;
import ru.ioleksiv.telegram.bot.core.model.method.ChatAction;
import ru.ioleksiv.telegram.bot.core.model.responses.BooleanResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;

/**
 * @see <a href="https://core.telegram.org/bots/api#sendchataction">sendChatAction</a>
 */
public class SendChatAction extends ChatAction<Boolean> {
    private static final String METHOD = "sendChatAction";

    /**
     * action String Type of action to broadcast.
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

    public SendChatAction(ActionNetworker actionNetworker) {
        super(METHOD, actionNetworker);
    }

    public String getAction() {
        return action;
    }

    public SendChatAction setAction(Type action) {
        this.action = action.stringName();
        return this;
    }

    @Override
    protected Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return BooleanResponse.class;
    }

    @Override
    public SendChatAction setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }

    @Override
    public SendChatAction setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }

    public enum Type {
        ACTION_TYPING("typing"),
        ACTION_UPLOAD_PHOTO("upload_photo"),
        ACTION_RECORD_VIDEO("record_video"),
        ACTION_RECORD_AUDIO("record_audio"),
        ACTION_UPLOAD_DOCUMENT("upload_document"),
        ACTION_FIND_LOCATION("find_location"),
        ACTION_RECORD_VIDEO_NOTE("record_video_note"),
        ACTION_UPLOAD_VIDEO_NOTE("upload_video_note");

        private final String name;

        Type(String name) {
            this.name = name;
        }

        public String stringName() {
            return name;
        }
    }
}
