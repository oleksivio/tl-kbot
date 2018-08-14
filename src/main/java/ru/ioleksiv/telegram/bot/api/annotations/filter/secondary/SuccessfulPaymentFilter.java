package ru.ioleksiv.telegram.bot.api.annotations.filter.secondary;

import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.NotNullFilter;
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
public @interface SuccessfulPaymentFilter {

    AnnotationState value() default AnnotationState.ON;

    StringFilter currency() default @StringFilter(AnnotationState.OFF);

    IntegerFilter totalAmount() default @IntegerFilter(AnnotationState.OFF);

    StringFilter invoicePayload() default @StringFilter(AnnotationState.OFF);

    NotNullFilter shippingOptionId() default @NotNullFilter(AnnotationState.OFF);

    OrderInfoFilter orderInfo() default @OrderInfoFilter(AnnotationState.OFF);

    NotNullFilter telegramPaymentChargeId() default @NotNullFilter(AnnotationState.OFF);

    NotNullFilter providerPaymentChargeId() default @NotNullFilter(AnnotationState.OFF);

}
