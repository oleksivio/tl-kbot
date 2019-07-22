package io.github.oleksivio.tl.kbot.samples.spring

import io.github.oleksivio.tl.kbot.spring.TelegramConfigurationReference
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Import
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
@Import(TelegramConfigurationReference::class)
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
