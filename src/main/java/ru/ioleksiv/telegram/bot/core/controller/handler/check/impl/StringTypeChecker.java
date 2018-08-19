package ru.ioleksiv.telegram.bot.core.controller.handler.check.impl;

import org.jetbrains.annotations.Nullable;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;

import java.util.Objects;

public class StringTypeChecker implements Checker<String> {

    private final String type;

    public StringTypeChecker(String type) {
        this.type = type;
    }

    @Override
    public boolean check(@Nullable String argument) {
        return Objects.equals(type, argument);
    }
}
