package ru.ioleksiv.telegram.bot.core.controller.handler.check.impl;

import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UnionChecker<ELEM> implements Checker<List<ELEM>> {

    private final Collection<Checker<ELEM>> checkerCollection = new ArrayList<>();

    public void add(Checker<ELEM> checker) {
        checkerCollection.add(checker);
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
