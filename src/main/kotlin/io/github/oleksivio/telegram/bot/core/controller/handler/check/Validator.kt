package io.github.oleksivio.telegram.bot.core.controller.handler.check

interface Validator<T> {
    fun check(argument: T): Boolean
}
