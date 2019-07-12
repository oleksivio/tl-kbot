package io.github.oleksivio.tl.kbot.core.core.controller.processor

import io.github.oleksivio.tl.kbot.core.core.controller.handler.Handler
import io.github.oleksivio.tl.kbot.server.api.objects.Update
 
import java.util.ArrayList

  
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
