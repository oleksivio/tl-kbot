package ru.ioleksiv.telegram.bot.core.api.annotations.behavior;

import ru.ioleksiv.telegram.bot.core.utils.TargetChat;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
public @interface Session {

    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.METHOD})
    @interface Initial {
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.METHOD})
    @interface Cancel {
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface Order {
        int value();

        String errorText() default "";

        TargetChat targetChat() default TargetChat.CHAT;
    }

}
