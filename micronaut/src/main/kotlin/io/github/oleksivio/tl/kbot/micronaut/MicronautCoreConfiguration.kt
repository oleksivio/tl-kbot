package io.github.oleksivio.tl.kbot.micronaut

import io.github.oleksivio.tl.kbot.core.controller.BotBeanController
import io.github.oleksivio.tl.kbot.core.controller.BotContextController
import io.github.oleksivio.tl.kbot.core.controller.TelegramUpdater
import io.github.oleksivio.tl.kbot.core.controller.UpdateErrorListener
import io.micronaut.context.annotation.Factory
import javax.inject.Singleton

@Factory
open class MicronautCoreConfiguration {
    
    @Singleton
    fun botBeanController(botContextController: BotContextController): BotBeanController {
        return BotBeanController(botContextController)
    }

    @Singleton
    fun botContextController(micronautApiImpl: MicronautApiProviderImpl): BotContextController {
        return BotContextController(micronautApiImpl)
    }

    @Singleton
    fun actionBuilder(botContextController: BotContextController) = botContextController.actionBuilder

    @Singleton
    fun telegramProcessor(botContextController: BotContextController) = botContextController.telegramProcessor

    @Singleton
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
