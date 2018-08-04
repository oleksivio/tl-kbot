package ru.ioleksiv.telegram.bot.core.controller.handler.filter;

import org.jetbrains.annotations.NotNull;

public interface Filter<T> {
    boolean check(@NotNull T argument);
}
