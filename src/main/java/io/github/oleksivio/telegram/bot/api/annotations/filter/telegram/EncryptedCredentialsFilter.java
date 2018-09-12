package io.github.oleksivio.telegram.bot.api.annotations.filter.telegram;

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
public @interface EncryptedCredentialsFilter {

    AnnotationState status() default AnnotationState.ON;

    String[] validator() default {};

    NotNullFilter data() default @NotNullFilter(status = AnnotationState.OFF);

    NotNullFilter hash() default @NotNullFilter(status = AnnotationState.OFF);

    NotNullFilter secret() default @NotNullFilter(status = AnnotationState.OFF);

}