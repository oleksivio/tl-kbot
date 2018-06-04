package ru.ioleksiv.telegram.bot.api.telegram.actions.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.ioleksiv.telegram.api.bot.core.telegram.actions.IAction;
import ru.ioleksiv.telegram.api.bot.core.telegram.actions.response.KeyboardSendMessageAction;
import ru.ioleksiv.telegram.api.bot.core.telegram.actions.response.SendMessageApi;
import ru.ioleksiv.telegram.api.bot.core.telegram.model.keyboard.IKeyboard;

public class SendMessageBuilder extends AbstractBuilder {
    private static final Logger LOGGER = LoggerFactory.getLogger(SendMessageBuilder.class);
    private Long mChatId = null;
    private String mText = null;
    private IKeyboard mKeyboard = null;

    SendMessageBuilder(ActionBuilder actionBuilder) {
        super(actionBuilder);
    }

    @Override
    protected IAction build() {
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

    public SendMessageBuilder setKeyboard(IKeyboard keyboard) {
        mKeyboard = keyboard;
        return this;
    }

    public SendMessageBuilder setChatId(long chatId) {
        mChatId = chatId;
        return this;
    }

    public SendMessageBuilder setText(String text) {
        mText = text;
        return this;
    }

}
