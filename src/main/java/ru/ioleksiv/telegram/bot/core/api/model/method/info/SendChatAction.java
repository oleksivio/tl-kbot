package ru.ioleksiv.telegram.bot.core.api.model.method.info;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.core.model.method.ChatAction;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;

/**
 * @see <a href="https://core.telegram.org/bots/api#sendchataction">sendChatAction</a>
 */
public class SendChatAction extends ChatAction<Boolean> {
    private static final String METHOD = "sendChatAction";

    public static final String ACTION_TYPING = "typing";
    public static final String ACTION_UPLOAD_PHOTO = "upload_photo";
    public static final String ACTION_RECORD_VIDEO = "record_video";
    public static final String ACTION_RECORD_AUDIO = "record_audio";
    public static final String ACTION_UPLOAD_DOCUMENT = "upload_document";
    public static final String ACTION_FIND_LOCATION = "find_location";
    public static final String ACTION_RECORD_VIDEO_NOTE = "record_video_note";
    public static final String ACTION_UPLOAD_VIDEO_NOTE = "upload_video_note";
    /**
     * action	String Type of action to broadcast.
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
    protected Class<? extends CommonResponse<Boolean>> getResultWrapperClass() {
        return ResponseCollection.BooleanResponse.class;
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
}
