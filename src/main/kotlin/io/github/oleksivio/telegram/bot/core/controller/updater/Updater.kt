package io.github.oleksivio.telegram.bot.core.controller.updater

import io.github.oleksivio.telegram.bot.api.controller.TelegramProcessor
import io.github.oleksivio.telegram.bot.api.controller.TelegramUpdater
import io.github.oleksivio.telegram.bot.api.controller.UpdateErrorListener
import io.github.oleksivio.telegram.bot.core.controller.network.Loader
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller

@Controller
class Updater(private val telegramProcessor: TelegramProcessor,
              private val loader: Loader) : TelegramUpdater {
    private var updateErrorListener: UpdateErrorListener = { _, _ -> }

    override fun longPolling() {

        val updates = loader.loadUpdates()

        for (update in updates) {
            try {
                telegramProcessor.receive(update)
            } catch (processException: Exception) {
                updateErrorListener(update, processException)
            }

        }

    }

    @Autowired(required = false)
    fun setErrorListener(listener: UpdateErrorListener) {
        this.updateErrorListener = listener
    }

}
