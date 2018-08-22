package ru.ioleksiv.telegram.bot.core.controller.annotations.parser;

import ru.ioleksiv.telegram.bot.api.model.annotation.stub.StubCustomValidator;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Validator;

import java.util.Objects;

public final class ParserUtils {

    public static boolean isNotStubValidator(Class<? extends Validator> validator) {
        return !Objects.equals(validator.getSuperclass(), StubCustomValidator.class);
    }
}
