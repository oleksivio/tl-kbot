package ru.ioleksiv.telegram.bot.core.controller.handler.unpack;

import org.jetbrains.annotations.NotNull;
import ru.ioleksiv.telegram.bot.core.model.ITelegram;

import java.util.Optional;

public interface Unpacker<IN extends ITelegram, OUT> {
    Optional<OUT> unpack(@NotNull IN input);

}
