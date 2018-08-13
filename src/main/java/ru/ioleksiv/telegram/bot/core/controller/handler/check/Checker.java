package ru.ioleksiv.telegram.bot.core.controller.handler.check;

import jdk.internal.jline.internal.Nullable;

public interface Checker<T> {
    boolean check(@Nullable T argument);
}
