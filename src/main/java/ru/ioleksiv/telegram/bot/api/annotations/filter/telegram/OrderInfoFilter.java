package ru.ioleksiv.telegram.bot.api.annotations.filter.telegram;

import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.model.annotation.AnnotationState;
import ru.ioleksiv.telegram.bot.api.model.annotation.CustomValidator;
import ru.ioleksiv.telegram.bot.api.model.annotation.stub.StubOrderInfoValidator;
import ru.ioleksiv.telegram.bot.api.model.objects.payments.OrderInfo;

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

    Class<? extends CustomValidator<OrderInfo>>[] validator() default StubOrderInfoValidator.class;

    StringFilter name() default @StringFilter(AnnotationState.OFF);

    StringFilter phoneNumber() default @StringFilter(AnnotationState.OFF);

    StringFilter email() default @StringFilter(AnnotationState.OFF);

    ShippingAddressFilter shippingAddress() default @ShippingAddressFilter(AnnotationState.OFF);

}
