package ru.ioleksiv.telegram.bot.api.annotations.filter.telegram;

import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.NotNullFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.model.annotation.AnnotationState;
import ru.ioleksiv.telegram.bot.api.model.annotation.CustomValidator;
import ru.ioleksiv.telegram.bot.api.model.annotation.stub.StubSuccessfulPaymentValidator;
import ru.ioleksiv.telegram.bot.api.model.objects.payments.SuccessfulPayment;

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
