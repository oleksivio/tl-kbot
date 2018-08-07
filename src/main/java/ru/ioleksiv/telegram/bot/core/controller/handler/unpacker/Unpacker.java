package ru.ioleksiv.telegram.bot.core.controller.handler.unpacker;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface Unpacker<IN, OUT> {
    @Nullable
    OUT unpack(@NotNull IN input);
}
