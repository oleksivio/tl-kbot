package ru.ioleksiv.telegram.bot.core.controller.handler.check.impl;

import org.jetbrains.annotations.Nullable;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpack.Unpacker;

import java.util.ArrayList;
import java.util.Collection;

public class UnionExtractChecker<T> implements Checker<T> {

    private final Collection<Checker<T>> checkerCollection = new ArrayList<>();

    public <OUT> void add(Unpacker<T, OUT> unpacker, Checker<OUT> checker) {
        checkerCollection.add(new ExtractChecker<>(unpacker, checker));
    }

    @Override
    public boolean check(@Nullable T argument) {
        return checkerCollection.stream().allMatch(checker -> checker.check(argument));
    }
}
