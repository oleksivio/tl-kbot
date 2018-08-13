package ru.ioleksiv.telegram.bot.api.annotations.filter.secondary;

import ru.ioleksiv.telegram.bot.core.model.AnnotationState;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface GameFilter {

    AnnotationState value() default AnnotationState.ON;
}
