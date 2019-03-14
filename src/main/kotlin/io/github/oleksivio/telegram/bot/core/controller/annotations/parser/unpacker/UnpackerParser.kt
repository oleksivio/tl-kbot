package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.unpacker

import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.Parser
import io.github.oleksivio.telegram.bot.core.controller.handler.unpack.UpdateUnpacker
import io.github.oleksivio.telegram.bot.core.model.ITelegram
import kotlin.reflect.KFunction

abstract class UnpackerParser<A : Annotation, OUT : ITelegram> : Parser<A> {

    abstract val updateUnpacker: UpdateUnpacker<OUT>

    fun canParse(func: KFunction<*>): Boolean {
        return func.annotations.any { it.annotationClass == parserAnnotationClass }
    }

}
