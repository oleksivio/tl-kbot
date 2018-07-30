package ru.ioleksiv.telegram.bot.core.model.method.file;

import org.jetbrains.annotations.Nullable;
import org.springframework.core.io.FileSystemResource;
import org.springframework.util.LinkedMultiValueMap;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.model.method.interfaces.IAction;
import ru.ioleksiv.telegram.bot.core.model.objects.std.Message;
import ru.ioleksiv.telegram.bot.core.model.objects.std.keyboard.IKeyboard;
import ru.ioleksiv.telegram.bot.core.model.responses.CommonResponse;
import ru.ioleksiv.telegram.bot.core.model.responses.ResponseCollection;

public abstract class UploadFile implements IAction<Message> {
    private static final String METHOD_KEY = "method";
    /**
     * reply_markup	InlineKeyboardMarkup or ReplyKeyboardMarkup or ReplyKeyboardRemove or ForceReply
     * Optional	Additional interface options. A JSON-serialized object for an inline keyboard,
     * custom reply keyboard, instructions to remove reply keyboard or to force a reply
     * from the user.
     */
    private static final String REPLY_MARKUP_KEY = "reply_markup";
    /**
     * caption	String	Optional	File caption (may also be used when resending file by file_id),
     * 0-200 characters
     */
    protected static final String CAPTION_KEY = "caption";
    /**
     * parse_mode	String	Optional	Send Markdown or HTML, if you want Telegram apps to show bold,
     * italic, fixed-width text or inline URLs in your bot's message.
     */
    protected static final String PARSE_MODE_KEY = "parse_mode";
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

    private final Networker networker;
    private final LinkedMultiValueMap<String, Object> requestMap;

    UploadFile(String method, Networker networker) {
        this.networker = networker;
        requestMap = new LinkedMultiValueMap<>();
        requestMap.add(METHOD_KEY, method);
    }

    @Override
    @Nullable
    public Message send() {

        CommonResponse<Message> uploadResponse = networker.upload(requestMap,
                                                                  getResultWrapperClass());
        if (uploadResponse == null) {
            return null;
        }

        return uploadResponse.get();
    }

    @Override
    public Class<? extends CommonResponse<Message>> getResultWrapperClass() {
        return ResponseCollection.MessageResponse.class;
    }

    protected void putFile(String key, FileSystemResource file) {
        putObject(key, file);
    }

    private void putObject(String key, Object object) {
        if (object != null) {
            requestMap.add(key, object);
        }
    }

    protected void putInt(String key, Integer integerValue) {
        putObject(key, integerValue);
    }

    protected void putLong(String key, Long longValue) {
        putObject(key, longValue);
    }

    protected void putReplyMarkup(IKeyboard keyboard) {
        putObject(REPLY_MARKUP_KEY, keyboard);
    }

    protected void putString(String key, String stringValue) {
        requestMap.add(key, stringValue);
    }

    protected void putBool(String key, Boolean booleanValue) {
        putObject(key, booleanValue);
    }

}
