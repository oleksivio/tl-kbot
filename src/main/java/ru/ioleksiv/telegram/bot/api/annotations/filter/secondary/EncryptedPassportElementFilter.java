package ru.ioleksiv.telegram.bot.api.annotations.filter.secondary;

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
public @interface EncryptedPassportElementFilter {

    AnnotationState value() default AnnotationState.ON;

    StringFilter type() default @StringFilter(AnnotationState.OFF);

    NotNullFilter data() default @NotNullFilter(AnnotationState.OFF);

    StringFilter phoneNumber() default @StringFilter(AnnotationState.OFF);

    StringFilter email() default @StringFilter(AnnotationState.OFF);

    PassportFileArrayFilter fileArray() default @PassportFileArrayFilter(AnnotationState.OFF);

    PassportFileFilter frontSide() default @PassportFileFilter(AnnotationState.OFF);

    PassportFileFilter reverseSide() default @PassportFileFilter(AnnotationState.OFF);

    PassportFileFilter selfie() default @PassportFileFilter(AnnotationState.OFF);

}