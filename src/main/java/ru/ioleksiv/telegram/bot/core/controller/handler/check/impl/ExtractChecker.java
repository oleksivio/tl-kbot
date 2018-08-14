package ru.ioleksiv.telegram.bot.core.controller.handler.check.impl;

import org.jetbrains.annotations.Nullable;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpack.Unpacker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

public class ExtractChecker<IN, OUT> implements Checker<IN> {

    private final Collection<Checker<OUT>> subcheckers = new ArrayList<>();

    private final Unpacker<IN, OUT> unpacker;
    private final Checker<OUT> checker;

    public ExtractChecker(Unpacker<IN, OUT> unpacker,
                          Checker<OUT> checker) {
        this.unpacker = unpacker;
        this.checker = checker;
    }

    public void add(Checker<OUT> filter) {
        subcheckers.add(filter);
    }

    @Override
    public boolean check(@Nullable IN argument) {
        return Optional.ofNullable(argument)
                .flatMap(unpacker::unpack)
                .filter(checker::check)
                .filter(unpacker -> subcheckers.stream().allMatch(outChecker -> outChecker.check(unpacker)))
                .isPresent();

    }

}
