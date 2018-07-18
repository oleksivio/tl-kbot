package ru.ioleksiv.telegram.bot.core.controller.handler;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.ioleksiv.telegram.bot.core.api.actions.MessageBuilder;
import ru.ioleksiv.telegram.bot.core.model.actions.IAction;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.Update;
import ru.ioleksiv.telegram.bot.core.utils.ITargetChat;

import java.util.Collections;
import java.util.List;

public class ErrorHandler implements IHandler {

    @NotNull
    private final String mErrorText;
    @NotNull
    private final ITargetChat mTargetChat;

    public ErrorHandler(@NotNull String errorText, @NotNull ITargetChat targetChat) {
        mErrorText = errorText;
        mTargetChat = targetChat;
    }

    @Override
    public boolean isAcceptable(@Nullable Update update) {
        return update != null;
    }

    @Override
    @NotNull
    public List<IAction> invoke(@Nullable Update update) {

        if (update == null) {
            return Collections.emptyList();
        }

        // todo fix logic
        Long chatId = update.getTargetChatId(mTargetChat);

        if (chatId == null || mErrorText.isEmpty()) {
            return Collections.emptyList();
        }

        return new MessageBuilder()
                .setText(mErrorText)
                .setChatId(chatId)
                .build();
    }

}
