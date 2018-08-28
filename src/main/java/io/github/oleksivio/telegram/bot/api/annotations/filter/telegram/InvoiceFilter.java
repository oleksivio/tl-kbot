package io.github.oleksivio.telegram.bot.api.annotations.filter.telegram;

import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter;
import io.github.oleksivio.telegram.bot.api.model.annotation.AnnotationState;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface InvoiceFilter {

    AnnotationState status() default AnnotationState.ON;

    String[] validator() default {};

    StringFilter title() default @StringFilter(status = AnnotationState.OFF);

    StringFilter description() default @StringFilter(status = AnnotationState.OFF);

    StringFilter startParameter() default @StringFilter(status = AnnotationState.OFF);

    StringFilter currency() default @StringFilter(status = AnnotationState.OFF);

    IntegerFilter totalAmount() default @IntegerFilter(status = AnnotationState.OFF);

}
