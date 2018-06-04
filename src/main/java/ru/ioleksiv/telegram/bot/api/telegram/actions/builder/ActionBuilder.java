package ru.ioleksiv.telegram.bot.api.telegram.actions.builder;

import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

import ru.ioleksiv.telegram.bot.api.telegram.actions.IAction;

public final class ActionBuilder {
    private static final Logger LOGGER = LoggerFactory.getLogger(ActionBuilder.class);

    private final List<IAction> mActions = new ArrayList<>();

    private ActionBuilder() {
    }

    @NotNull
    public static ActionBuilder newInstance() {
        return new ActionBuilder();
    }

    @NotNull
    public SendMessageBuilder sendMessage() {
        return new SendMessageBuilder(this);
    }

    @NotNull
    public InlineBuilder inlineBuilder() {
        return new InlineBuilder(this);
    }

    @NotNull
    public List<IAction> build() {
        return new ArrayList<>(mActions);
    }

    void add(IAction action) {
        mActions.add(action);
    }
}
