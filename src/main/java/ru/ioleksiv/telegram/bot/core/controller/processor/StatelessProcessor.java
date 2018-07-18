package ru.ioleksiv.telegram.bot.core.controller.processor;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.core.api.TelegramProcessor;
import ru.ioleksiv.telegram.bot.core.model.actions.IAction;
import ru.ioleksiv.telegram.bot.core.controller.handler.IHandler;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.Update;

import java.util.Collections;
import java.util.List;

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

    @NotNull
    @Override
    public List<IAction> process(@Nullable Update update) {

        if (mBeforeMethod != null) {
            List<IAction> beforeActions = mBeforeMethod.invoke(update);

            if (!beforeActions.isEmpty()) {
                return beforeActions;
            }
        }

        if (mMainHandler.isAcceptable(update)) {
            List<IAction> resultActionList = mMainHandler.invoke(update);

            if (!resultActionList.isEmpty()) {
                return resultActionList;
            }
        }

        if (mAfterMethod != null) {
            List<IAction> afterActions = mAfterMethod.invoke(update);

            if (!afterActions.isEmpty()) {
                return afterActions;
            }
        }

        return Collections.emptyList();
    }

}
