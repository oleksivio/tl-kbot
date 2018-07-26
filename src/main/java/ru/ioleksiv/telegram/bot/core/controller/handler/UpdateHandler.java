package ru.ioleksiv.telegram.bot.core.controller.handler;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.ioleksiv.telegram.bot.core.model.telegram.objects.Update;

import java.lang.reflect.Method;

public class UpdateHandler extends Handler<Update> {

    public UpdateHandler(@NotNull Object classInstance, @NotNull Method method) {
        super(classInstance, method);
    }

    @Nullable
    @Override
    protected Update unpacker(@NotNull Update update) {
        return update;
    }

    @Override
    protected boolean checker(@NotNull Update argument) {

        return true;
    }

}
