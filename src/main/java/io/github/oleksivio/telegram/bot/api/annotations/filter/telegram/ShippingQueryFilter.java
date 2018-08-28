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
public @interface ShippingQueryFilter {

    AnnotationState status() default AnnotationState.ON;

    String[] validator() default {};

    UserFilter from() default @UserFilter(status = AnnotationState.OFF);

    StringFilter invoicePayload() default @StringFilter(status = AnnotationState.OFF);

    ShippingAddressFilter shippingAddress() default @ShippingAddressFilter(status = AnnotationState.OFF);

}
