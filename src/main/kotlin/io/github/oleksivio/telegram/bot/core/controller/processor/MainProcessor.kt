package io.github.oleksivio.telegram.bot.core.controller.processor

import io.github.oleksivio.telegram.bot.api.controller.TelegramProcessor
import io.github.oleksivio.tl.kbot.server.api.objects.Update
import io.github.oleksivio.telegram.bot.core.controller.processor.session.SessionProcessor
import org.springframework.stereotype.Controller

@Controller
class MainProcessor(private val sessionProcessor: SessionProcessor,
                    private val statelessProcessor: StatelessProcessor) : TelegramProcessor {

    override fun receive(update: Update) {
        val sessionResult = sessionProcessor.receive(update)

        if (sessionResult.isPassed) {
            statelessProcessor.receive(update)
        }
    }

}
