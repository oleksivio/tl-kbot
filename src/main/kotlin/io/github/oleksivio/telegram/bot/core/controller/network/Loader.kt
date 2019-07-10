package io.github.oleksivio.telegram.bot.core.controller.network

import io.github.oleksivio.telegram.bot.api.controller.ActionBuilder
import io.github.oleksivio.tl.kbot.server.api.method.update.GetUpdates
import io.github.oleksivio.tl.kbot.server.api.objects.Update
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Controller

@Controller
class Loader(private val actionBuilder: ActionBuilder) {

    fun loadUpdates(): List<Update> {
        val updatesArray = actionBuilder.action { GetUpdates() }.send().orEmpty()

        LOG.trace("Process " + updatesArray.size + " updates")

        updatesArray.map { it.updateId }
                .max()
                ?.let { it.toInt() + 1 }
                ?.let {
                    actionBuilder.action { GetUpdates(offset = it) }.send()
                }

        return updatesArray
    }

    companion object {
        private val LOG = LoggerFactory.getLogger(Loader::class.java)
    }

}
