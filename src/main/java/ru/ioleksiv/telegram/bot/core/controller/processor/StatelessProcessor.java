package ru.ioleksiv.telegram.bot.core.controller.processor;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.ioleksiv.telegram.bot.core.api.model.objects.Update;
import ru.ioleksiv.telegram.bot.core.api.result.HandlerResult;
import ru.ioleksiv.telegram.bot.core.controller.handler.Handler;

public class StatelessProcessor {
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

    @NotNull
    HandlerResult process(@Nullable Update update) {
        if (!mMainHandler.isAcceptable(update)) {
            return HandlerResult.pass();
        }

        if (mBeforeMethod != null) {
            HandlerResult beforeActions = mBeforeMethod.invoke(update);

            if (!beforeActions.isPassed()) {
                return beforeActions;
            }
        }

        HandlerResult resultActionList = mMainHandler.invoke(update);

        if (!resultActionList.isPassed()) {
            return resultActionList;
        }

        if (mAfterMethod != null) {
            HandlerResult afterActions = mAfterMethod.invoke(update);

            if (!afterActions.isPassed()) {
                return afterActions;
            }
        }

        return HandlerResult.pass();
    }

}
