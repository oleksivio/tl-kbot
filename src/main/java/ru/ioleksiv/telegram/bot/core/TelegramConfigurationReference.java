package ru.ioleksiv.telegram.bot.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({
        "ru.ioleksiv.telegram.bot.core.configuration",
        "ru.ioleksiv.telegram.bot.core.controller.annotations.factory.impl"
})
public class TelegramConfigurationReference {
}

