package ru.ioleksiv.telegram.bot.core.api.result.actions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.core.model.actions.IAction;

public class InlineBuilder{
    private static final Logger LOGGER = LoggerFactory.getLogger(InlineBuilder.class);
    private IAction mInlineAction = null;



    public IAction build() {

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
