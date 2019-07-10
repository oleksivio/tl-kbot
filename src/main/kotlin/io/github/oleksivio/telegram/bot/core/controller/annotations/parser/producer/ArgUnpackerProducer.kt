package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.producer

import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.unpacker.UnpackerParser
import io.github.oleksivio.tl.kbot.server.api.model.ITelegram
import org.springframework.stereotype.Controller
import kotlin.reflect.KFunction

@Controller
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
