package ru.ioleksiv.telegram.bot.api.annotations.filter.secondary;

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

    AnnotationState value() default AnnotationState.ON;

    StringFilter phoneNumber() default @StringFilter(AnnotationState.OFF);

    StringFilter firstName() default @StringFilter(AnnotationState.OFF);

    StringFilter lastName() default @StringFilter(AnnotationState.OFF);

    StringFilter vCard() default @StringFilter(AnnotationState.OFF);

    NotNullFilter userId() default @NotNullFilter(AnnotationState.OFF);

}
