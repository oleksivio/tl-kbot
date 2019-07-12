package io.github.oleksivio.tl.kbot.core.core.controller.processor.session

import io.github.oleksivio.tl.kbot.core.core.controller.handler.Handler
import io.github.oleksivio.tl.kbot.server.api.objects.Update

class ChatSession(
    orderManager: OrderManager,
    initialHandler: Handler<*>,
    cancelHandler: Handler<*>
) : SessionManager(orderManager, initialHandler, cancelHandler) {

    override fun getIdOptional(update: Update): Long? {
        return listOfNotNull(
            update.message,
            update.editedMessage,
            update.channelPost,
            update.editedChannelPost
        )
            .map { it.chat }
            .map { it.id }
            .firstOrNull()
    }
}
