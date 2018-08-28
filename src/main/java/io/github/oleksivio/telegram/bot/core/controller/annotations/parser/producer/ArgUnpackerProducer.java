package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.producer;

import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.unpacker.UnpackerParser;
import io.github.oleksivio.telegram.bot.core.controller.handler.unpack.UpdateUnpacker;
import io.github.oleksivio.telegram.bot.core.model.ITelegram;
import org.springframework.stereotype.Controller;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Optional;

@Controller
public class ArgUnpackerProducer {

    private final Collection<UnpackerParser> unpackerParsers;

    public ArgUnpackerProducer(Collection<UnpackerParser> unpackerParsers) {
        this.unpackerParsers = unpackerParsers;
    }

    public <T extends ITelegram> Optional<UpdateUnpacker<T>> create(Method method) {
        for (UnpackerParser unpackerParser : unpackerParsers) {
            if (unpackerParser.canParse(method)) {

                UpdateUnpacker<T> resultUnpacker = unpackerParser.getUpdateUnpacker();

                return Optional.of(resultUnpacker);
            }
        }

        return Optional.empty();
    }
}
