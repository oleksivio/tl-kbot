package io.github.oleksivio.telegram.bot.api.annotations.filter.primitive;

import io.github.oleksivio.telegram.bot.api.model.annotation.AnnotationState;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface FloatFilter {

    AnnotationState status() default AnnotationState.ON;

    float lessThan() default Float.MAX_VALUE;

    float lessOrEqual() default Float.MAX_VALUE;

    float moreThan() default Float.MIN_VALUE;

    float moreOrEqual() default Float.MIN_VALUE;

    float equal() default Float.NaN;

}
