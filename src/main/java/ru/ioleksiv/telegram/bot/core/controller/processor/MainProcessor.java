package ru.ioleksiv.telegram.bot.core.controller.processor;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.ioleksiv.telegram.bot.core.api.TelegramProcessor;
import ru.ioleksiv.telegram.bot.core.api.result.HandlerResult;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.method.IAction;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.Update;

import java.util.ArrayList;
import java.util.Collection;

public class MainProcessor implements TelegramProcessor {
    @NotNull
    private final Collection<TelegramProcessor> mStatelessHandlers = new ArrayList<>();
    @NotNull
    private final Collection<TelegramProcessor> mSessionHandlers = new ArrayList<>();
    @Nullable
    private TelegramProcessor mDefaultHandler = null;

    @Override
    @NotNull
    public HandlerResult process(@Nullable Update update) {

        for (TelegramProcessor handler : mSessionHandlers) {
            HandlerResult handlerResult = handler.process(update);
            if (!handlerResult.hasNoAction()) {
                return handlerResult;
            }
        }

        HandlerResult statelessResults = HandlerResult.success();

        for (TelegramProcessor handler : mStatelessHandlers) {
            HandlerResult processedResult  = handler.process(update);
            for(IAction action : processedResult.getAction()) {
                statelessResults.add(action);
            }
        }

        if (!statelessResults.isEmpty()) {
            return statelessResults;
        }

        if (mDefaultHandler != null) {
            HandlerResult resultList = mDefaultHandler.process(update);

            if (!resultList.isEmpty()) {
                return resultList;
            }
        }

        return HandlerResult.noAction();

    }

    public void addStateless(Collection<TelegramProcessor> processor) {
        mStatelessHandlers.addAll(processor);
    }

    public void addSession(TelegramProcessor processor) {
        mSessionHandlers.add(processor);
    }

    public void setDefault(TelegramProcessor defaultProcessor) {
        mDefaultHandler = defaultProcessor;
    }
}
