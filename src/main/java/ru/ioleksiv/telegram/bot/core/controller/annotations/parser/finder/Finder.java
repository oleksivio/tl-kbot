package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder;

import ru.ioleksiv.telegram.bot.core.controller.handler.check.Validator;
import ru.ioleksiv.telegram.bot.core.model.ITelegram;

import java.lang.annotation.Annotation;

public interface Finder {
    <SA extends Annotation, T> Validator<T> find(SA annotation);

    <T extends ITelegram> Validator<T> find(String validatorName, Class<T> targetClass);

}
