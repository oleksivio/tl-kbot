package ru.ioleksiv.telegram.bot.core.controller.handler.checker;

import org.jetbrains.annotations.Nullable;

public interface Checker<T> {
    boolean check(@Nullable T argument);
}
