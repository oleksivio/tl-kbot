package ru.ioleksiv.telegram.bot.core.model.method.interfaces;

import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.objects.std.Message;
import ru.ioleksiv.telegram.bot.core.model.objects.std.keyboard.IKeyboard;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;

public abstract class UploadMessageFile extends UploadFile<Message> {
    /**
     * reply_markup	InlineKeyboardMarkup or ReplyKeyboardMarkup or ReplyKeyboardRemove or ForceReply
     * Optional	Additional interface options. A JSON-serialized object for an inline keyboard,
     * custom reply keyboard, instructions to remove reply keyboard or to force a reply
     * from the user.
     */
    private static final String REPLY_MARKUP_KEY = "reply_markup";
    /**
     * disable_notification	Boolean	Optional	Sends the message silently. Users will receive a
     * notification with no sound.
     */
    protected static final String DISABLE_NOTIFICATION_KEY = "disable_notification";
    /**
     * reply_to_message_id	Integer	Optional	If the message is a reply, ID of the original message
     */
    protected static final String REPLY_TO_MESSAGE_ID = "reply_to_message_id";
    /**
     * chat_id	Integer or String Unique identifier for the target chat or username of the
     * target channel (in the format @channelusername)
     */
    protected static final String CHAT_ID_KEY = "chat_id";

    protected UploadMessageFile(String method, Networker networker) {
        super(method, networker);
    }

    protected void putReplyMarkup(IKeyboard keyboard) {
        putObject(REPLY_MARKUP_KEY, keyboard);
    }

    @Override
   protected Class<? extends CommonResponse<Message>> getResultWrapperClass() {
        return ResponseCollection.MessageResponse.class;
    }
}
