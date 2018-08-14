package ru.ioleksiv.telegram.bot.core.controller.handler.unpack;

import org.jetbrains.annotations.NotNull;

import java.util.Optional;

public interface Unpacker<IN, OUT> {
    Optional<OUT> unpack(@NotNull IN input);

}
