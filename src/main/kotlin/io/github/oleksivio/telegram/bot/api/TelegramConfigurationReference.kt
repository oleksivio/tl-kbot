package io.github.oleksivio.telegram.bot.api

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan(
        "io.github.oleksivio.telegram.bot.core.controller",
        "io.github.oleksivio.telegram.bot.core.configuration"
)
class TelegramConfigurationReference

