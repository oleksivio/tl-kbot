package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder

import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator
import io.github.oleksivio.tl.kbot.server.api.model.ITelegram
import kotlin.reflect.KClass

interface Finder {
    fun <SA : Annotation, T> find(annotation: SA): Validator<T>

    fun <T : ITelegram> find(validatorName: String, targetClass: KClass<T>): Validator<T>

}
