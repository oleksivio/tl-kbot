package ru.ioleksiv.telegram.bot.core.controller.handler.check.impl;

import ru.ioleksiv.telegram.bot.core.controller.handler.check.Validator;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpack.Unpacker;

import java.util.Optional;

public class ExtractValidator<IN, OUT> implements Validator<IN> {

    private final Unpacker<IN, OUT> unpacker;
    private final Validator<OUT> validator;

    public ExtractValidator(Unpacker<IN, OUT> unpacker,
                            Validator<OUT> validator) {
        this.unpacker = unpacker;
        this.validator = validator;
    }

    @Override
    public boolean check(IN argument) {
        return Optional.of(argument)
                .flatMap(unpacker::unpack)
                .filter(validator::check)
                .isPresent();

    }

}
