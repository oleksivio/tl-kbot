package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder;

import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator;
import io.github.oleksivio.telegram.bot.core.model.ITelegram;

import java.lang.annotation.Annotation;

public interface Finder {
    <SA extends Annotation, T> Validator<T> find(SA annotation);

    <T extends ITelegram> Validator<T> find(String validatorName, Class<T> targetClass);

}
