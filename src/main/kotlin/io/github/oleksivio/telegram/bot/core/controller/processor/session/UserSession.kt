package io.github.oleksivio.telegram.bot.core.controller.processor.session

import io.github.oleksivio.telegram.bot.api.model.objects.Update
import io.github.oleksivio.telegram.bot.core.controller.handler.Handler

class UserSession(orderManager: OrderManager,
                  initialHandler: Handler<*>,
                  cancelHandler: Handler<*>) : SessionManager(orderManager, initialHandler, cancelHandler) {

    override fun getIdOptional(update: Update): Long? {

        return listOfNotNull(update.message,
                update.editedMessage,
                update.channelPost,
                update.editedChannelPost,
                update.shippingQuery,
                update.preCheckoutQuery,
                update.chosenInlineResult,
                update.inlineQuery,
                update.callbackQuery)
                .mapNotNull { it.from }
                .map { it.id }
                .firstOrNull()

    }
}
