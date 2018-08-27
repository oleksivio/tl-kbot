package ru.ioleksiv.telegram.bot.api.annotations.filter.telegram;

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
public @interface PreCheckoutQueryFilter {

    UserFilter from() default @UserFilter(status = AnnotationState.OFF);

    StringFilter currency() default @StringFilter(status = AnnotationState.OFF);

    StringFilter totalAmount() default @StringFilter(status = AnnotationState.OFF);

    StringFilter invoicePayload() default @StringFilter(status = AnnotationState.OFF);

    StringFilter shippingOptionId() default @StringFilter(status = AnnotationState.OFF);

    OrderInfoFilter orderInfo() default @OrderInfoFilter(status = AnnotationState.OFF);

}