package ru.ioleksiv.telegram.bot.api.annotations.filter.telegram;

import ru.ioleksiv.telegram.bot.api.model.annotation.AnnotationState;
import ru.ioleksiv.telegram.bot.api.model.annotation.CustomValidator;
import ru.ioleksiv.telegram.bot.api.model.annotation.stub.StubPassportDataValidator;
import ru.ioleksiv.telegram.bot.api.model.objects.passport.PassportData;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface PassportDataFilter {

    AnnotationState status() default AnnotationState.ON;

    Class<? extends CustomValidator<PassportData>>[] validator() default StubPassportDataValidator.class;

    EncryptedPassportElementArrayFilter encryptedPassportElements() default @EncryptedPassportElementArrayFilter(status = AnnotationState.OFF);

    EncryptedCredentialsFilter encryptedCredentials() default @EncryptedCredentialsFilter(status = AnnotationState.OFF);

}
