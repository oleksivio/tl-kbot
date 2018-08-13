package ru.ioleksiv.telegram.bot.core.controller.handler.check;

import org.jetbrains.annotations.Nullable;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpack.Unpacker;
import ru.ioleksiv.telegram.bot.core.model.ITelegram;

import java.util.ArrayList;
import java.util.Collection;

public class UnionChecker<T extends ITelegram> implements Checker<T> {

    private final Collection<Checker<T>> checkerCollection = new ArrayList<>();

    public <OUT> void add(Unpacker<T, OUT> unpacker, Checker<OUT> checker) {
        checkerCollection.add(new ExtractedChecker<>(unpacker, checker));
    }

    @Override
    public boolean check(@Nullable T argument) {
        return checkerCollection.stream().allMatch(checker -> checker.check(argument));
    }
}
