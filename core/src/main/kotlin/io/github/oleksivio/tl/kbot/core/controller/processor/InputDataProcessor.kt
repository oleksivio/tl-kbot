package io.github.oleksivio.tl.kbot.core.controller.processor

import io.github.oleksivio.tl.kbot.core.controller.TelegramProcessor
import io.github.oleksivio.tl.kbot.core.controller.processor.session.SessionProcessor
import io.github.oleksivio.tl.kbot.server.api.objects.Update

class InputDataProcessor(
    private val sessionProcessor: SessionProcessor,
    private val statelessProcessor: StatelessProcessor
) : TelegramProcessor {

    override fun receive(update: Update) {
        val sessionResult = sessionProcessor.receive(update)

        if (sessionResult.isPassed) {
            statelessProcessor.receive(update)
        }
    }
}
