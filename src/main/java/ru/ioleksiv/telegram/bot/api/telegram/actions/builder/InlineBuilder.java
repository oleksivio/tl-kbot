package ru.ioleksiv.telegram.bot.api.telegram.actions.builder;

import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.ioleksiv.telegram.api.bot.core.telegram.actions.IAction;

public class InlineBuilder extends AbstractBuilder {
    private static final Logger LOGGER = LoggerFactory.getLogger(InlineBuilder.class);
    private IAction mInlineAction = null;

    protected InlineBuilder(@NotNull ActionBuilder actionBuilder) {
        super(actionBuilder);
    }

    @Override
    protected IAction build() {

        if (mInlineAction != null) {
            return mInlineAction;
        }
        throw new IllegalStateException("Can't build object. Inline Action must be set before building.");

    }

    public InlineBuilder setInlineAction(IAction inlineAction) {
        mInlineAction = inlineAction;
        return this;
    }

}
