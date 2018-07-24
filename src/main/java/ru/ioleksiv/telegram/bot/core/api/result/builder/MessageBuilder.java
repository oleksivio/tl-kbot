package ru.ioleksiv.telegram.bot.core.api.result.builder;

import org.jetbrains.annotations.NotNull;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.method.IAction;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.method.response.KeyboardSendMessageAction;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.method.response.SendMessageApi;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.type.keyboard.IKeyboard;

public class MessageBuilder implements IActionBuilder {
    private Long mChatId = null;
    private String mText = null;
    private IKeyboard mKeyboard = null;

    private MessageBuilder() {
    }

    @NotNull
    public static MessageBuilder create() {
        return new MessageBuilder();
    }

    @Override
    @NotNull
    public IAction build() {
        SendMessageApi sendMessageAction = null;

        if (mKeyboard != null) {
            KeyboardSendMessageAction keyboard = new KeyboardSendMessageAction();
            keyboard.setKeyboard(mKeyboard);

            sendMessageAction = keyboard;
        }

        if (sendMessageAction == null) {
            sendMessageAction = new SendMessageApi();
        }

        sendMessageAction.setChatId(mChatId);
        sendMessageAction.setText(mText);

        return sendMessageAction;
    }

    public MessageBuilder setKeyboard(IKeyboard keyboard) {
        mKeyboard = keyboard;
        return this;
    }

    public MessageBuilder setChatId(long chatId) {
        mChatId = chatId;
        return this;
    }

    public MessageBuilder setText(String text) {
        mText = text;
        return this;
    }

}
