package ru.ioleksiv.telegram.bot.core.model.telegram.model.method.files;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.method.interfaces.ChatAction;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.type.Message;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.type.files.inputmedia.InputMedia;
import ru.ioleksiv.telegram.bot.core.model.telegram.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.telegram.responses.ResponseCollection;

import java.util.ArrayList;
import java.util.List;

/**
 * @link https://core.telegram.org/bots/api#sendmediagroup
 */
public class SendMediaGroup extends ChatAction<Message> {
    private static final String METHOD = "sendMediaGroup";
    /**
     * media	Array of InputMedia	Yes	A JSON-serialized array describing photos and videos to be
     * sent, must include 2–10 items
     */
    @JsonProperty("media")
    private List<InputMedia> media = new ArrayList<>();
    /**
     * disable_notification	Boolean	Optional	Sends the messages silently. Users will receive a
     * notification with no sound.
     */
    @JsonProperty("disable_notification")
    private Boolean disableNotification;
    /**
     * reply_to_message_id	Integer	Optional	If the messages are a reply, ID of the original message
     */
    @JsonProperty("reply_to_message_id")
    private Long replyToMessageId;
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
    public Class<? extends CommonResponse<Message>> getResultWrapperClass() {
        return ResponseCollection.MessageResponse.class;
    }
}
