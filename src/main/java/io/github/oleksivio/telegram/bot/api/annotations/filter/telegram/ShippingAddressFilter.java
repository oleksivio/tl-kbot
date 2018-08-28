package io.github.oleksivio.telegram.bot.api.annotations.filter.telegram;

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
public @interface ShippingAddressFilter {

    AnnotationState status() default AnnotationState.ON;

    String[] validator() default {};

    StringFilter countryCode() default @StringFilter(status = AnnotationState.OFF);

    StringFilter state() default @StringFilter(status = AnnotationState.OFF);

    StringFilter city() default @StringFilter(status = AnnotationState.OFF);

    StringFilter streetLine1() default @StringFilter(status = AnnotationState.OFF);

    StringFilter streetLine2() default @StringFilter(status = AnnotationState.OFF);

    StringFilter postCode() default @StringFilter(status = AnnotationState.OFF);

}
