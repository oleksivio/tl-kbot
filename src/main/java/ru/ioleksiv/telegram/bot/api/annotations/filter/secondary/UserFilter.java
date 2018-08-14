package ru.ioleksiv.telegram.bot.api.annotations.filter.secondary;

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
public @interface UserFilter {

    AnnotationState value() default AnnotationState.ON;

    StringFilter firstName() default @StringFilter(AnnotationState.OFF);

    StringFilter lastName() default @StringFilter(AnnotationState.OFF);

    StringFilter username() default @StringFilter(AnnotationState.OFF);

    StringFilter languageCode() default @StringFilter(AnnotationState.OFF);

    BooleanFilter bot() default @BooleanFilter(AnnotationState.OFF);

}
