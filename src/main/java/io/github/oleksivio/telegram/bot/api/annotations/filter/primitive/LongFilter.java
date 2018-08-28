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
public @interface LongFilter {

    AnnotationState status() default AnnotationState.ON;

    long lessThan() default Long.MAX_VALUE;

    long lessOrEqual() default Long.MAX_VALUE;

    long moreThan() default Long.MIN_VALUE;

    long moreOrEqual() default Long.MIN_VALUE;

}
