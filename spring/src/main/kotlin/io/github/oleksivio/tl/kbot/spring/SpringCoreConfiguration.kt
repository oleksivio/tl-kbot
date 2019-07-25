package io.github.oleksivio.tl.kbot.spring

import io.github.oleksivio.tl.kbot.core.controller.BotBeanController
import io.github.oleksivio.tl.kbot.core.controller.BotContextController
import io.github.oleksivio.tl.kbot.core.controller.TelegramUpdater
import io.github.oleksivio.tl.kbot.core.controller.UpdateErrorListener
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SpringCoreConfiguration {
    
    @Bean
    fun botBeanController(botContextController: BotContextController): BotBeanController {
        return BotBeanController(botContextController)
    }
    
    @Bean
    fun botContextController(springApiImpl: SpringApiProviderImpl): BotContextController {
        return BotContextController(springApiImpl)
    }

    @Bean
    fun actionBuilder(botContextController: BotContextController) = botContextController.actionBuilder

    @Bean
    fun telegramProcessor(botContextController: BotContextController) = botContextController.telegramProcessor

    @Bean
    fun telegramUpdater(
        botContextController: BotContextController,
        updateErrorListener: UpdateErrorListener?
    ): TelegramUpdater {
        val updater = botContextController.telegramUpdater

        updateErrorListener?.let {
            updater.setErrorListener(it)
        }

        return updater
    }
}
