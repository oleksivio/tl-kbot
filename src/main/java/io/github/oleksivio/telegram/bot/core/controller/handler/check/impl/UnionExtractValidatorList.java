package io.github.oleksivio.telegram.bot.core.controller.handler.check.impl;

import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator;
import io.github.oleksivio.telegram.bot.core.controller.handler.unpack.Unpacker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UnionExtractValidatorList<ELEM> implements Validator<List<ELEM>> {

    private final Collection<Validator<ELEM>> validatorCollection = new ArrayList<>();

    public <OUT> void add(Unpacker<ELEM, OUT> unpacker, Validator<OUT> validator) {
        validatorCollection.add(new ExtractValidator<>(unpacker, validator));
    }

    @Override
    public boolean check(List<ELEM> argument) {
        return argument.stream()
                .anyMatch(elem -> validatorCollection.stream().allMatch(checker -> checker.check(elem)));

    }

}
