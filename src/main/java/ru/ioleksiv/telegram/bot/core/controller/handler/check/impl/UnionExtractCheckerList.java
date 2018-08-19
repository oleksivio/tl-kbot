package ru.ioleksiv.telegram.bot.core.controller.handler.check.impl;

import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpack.Unpacker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UnionExtractCheckerList<ELEM> implements Checker<List<ELEM>> {

    private final Collection<Checker<ELEM>> checkerCollection = new ArrayList<>();

    public <OUT> void add(Unpacker<ELEM, OUT> unpacker, Checker<OUT> checker) {
        checkerCollection.add(new ExtractChecker<>(unpacker, checker));
    }

    @Override
    public boolean check(List<ELEM> argument) {
        if (argument == null) {
            return false;
        }

        return argument.stream()
                .anyMatch(elem -> checkerCollection.stream().allMatch(checker -> checker.check(elem)));

    }

}
