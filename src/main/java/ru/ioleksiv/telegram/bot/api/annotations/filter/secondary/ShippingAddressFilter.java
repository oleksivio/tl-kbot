package ru.ioleksiv.telegram.bot.api.annotations.filter.secondary;

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
public @interface ShippingAddressFilter {

    AnnotationState value() default AnnotationState.ON;

    StringFilter countryCode() default @StringFilter(AnnotationState.OFF);

    StringFilter state() default @StringFilter(AnnotationState.OFF);

    StringFilter city() default @StringFilter(AnnotationState.OFF);

    StringFilter streetLine1() default @StringFilter(AnnotationState.OFF);

    StringFilter streetLine2() default @StringFilter(AnnotationState.OFF);

    StringFilter postCode() default @StringFilter(AnnotationState.OFF);

}
