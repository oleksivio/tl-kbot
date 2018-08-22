package ru.ioleksiv.telegram.bot.api.annotations.filter.primitive;

import ru.ioleksiv.telegram.bot.api.model.annotation.AnnotationState;
import ru.ioleksiv.telegram.bot.api.model.annotation.BooleanState;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface BooleanFilter {

    AnnotationState status() default AnnotationState.ON;

    BooleanState state() default BooleanState.NON_NULL;

}
