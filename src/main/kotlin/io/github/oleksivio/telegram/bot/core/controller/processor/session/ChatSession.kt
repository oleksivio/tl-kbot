package io.github.oleksivio.telegram.bot.core.controller.processor.session

import io.github.oleksivio.tl.kbot.server.api.objects.Update
import io.github.oleksivio.telegram.bot.core.controller.handler.Handler

class ChatSession(orderManager: OrderManager,
                  initialHandler: Handler<*>,
                  cancelHandler: Handler<*>) : SessionManager(orderManager, initialHandler, cancelHandler) {

    override fun getIdOptional(update: Update): Long? {
        return listOfNotNull(update.message,
                update.editedMessage,
                update.channelPost,
                update.editedChannelPost)
                .map { it.chat }
                .map { it.id }
                .firstOrNull()

    }
}
