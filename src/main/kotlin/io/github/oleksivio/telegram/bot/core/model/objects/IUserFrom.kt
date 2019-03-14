package io.github.oleksivio.telegram.bot.core.model.objects

import io.github.oleksivio.telegram.bot.api.model.objects.std.User
import io.github.oleksivio.telegram.bot.core.model.ITelegram

interface IUserFrom : ITelegram {
    var from: User
}
