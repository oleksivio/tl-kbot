package ru.ioleksiv.telegram.bot.api.model.annotation.stub;

import ru.ioleksiv.telegram.bot.api.model.annotation.CustomValidator;

public class StubCustomValidator<T> implements CustomValidator<T> {
    @Override
    public boolean check(T argument) {
        return true;
    }
}
