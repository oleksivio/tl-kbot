package io.github.oleksivio.tl.kbot.core.core.controller.updater

import io.github.oleksivio.tl.kbot.core.controller.TelegramProcessor
import io.github.oleksivio.tl.kbot.core.controller.TelegramUpdater
import io.github.oleksivio.tl.kbot.core.controller.UpdateErrorListener
import io.github.oleksivio.tl.kbot.core.core.controller.network.Loader

class Updater(
    private val telegramProcessor: TelegramProcessor,
    private val loader: Loader
) : TelegramUpdater {

    private var updateErrorListener: UpdateErrorListener = { _, e -> e.printStackTrace() }

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

    fun setErrorListener(listener: UpdateErrorListener) {
        this.updateErrorListener = listener
    }
}
