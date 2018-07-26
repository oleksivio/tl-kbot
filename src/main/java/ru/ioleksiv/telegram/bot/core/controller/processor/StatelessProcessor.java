package ru.ioleksiv.telegram.bot.core.controller.processor;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.core.api.TelegramProcessor;
import ru.ioleksiv.telegram.bot.core.api.result.HandlerResult;
import ru.ioleksiv.telegram.bot.core.controller.handler.Handler;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.Update;

public class StatelessProcessor implements TelegramProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger(StatelessProcessor.class);

    @Nullable
    private final Handler mBeforeMethod;
    @Nullable
    private final Handler mAfterMethod;

    @NotNull
    private final Handler mMainHandler;

    public StatelessProcessor(@Nullable Handler beforeMethod, @Nullable Handler afterMethod,
                              @NotNull Handler mainHandler) {
        mBeforeMethod = beforeMethod;
        mAfterMethod = afterMethod;
        mMainHandler = mainHandler;
    }

    @Override
    @NotNull
    public HandlerResult process(@Nullable Update update) {
        if (!mMainHandler.isAcceptable(update)) {
            return HandlerResult.noAction();
        }

        if (mBeforeMethod != null) {
            HandlerResult beforeActions = mBeforeMethod.invoke(update);

            if (!beforeActions.hasNoAction()) {
                return beforeActions;
            }
        }

        HandlerResult resultActionList = mMainHandler.invoke(update);

        if (!resultActionList.hasNoAction()) {
            return resultActionList;
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
