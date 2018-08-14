package ru.ioleksiv.telegram.bot.core.controller.handler.check.impl;

import org.jetbrains.annotations.Nullable;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;

public class NotNullChecker<T> implements Checker<T> {

    @Override
    public boolean check(@Nullable T argument) {
        return argument != null;
    }

}
