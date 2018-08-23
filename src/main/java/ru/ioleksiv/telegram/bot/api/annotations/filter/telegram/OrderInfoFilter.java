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

    AnnotationState status() default AnnotationState.ON;

    String[] validator() default {};

    StringFilter name() default @StringFilter(status = AnnotationState.OFF);

    StringFilter phoneNumber() default @StringFilter(status = AnnotationState.OFF);

    StringFilter email() default @StringFilter(status = AnnotationState.OFF);

    ShippingAddressFilter shippingAddress() default @ShippingAddressFilter(status = AnnotationState.OFF);

}
