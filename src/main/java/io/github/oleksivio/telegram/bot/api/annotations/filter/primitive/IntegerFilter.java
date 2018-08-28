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
public @interface IntegerFilter {

    AnnotationState status() default AnnotationState.ON;

    int lessThan() default Integer.MAX_VALUE;

    int lessOrEqual() default Integer.MAX_VALUE;

    int moreThan() default Integer.MIN_VALUE;

    int moreOrEqual() default Integer.MIN_VALUE;

}
