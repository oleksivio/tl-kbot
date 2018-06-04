package ru.ioleksiv.telegram.bot.api.telegram.actions.builder;

import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.ioleksiv.telegram.bot.api.telegram.actions.IAction;

public abstract class AbstractBuilder {
    private static final Logger LOGGER = LoggerFactory.getLogger(AbstractBuilder.class);

    private final ActionBuilder mActionBuilder;

    protected AbstractBuilder(@NotNull ActionBuilder actionBuilder) {
        mActionBuilder = actionBuilder;
    }

    public ActionBuilder and() {
        return validate();
    }

    public ActionBuilder validate() {
        IAction action = build();

        if (action.isValid()) {
            mActionBuilder.add(action);

            return mActionBuilder;
        }
        throw new IllegalStateException("Can't build object. IAction object is invalid. ");
    }

    protected abstract IAction build();
}
