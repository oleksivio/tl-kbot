package io.github.oleksivio.telegram.bot.core.controller.handler.check.impl;

import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator;
import io.github.oleksivio.telegram.bot.core.model.type.NamedType;

import java.util.Objects;

public class TypeNameValidator implements Validator<String> {

    private final String type;

    public TypeNameValidator(NamedType type) {
        this.type = type.stringName();
    }

    @Override
    public boolean check(String argument) {
        return Objects.equals(type, argument);
    }
}
