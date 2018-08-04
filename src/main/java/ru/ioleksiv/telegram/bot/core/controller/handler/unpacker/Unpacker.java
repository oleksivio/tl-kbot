package ru.ioleksiv.telegram.bot.core.controller.handler.unpacker;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.ioleksiv.telegram.bot.core.api.model.objects.Update;

public interface Unpacker<T> {
     @Nullable
     T unpack(@NotNull Update update);
}
