package io.github.oleksivio.telegram.bot.api.annotations.filter.telegram;

import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.NotNullFilter;
import io.github.oleksivio.telegram.bot.api.model.annotation.AnnotationState;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface SuccessfulPaymentFilter {

    AnnotationState status() default AnnotationState.ON;

    String[] validator() default {};

    StringFilter currency() default @StringFilter(status = AnnotationState.OFF);

    IntegerFilter totalAmount() default @IntegerFilter(status = AnnotationState.OFF);

    StringFilter invoicePayload() default @StringFilter(status = AnnotationState.OFF);

    NotNullFilter shippingOptionId() default @NotNullFilter(status = AnnotationState.OFF);

    OrderInfoFilter orderInfo() default @OrderInfoFilter(status = AnnotationState.OFF);

    NotNullFilter telegramPaymentChargeId() default @NotNullFilter(status = AnnotationState.OFF);

    NotNullFilter providerPaymentChargeId() default @NotNullFilter(status = AnnotationState.OFF);

}
