package io.github.oleksivio.telegram.bot.core.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate

@Configuration
class LibraryConfiguration {

    @Bean
    fun restTemplate(): RestTemplate {
        return RestTemplate()
    }

}
