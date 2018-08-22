package ru.ioleksiv.telegram.bot.api.annotations.filter.telegram;

import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.NotNullFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.model.annotation.AnnotationState;
import ru.ioleksiv.telegram.bot.api.model.annotation.CustomValidator;
import ru.ioleksiv.telegram.bot.api.model.annotation.stub.StubContactValidator;
import ru.ioleksiv.telegram.bot.api.model.objects.std.Contact;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface ContactFilter {

    AnnotationState value() default AnnotationState.ON;

    Class<? extends CustomValidator<Contact>>[] validator() default StubContactValidator.class;

    StringFilter phoneNumber() default @StringFilter(AnnotationState.OFF);

    StringFilter firstName() default @StringFilter(AnnotationState.OFF);

    StringFilter lastName() default @StringFilter(AnnotationState.OFF);

    StringFilter vCard() default @StringFilter(AnnotationState.OFF);

    NotNullFilter userId() default @NotNullFilter(AnnotationState.OFF);

}
