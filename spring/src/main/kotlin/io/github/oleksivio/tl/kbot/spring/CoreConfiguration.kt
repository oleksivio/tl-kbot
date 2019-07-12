package io.github.oleksivio.tl.kbot.spring

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class CoreConfiguration {

    @Bean
    fun networkerProvider(@Value("\${telegram.bot.token}") token: String): NetworkerImpl {
        return NetworkerImpl(token = token)
    }
}
