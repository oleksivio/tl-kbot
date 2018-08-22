package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder;

import ru.ioleksiv.telegram.bot.core.controller.handler.check.Validator;

import java.lang.annotation.Annotation;

public interface Finder {
    <SA extends Annotation, T> Validator<T> find(SA annotation);

    <T> Validator<T> find(Class<? extends Validator> validatorClass);

}
