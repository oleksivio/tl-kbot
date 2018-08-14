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
public @interface OrderInfoFilter {

    AnnotationState value() default AnnotationState.ON;

    StringFilter name() default @StringFilter(AnnotationState.OFF);

    StringFilter phoneNumber() default @StringFilter(AnnotationState.OFF);

    StringFilter email() default @StringFilter(AnnotationState.OFF);

    ShippingAddressFilter shippingAddress() default @ShippingAddressFilter(AnnotationState.OFF);

}
