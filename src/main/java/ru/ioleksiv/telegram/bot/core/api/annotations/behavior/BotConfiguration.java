package ru.ioleksiv.telegram.bot.core.api.annotations.behavior;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface BotConfiguration {
    String token();

    String webhookUrl() default "";

    long longPollingInterval() default -1;
}