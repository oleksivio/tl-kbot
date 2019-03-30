package io.github.oleksivio.telegram.bot.api

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

/**
 * Must be added into Spring `@SpringBootApplication` class
 *
 * Example:
 *
 * ```kotlin
 * @SpringBootApplication
 * @EnableScheduling
 * @Import(TelegramConfigurationReference::class)
 * class Application
 * fun main(args: Array<String>) {
 *     runApplication<Application>(*args)
 * }
 * ```
 */
@Configuration
@ComponentScan(
        "io.github.oleksivio.telegram.bot.core.controller",
        "io.github.oleksivio.telegram.bot.core.configuration"
)
class TelegramConfigurationReference

