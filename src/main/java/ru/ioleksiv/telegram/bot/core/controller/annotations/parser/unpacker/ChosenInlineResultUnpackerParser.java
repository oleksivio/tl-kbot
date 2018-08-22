package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.unpacker;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.receiver.ChosenInlineResultReceiver;
import ru.ioleksiv.telegram.bot.api.model.objects.inline.ChosenInlineResult;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpack.UpdateUnpacker;

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
