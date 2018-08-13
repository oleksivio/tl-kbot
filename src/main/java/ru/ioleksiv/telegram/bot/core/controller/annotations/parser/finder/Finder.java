package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder;

import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;

import java.lang.annotation.Annotation;

public interface Finder {
    <SA extends Annotation, T> Checker<T> find(SA annotation);

}
