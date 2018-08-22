package ru.ioleksiv.telegram.bot.api.annotations.filter.primitive;

import ru.ioleksiv.telegram.bot.api.model.annotation.AnnotationState;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface DoubleFilter {

    AnnotationState status() default AnnotationState.ON;

    double lessThan() default Double.MAX_VALUE;

    double lessOrEqual() default Double.MAX_VALUE;

    double moreThan() default Double.MIN_VALUE;

    double moreOrEqual() default Double.MIN_VALUE;

    double equal() default Double.NaN;

}
