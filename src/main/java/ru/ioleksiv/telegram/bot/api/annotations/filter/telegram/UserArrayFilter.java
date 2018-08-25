package ru.ioleksiv.telegram.bot.api.annotations.filter.telegram;

import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.BooleanFilter;
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
public @interface UserArrayFilter {

    AnnotationState status() default AnnotationState.ON;

    String[] validator() default {};

    StringFilter firstName() default @StringFilter(status = AnnotationState.OFF);

    StringFilter lastName() default @StringFilter(status = AnnotationState.OFF);

    StringFilter username() default @StringFilter(status = AnnotationState.OFF);

    StringFilter languageCode() default @StringFilter(status = AnnotationState.OFF);

    BooleanFilter bot() default @BooleanFilter(status = AnnotationState.OFF);
}
