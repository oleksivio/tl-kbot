package ru.ioleksiv.telegram.bot.core.controller.processor;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.core.api.TelegramProcessor;
import ru.ioleksiv.telegram.bot.core.api.result.HandlerResult;
import ru.ioleksiv.telegram.bot.core.controller.handler.IHandler;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.Update;

public class StatelessProcessor implements TelegramProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger(StatelessProcessor.class);

    @Nullable
    private final IHandler mBeforeMethod;
    @Nullable
    private final IHandler mAfterMethod;

    @NotNull
    private final IHandler mMainHandler;

    public StatelessProcessor(@Nullable IHandler beforeMethod, @Nullable IHandler afterMethod,
                              @NotNull IHandler mainHandler) {
        mBeforeMethod = beforeMethod;
        mAfterMethod = afterMethod;
        mMainHandler = mainHandler;
    }

    @Override
    @NotNull
    public HandlerResult process(@Nullable Update update) {

        if (mBeforeMethod != null) {
            HandlerResult beforeActions = mBeforeMethod.invoke(update);

            if (!beforeActions.hasNoAction()) {
                return beforeActions;
            }
        }

        if (mMainHandler.isAcceptable(update)) {
            HandlerResult resultActionList = mMainHandler.invoke(update);

            if (!resultActionList.hasNoAction()) {
                return resultActionList;
            }
        }

        if (mAfterMethod != null) {
            HandlerResult afterActions = mAfterMethod.invoke(update);

            if (!afterActions.hasNoAction()) {
                return afterActions;
            }
        }

        return HandlerResult.noAction();
    }

}
