package ru.ioleksiv.telegram.bot.core.controller.processor;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.ioleksiv.telegram.bot.core.api.TelegramProcessor;
import ru.ioleksiv.telegram.bot.core.model.actions.IAction;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.Update;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainProcessor implements TelegramProcessor {
    @NotNull
    private final Collection<TelegramProcessor> mStatelessHandlers = new ArrayList<>();
    @NotNull
    private final Collection<TelegramProcessor> mSessionHandlers = new ArrayList<>();
    @Nullable
    private TelegramProcessor mDefaultHandler = null;

    @Override
    @NotNull
    public List<IAction> process(@Nullable Update update) {
        List<IAction> foundSessionHandlers = new ArrayList<>();

        for (TelegramProcessor handler : mSessionHandlers) {
            foundSessionHandlers.addAll(handler.process(update));
        }

        if (!foundSessionHandlers.isEmpty()) {
            return foundSessionHandlers;
        }

        List<IAction> foundStatelessHandlers = new ArrayList<>();

        for (TelegramProcessor handler : mStatelessHandlers) {
            foundStatelessHandlers.addAll(handler.process(update));
        }

        if (!foundStatelessHandlers.isEmpty()) {
            return foundStatelessHandlers;
        }

        if (mDefaultHandler != null) {
            List<IAction> resultList = mDefaultHandler.process(update);

            if (!resultList.isEmpty()) {
                return resultList;
            }
        }

        return Collections.emptyList();

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
