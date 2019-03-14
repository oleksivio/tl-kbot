package io.github.oleksivio.telegram.bot.api.model.objects.std.files.inputmedia

import io.github.oleksivio.telegram.bot.core.model.ITelegram

interface InputMedia : ITelegram {

    var type: String?

    var media: String?

    var caption: String?

    var parseMode: String?

}
