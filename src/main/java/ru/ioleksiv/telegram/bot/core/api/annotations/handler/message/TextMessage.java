package ru.ioleksiv.telegram.bot.core.api.annotations.handler.message;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface TextMessage {

    String regExp() default "";

    String[] equalWith() default {};

    String[] startWith() default {};

    String[] endWith() default {};

    Type type() default Type.MESSAGE;

    enum Type {
        MESSAGE,
        EDITED_MESSAGE,
        CHANNEL_POST,
        EDITED_CHANNEL_POST,
    }
}
