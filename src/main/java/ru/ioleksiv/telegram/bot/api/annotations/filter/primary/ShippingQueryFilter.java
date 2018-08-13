package ru.ioleksiv.telegram.bot.api.annotations.filter.primary;

import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.StringFilter;
import ru.ioleksiv.telegram.bot.core.model.AnnotationState;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface ShippingQueryFilter {

    AnnotationState value() default AnnotationState.ON;

    StringFilter invoicePayload() default @StringFilter(AnnotationState.OFF);

    StringFilter shippingAddress() default @StringFilter(AnnotationState.OFF);

}
