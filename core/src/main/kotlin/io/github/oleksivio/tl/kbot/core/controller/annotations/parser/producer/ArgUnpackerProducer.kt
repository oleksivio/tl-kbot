package io.github.oleksivio.tl.kbot.core.controller.annotations.parser.producer

import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.unpacker.UnpackerParser
import io.github.oleksivio.tl.kbot.server.api.model.ITelegram

import kotlin.reflect.KFunction

class ArgUnpackerProducer(private val unpackerParsers: Collection<UnpackerParser<*, *>>) {

    fun <T : ITelegram> create(func: KFunction<*>): UnpackerParser<Annotation, T>? {
        for (unpackerParserAbstract in unpackerParsers) {
            if (unpackerParserAbstract.canParse(func)) {
                return unpackerParserAbstract as UnpackerParser<Annotation, T>
            }
        }

        return null
    }
}
