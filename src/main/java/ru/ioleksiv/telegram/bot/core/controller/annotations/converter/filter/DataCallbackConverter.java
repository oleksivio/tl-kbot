package ru.ioleksiv.telegram.bot.core.controller.annotations.converter.filter;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.callback.DataCallbackQuery;
import ru.ioleksiv.telegram.bot.api.model.objects.std.CallbackQuery;
import ru.ioleksiv.telegram.bot.core.controller.annotations.converter.FilterConverter;
import ru.ioleksiv.telegram.bot.core.controller.handler.Layer;
import ru.ioleksiv.telegram.bot.core.controller.handler.checker.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.checker.TextChecker;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpacker.Unpacker;

import java.util.Arrays;

@Component
public class DataCallbackConverter extends FilterConverter<DataCallbackQuery, CallbackQuery, String> {

    @Override
    public Class<DataCallbackQuery> getFactoryAnnotation() {
        return DataCallbackQuery.class;
    }

    @Override
    public @NotNull Checker<String> createChecker(DataCallbackQuery annotation) {
        return new TextChecker(Arrays.asList(annotation.startWith()),
                               Arrays.asList(annotation.equalWith()),
                               Arrays.asList(annotation.endWith()),
                               annotation.regExp());
    }

    @Override
    @Nullable
    public Unpacker<CallbackQuery, String> getUnpacker() {
        return CallbackQuery::getData;
    }

    @Override
    @NotNull
    protected Class<String> outClass() {
        return String.class;
    }

    @Override
    @NotNull
    protected Class<CallbackQuery> inClass() {
        return CallbackQuery.class;
    }

    @Override
    protected Layer getLevel() {
        return Layer.TOP_FILTER;
    }

}



