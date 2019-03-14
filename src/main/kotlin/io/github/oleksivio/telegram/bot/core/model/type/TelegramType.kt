package io.github.oleksivio.telegram.bot.core.model.type

interface TelegramType : NamedType {

    val isChosen: Boolean

    fun equalsWith(typeString: String): Boolean {
        return stringName == typeString
    }
}
