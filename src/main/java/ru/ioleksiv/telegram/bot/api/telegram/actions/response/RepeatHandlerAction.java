package ru.ioleksiv.telegram.bot.api.telegram.actions.response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.ioleksiv.telegram.bot.api.telegram.actions.IAction;

public class RepeatHandlerAction implements IAction {
    private static final Logger LOGGER = LoggerFactory.getLogger(RepeatHandlerAction.class);

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public String getMethod() {
        return "repeatHandlerAction";
    }
}
