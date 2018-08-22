package ru.ioleksiv.telegram.bot.api.annotations.filter.telegram;

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
public @interface InvoiceFilter {

    AnnotationState value() default AnnotationState.ON;

    StringFilter title() default @StringFilter(AnnotationState.OFF);

    StringFilter description() default @StringFilter(AnnotationState.OFF);

    StringFilter startParameter() default @StringFilter(AnnotationState.OFF);

    StringFilter currency() default @StringFilter(AnnotationState.OFF);

    IntegerFilter totalAmount() default @IntegerFilter(AnnotationState.OFF);

}
