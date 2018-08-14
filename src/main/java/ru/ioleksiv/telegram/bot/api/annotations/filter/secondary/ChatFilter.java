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
public @interface ChatFilter {

    AnnotationState value() default AnnotationState.ON;

    StringFilter type() default @StringFilter(AnnotationState.OFF);

    StringFilter title() default @StringFilter(AnnotationState.OFF);

    StringFilter username() default @StringFilter(AnnotationState.OFF);

    StringFilter firstName() default @StringFilter(AnnotationState.OFF);

    StringFilter lastName() default @StringFilter(AnnotationState.OFF);

    BooleanFilter allMembersAreAdministrators() default @BooleanFilter(AnnotationState.OFF);

}
