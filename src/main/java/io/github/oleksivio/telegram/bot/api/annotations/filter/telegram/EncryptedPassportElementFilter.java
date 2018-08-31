package io.github.oleksivio.telegram.bot.api.annotations.filter.telegram;

import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.NotNullFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter;
import io.github.oleksivio.telegram.bot.api.model.annotation.AnnotationState;
import io.github.oleksivio.telegram.bot.api.model.objects.passport.EncryptedPassportElement;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface EncryptedPassportElementFilter {

    AnnotationState status() default AnnotationState.ON;

    EncryptedPassportElement.Type type() default EncryptedPassportElement.Type.ALL;

    String[] validator() default {};

    NotNullFilter data() default @NotNullFilter(status = AnnotationState.OFF);

    StringFilter phoneNumber() default @StringFilter(status = AnnotationState.OFF);

    StringFilter email() default @StringFilter(status = AnnotationState.OFF);

    PassportFileArrayFilter fileArray() default @PassportFileArrayFilter(status = AnnotationState.OFF);

    PassportFileFilter frontSide() default @PassportFileFilter(status = AnnotationState.OFF);

    PassportFileFilter reverseSide() default @PassportFileFilter(status = AnnotationState.OFF);

    PassportFileFilter selfie() default @PassportFileFilter(status = AnnotationState.OFF);

}
