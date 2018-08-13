package ru.ioleksiv.telegram.bot.api.annotations.filter.primary;

import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.OrderInfoFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.UserFilter;
import ru.ioleksiv.telegram.bot.core.model.AnnotationState;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface PreCheckoutQueryFilter {

    UserFilter from() default @UserFilter(AnnotationState.OFF);

    StringFilter currency() default @StringFilter(AnnotationState.OFF);

    StringFilter totalAmount() default @StringFilter(AnnotationState.OFF);

    StringFilter invoicePayload() default @StringFilter(AnnotationState.OFF);

    StringFilter shippingOptionId() default @StringFilter(AnnotationState.OFF);

    OrderInfoFilter orderInfo() default @OrderInfoFilter(AnnotationState.OFF);

}
