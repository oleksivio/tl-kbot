package ru.ioleksiv.telegram.bot.api.annotations.filter.telegram;

import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.NotNullFilter;
import ru.ioleksiv.telegram.bot.api.model.annotation.AnnotationState;
import ru.ioleksiv.telegram.bot.api.model.annotation.CustomValidator;
import ru.ioleksiv.telegram.bot.api.model.annotation.stub.StubEncryptedCredentialsValidator;
import ru.ioleksiv.telegram.bot.api.model.objects.passport.EncryptedCredentials;

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

    Class<? extends CustomValidator<EncryptedCredentials>>[] validator()
            default StubEncryptedCredentialsValidator.class;

    NotNullFilter data() default @NotNullFilter(status = AnnotationState.OFF);

    NotNullFilter hash() default @NotNullFilter(status = AnnotationState.OFF);

    NotNullFilter secret() default @NotNullFilter(status = AnnotationState.OFF);

}
