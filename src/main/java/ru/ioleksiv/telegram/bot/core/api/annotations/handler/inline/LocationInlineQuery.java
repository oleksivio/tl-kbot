package ru.ioleksiv.telegram.bot.core.api.annotations.handler.inline;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface LocationInlineQuery {

    String query() default "";

}

