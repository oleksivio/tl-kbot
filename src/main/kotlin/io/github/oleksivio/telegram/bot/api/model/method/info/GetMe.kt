package io.github.oleksivio.telegram.bot.api.model.method.info

import io.github.oleksivio.telegram.bot.api.model.objects.std.User
import io.github.oleksivio.telegram.bot.core.controller.network.ActionNetworker
import io.github.oleksivio.telegram.bot.core.model.UserResponse
import io.github.oleksivio.telegram.bot.core.model.method.RunnableAction

/**
 * @see [getMe](https://core.telegram.org/bots/api.getme)
 */
class GetMe(actionNetworker: ActionNetworker) : RunnableAction<User>(METHOD, actionNetworker) {
    override val resultWrapperClass = UserResponse::class

    companion object {
        private const val METHOD = "getMe"
    }

}
