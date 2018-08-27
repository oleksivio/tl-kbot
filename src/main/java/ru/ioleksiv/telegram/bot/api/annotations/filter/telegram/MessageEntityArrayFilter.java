package ru.ioleksiv.telegram.bot.api.annotations.filter.telegram;

import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.model.annotation.AnnotationState;
import ru.ioleksiv.telegram.bot.api.model.objects.std.MessageEntity;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface MessageEntityArrayFilter {

    AnnotationState status() default AnnotationState.ON;

    MessageEntity.Type type() default MessageEntity.Type.ALL;

    IntegerFilter length() default @IntegerFilter(status = AnnotationState.OFF);

    StringFilter url() default @StringFilter(status = AnnotationState.OFF);

    UserFilter user() default @UserFilter(status = AnnotationState.OFF);

}