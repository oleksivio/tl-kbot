package io.github.oleksivio.tl.kbot.server.api.model.objects

import io.github.oleksivio.tl.kbot.server.api.model.ITelegram
import io.github.oleksivio.tl.kbot.server.api.objects.std.User

interface IUserFrom : ITelegram {
    var from: User?
}
