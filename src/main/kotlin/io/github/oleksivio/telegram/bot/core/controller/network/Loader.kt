package io.github.oleksivio.telegram.bot.core.controller.network

import io.github.oleksivio.telegram.bot.api.controller.ActionBuilder
import io.github.oleksivio.telegram.bot.api.model.objects.Update
import io.github.oleksivio.telegram.bot.core.model.method.send
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Controller

@Controller
class Loader(private val actionBuilder: ActionBuilder) {

    fun loadUpdates(): List<Update> {
        val updatesArray = actionBuilder.getUpdates()
                .send() ?: emptyList()

        LOG.trace("Process " + updatesArray.size + " updates")

        updatesArray.map { it.updateId }
                .max()
                ?.let { it.toInt() + 1 }
                ?.let {
                    actionBuilder.getUpdates().send {
                        offset = it
                    }
                }

        return updatesArray
    }

    companion object {
        private val LOG = LoggerFactory.getLogger(Loader::class.java)
    }

}
