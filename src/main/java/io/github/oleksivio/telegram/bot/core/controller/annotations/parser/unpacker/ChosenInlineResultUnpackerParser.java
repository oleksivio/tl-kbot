package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.unpacker;

import io.github.oleksivio.telegram.bot.core.controller.handler.unpack.UpdateUnpacker;
import org.springframework.stereotype.Component;
import io.github.oleksivio.telegram.bot.api.annotations.receiver.ChosenInlineResultReceiver;
import io.github.oleksivio.telegram.bot.api.model.objects.inline.ChosenInlineResult;

import java.util.Optional;

@Component
public class ChosenInlineResultUnpackerParser extends UnpackerParser<ChosenInlineResultReceiver, ChosenInlineResult> {

    @Override
    public Class<ChosenInlineResultReceiver> getAnnotationClass() {
        return ChosenInlineResultReceiver.class;
    }

    @Override
    public UpdateUnpacker<ChosenInlineResult> getUpdateUnpacker() {
        return new UpdateUnpacker<>(in -> Optional.ofNullable(in.getChosenInlineResult()), ChosenInlineResult.class);
    }
}
