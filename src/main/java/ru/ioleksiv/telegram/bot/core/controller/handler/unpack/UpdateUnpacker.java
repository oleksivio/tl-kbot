package ru.ioleksiv.telegram.bot.core.controller.handler.unpack;

import ru.ioleksiv.telegram.bot.api.model.objects.Update;
import ru.ioleksiv.telegram.bot.core.model.ITelegram;

public class UpdateUnpacker<OUT extends ITelegram> {

    private final Class<OUT> outClass;
    private final Unpacker<Update, OUT> unpacker;

    public UpdateUnpacker(Unpacker<Update, OUT> unpacker, Class<OUT> outClass) {
        this.unpacker = unpacker;
        this.outClass = outClass;
    }

    public Unpacker<Update, OUT> get() {
        return unpacker;
    }

    public Class<OUT> getOutClass() {
        return outClass;
    }

}
