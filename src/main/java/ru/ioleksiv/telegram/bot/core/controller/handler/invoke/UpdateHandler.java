package ru.ioleksiv.telegram.bot.core.controller.handler.invoke;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.core.model.telegram.interfaces.ITelegram;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.Update;

import java.lang.reflect.Method;

public class UpdateHandler extends AbstractInvokeHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(UpdateHandler.class);

    public UpdateHandler(@NotNull Object classInstance, @NotNull Method method) {
        super(classInstance, method);
    }

    @Override
    public boolean isAcceptable(Update update) {
        return update != null;
    }

    @Override
    protected @Nullable ITelegram unpackMethodParameter(Update update) {
        return update;
    }

}
