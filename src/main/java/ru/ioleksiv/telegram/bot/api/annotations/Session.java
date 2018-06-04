package ru.ioleksiv.telegram.bot.api.annotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
public @interface Session {

    @Target({ElementType.METHOD})
    @interface Initial {
    }

    @Target({ElementType.METHOD})
    @interface Cancel {
    }
}
