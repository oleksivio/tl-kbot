package io.github.oleksivio.telegram.bot.api.model.annotation

/**
 * SessionType used for choose how to reply to user message.
 */
enum class SessionType {
    /**
     * Reply will be send to telegram chat.id
     */
    CHAT,
    /**
     * Reply will be send to telegram user.id
     */
    USER
}
