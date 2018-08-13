package ru.ioleksiv.telegram.bot.core.controller.annotations.parser;

import java.lang.annotation.Annotation;

public interface Parser<A extends Annotation> {

    Class<A> getAnnotationClass();

}
