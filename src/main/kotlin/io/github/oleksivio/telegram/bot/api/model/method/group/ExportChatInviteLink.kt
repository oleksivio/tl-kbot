package io.github.oleksivio.telegram.bot.api.model.method.group

import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.StringResponse
import io.github.oleksivio.telegram.bot.core.model.method.ChatAction

/**
 * @see [exportChatInviteLink](https://core.telegram.org/bots/api.exportchatinvitelink)
 */
class ExportChatInviteLink(actionNetworker: ActionNetworker) : ChatAction<String>(METHOD, actionNetworker) {

    override val resultWrapperClass = StringResponse::class

    companion object {
        private const val METHOD = "exportChatInviteLink"
    }

}
