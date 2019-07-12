package io.github.oleksivio.tl.kbot.core.core.controller.annotations.parser.finder

import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.Validator
import io.github.oleksivio.tl.kbot.server.api.model.ITelegram
import kotlin.reflect.KClass

interface Finder {
    fun <SA : Annotation, T> find(annotation: SA): Validator<T>

    fun <T : ITelegram> find(validatorName: String, targetClass: KClass<T>): Validator<T>

}
