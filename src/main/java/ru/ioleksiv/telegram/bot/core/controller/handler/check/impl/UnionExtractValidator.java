package ru.ioleksiv.telegram.bot.core.controller.handler.check.impl;

import ru.ioleksiv.telegram.bot.core.controller.handler.check.Validator;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpack.Unpacker;

import java.util.ArrayList;
import java.util.Collection;

public class UnionExtractValidator<T> implements Validator<T> {

    private final Collection<Validator<T>> validatorCollection = new ArrayList<>();

    public <OUT> void add(Unpacker<T, OUT> unpacker, Validator<OUT> validator) {
        validatorCollection.add(new ExtractValidator<>(unpacker, validator));
    }

    @Override
    public boolean check(T argument) {
        return validatorCollection.stream().allMatch(checker -> checker.check(argument));
    }
}
