package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.unpacker;

import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.Parser;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpack.UpdateUnpacker;
import ru.ioleksiv.telegram.bot.core.model.ITelegram;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public abstract class UnpackerParser<A extends Annotation, OUT extends ITelegram> implements Parser<A> {

    public boolean canParse(Method method) {
        return method.isAnnotationPresent(getAnnotationClass());
    }

    public abstract UpdateUnpacker<OUT> getUpdateUnpacker();

}
