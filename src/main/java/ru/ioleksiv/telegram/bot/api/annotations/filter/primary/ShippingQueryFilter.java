package ru.ioleksiv.telegram.bot.api.annotations.filter.primary;

import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.ShippingAddressFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.UserFilter;
import ru.ioleksiv.telegram.bot.api.model.annotation.AnnotationState;

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

    UserFilter from() default @UserFilter(AnnotationState.OFF);

    StringFilter invoicePayload() default @StringFilter(AnnotationState.OFF);

    ShippingAddressFilter shippingAddress() default @ShippingAddressFilter(AnnotationState.OFF);

}
