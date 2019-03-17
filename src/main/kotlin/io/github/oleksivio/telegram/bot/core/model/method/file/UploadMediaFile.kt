package io.github.oleksivio.telegram.bot.core.model.method.file

abstract class UploadMediaFile protected constructor() : UploadMessageFile() {
    abstract val caption: String?
    abstract val parseMode: String?
}
