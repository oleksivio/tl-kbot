package io.github.oleksivio.tl.kbot.spring

import io.github.oleksivio.tl.kbot.core.controller.BotBeanController
import io.github.oleksivio.tl.kbot.core.controller.BotContextController
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class CoreConfiguration {


    @Bean
    fun botBeanController(botContextController: BotContextController): BotBeanController {
        return BotBeanController(botContextController)
    }

    @Bean
    fun apiProviderProvider(@Value("\${telegram.bot.token}") token: String): ApiProviderImpl {
        return ApiProviderImpl(token = token)
    }

    @Bean
    fun botContextController(apiImpl: ApiProviderImpl): BotContextController {
        return BotContextController(apiImpl)
    }
}
