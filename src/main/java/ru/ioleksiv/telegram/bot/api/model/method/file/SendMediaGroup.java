package ru.ioleksiv.telegram.bot.api.model.method.file;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.api.model.NetworkError;
import ru.ioleksiv.telegram.bot.api.model.objects.std.Message;
import ru.ioleksiv.telegram.bot.api.model.objects.std.files.inputmedia.InputMedia;
import ru.ioleksiv.telegram.bot.core.model.method.ChatAction;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://core.telegram.org/bots/api#sendmediagroup">sendMediaGroup</a>
 */
public class SendMediaGroup extends ChatAction<Message> {
    private static final String METHOD = "sendMediaGroup";
    /**
     * media	Array of InputMedia A JSON-serialized array describing photos and videos to be
     * sent, must include 2–10 items
     */
    @JsonProperty("media")
    private List<InputMedia> media = new ArrayList<>();
    /**
     * disable_notification	Boolean	Optional	Sends the messages silently. Users will receive a
     * notification with no sound.
     */
    @JsonProperty("disable_notification")
    private Boolean disableNotification = null;
    /**
     * reply_to_message_id	Integer	Optional	If the messages are a reply, ID of the original message
     */
    @JsonProperty("reply_to_message_id")
    private Long replyToMessageId = null;

    public SendMediaGroup(Networker networker) {
        super(METHOD, networker);
    }

    public List<InputMedia> getMedia() {
        return media;
    }

    public SendMediaGroup setMedia(List<InputMedia> media) {
        this.media = media;
        return this;
    }

    public Boolean getDisableNotification() {
        return disableNotification;
    }

    public SendMediaGroup setDisableNotification(Boolean disableNotification) {
        this.disableNotification = disableNotification;
        return this;
    }

    public Long getReplyToMessageId() {
        return replyToMessageId;
    }

    public SendMediaGroup setReplyToMessageId(Long replyToMessageId) {
        this.replyToMessageId = replyToMessageId;
        return this;
    }

    @Override
    protected Class<? extends CommonResponse<Message>> getResultWrapperClass() {
        return ResponseCollection.MessageResponse.class;
    }

    @Override
    public SendMediaGroup setChatId(Long chatId) {
        pSetChatId(chatId);
        return this;
    }

    @Override
    public SendMediaGroup setNetworkErrorListener(NetworkError onNetworkError) {
        pSetNetworkErrorListener(onNetworkError);
        return this;
    }

}
