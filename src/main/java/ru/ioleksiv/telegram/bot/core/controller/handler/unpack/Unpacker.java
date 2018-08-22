package ru.ioleksiv.telegram.bot.core.controller.handler.unpack;

import java.util.Optional;

public interface Unpacker<IN, OUT> {
    Optional<OUT> unpack(IN input);

}
