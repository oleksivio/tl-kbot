package ru.ioleksiv.telegram.bot.api.annotations.filter.secondary;

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

    AnnotationState value() default AnnotationState.ON;

    MessageEntity.Type type() default MessageEntity.Type.ALL;

    IntegerFilter length() default @IntegerFilter(AnnotationState.OFF);

    StringFilter url() default @StringFilter(AnnotationState.OFF);

    UserFilter user() default @UserFilter(AnnotationState.OFF);

}
