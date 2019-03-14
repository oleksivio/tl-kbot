package io.github.oleksivio.telegram.bot.core.controller.processor

import io.github.oleksivio.telegram.bot.api.model.objects.Update
import io.github.oleksivio.telegram.bot.core.controller.handler.Handler
import org.springframework.stereotype.Controller
import java.util.*

@Controller
class StatelessProcessor {

    private val handlers = ArrayList<Handler<*>>()

    fun add(handler: Handler<*>) {
        handlers.add(handler)
    }

    internal fun receive(update: Update) {
        handlers.filter { handler -> handler.hasSubscription(update) }
                .forEach { handler -> handler.run(update) }

    }

}
