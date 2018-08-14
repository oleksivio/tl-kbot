package ru.ioleksiv.telegram.bot.api.annotations.filter.secondary;

import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.model.annotation.AnnotationState;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface MessageEntityFilter {

    AnnotationState value() default AnnotationState.ON;

    StringFilter type() default @StringFilter(AnnotationState.OFF);

    IntegerFilter length() default @IntegerFilter(AnnotationState.OFF);

    StringFilter url() default @StringFilter(AnnotationState.OFF);

    UserFilter user() default @UserFilter(AnnotationState.OFF);

}
