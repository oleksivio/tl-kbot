package ru.ioleksiv.telegram.bot.core.controller.handler.check;

public interface Validator<T> {
    boolean check(T argument);
}
