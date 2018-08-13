package ru.ioleksiv.telegram.bot.core.controller.handler.check;

import org.jetbrains.annotations.Nullable;

public class NotNullChecker<T> implements Checker<T> {

    @Override
    public boolean check(@Nullable T argument) {
        return argument != null;
    }

}
