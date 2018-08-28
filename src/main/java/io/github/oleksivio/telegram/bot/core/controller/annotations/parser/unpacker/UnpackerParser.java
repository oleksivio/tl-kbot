package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.unpacker;

import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.Parser;
import io.github.oleksivio.telegram.bot.core.controller.handler.unpack.UpdateUnpacker;
import io.github.oleksivio.telegram.bot.core.model.ITelegram;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public abstract class UnpackerParser<A extends Annotation, OUT extends ITelegram> implements Parser<A> {

    public boolean canParse(Method method) {
        return method.isAnnotationPresent(getAnnotationClass());
    }

    public abstract UpdateUnpacker<OUT> getUpdateUnpacker();

}
