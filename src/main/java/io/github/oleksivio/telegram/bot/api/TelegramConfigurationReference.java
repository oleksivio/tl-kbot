package io.github.oleksivio.telegram.bot.api;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({
        "ru.ioleksiv.telegram.bot.core.controller",
        "ru.ioleksiv.telegram.bot.core.configuration",
})
public class TelegramConfigurationReference {
}

