package io.github.oleksivio.tl.kbot.spring

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
        "io.github.oleksivio.tl.kbot.spring.boot"
)
class TelegramConfigurationReference

