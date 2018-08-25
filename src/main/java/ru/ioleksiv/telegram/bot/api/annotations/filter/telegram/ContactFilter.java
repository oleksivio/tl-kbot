package ru.ioleksiv.telegram.bot.api.annotations.filter.telegram;

import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.NotNullFilter;
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
public @interface ContactFilter {

    AnnotationState status() default AnnotationState.ON;

    String[] validator() default {};

    StringFilter phoneNumber() default @StringFilter(status = AnnotationState.OFF);

    StringFilter firstName() default @StringFilter(status = AnnotationState.OFF);

    StringFilter lastName() default @StringFilter(status = AnnotationState.OFF);

    StringFilter vCard() default @StringFilter(status = AnnotationState.OFF);

    NotNullFilter userId() default @NotNullFilter(status = AnnotationState.OFF);

}
