package ru.ioleksiv.telegram.bot.api.annotations.filter.telegram;

import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.NotNullFilter;
import ru.ioleksiv.telegram.bot.api.model.annotation.AnnotationState;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface EncryptedCredentialsFilter {

    AnnotationState value() default AnnotationState.ON;

    NotNullFilter data() default @NotNullFilter(AnnotationState.OFF);

    NotNullFilter hash() default @NotNullFilter(AnnotationState.OFF);

    NotNullFilter secret() default @NotNullFilter(AnnotationState.OFF);

}
