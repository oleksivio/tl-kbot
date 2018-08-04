package ru.ioleksiv.telegram.bot.core.controller.annotations.converter.filter;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.core.api.annotations.filter.callback.Data;
import ru.ioleksiv.telegram.bot.core.api.model.ActionBuilder;
import ru.ioleksiv.telegram.bot.core.api.model.objects.std.CallbackQuery;
import ru.ioleksiv.telegram.bot.core.controller.handler.filter.CallbackQueryDataFilter;
import ru.ioleksiv.telegram.bot.core.controller.handler.filter.Filter;

import java.util.Arrays;

@Component
public class DataCallbackConverter extends FilterConverter<Data, CallbackQuery> {
    public DataCallbackConverter(ActionBuilder actionBuilder) {
        super(actionBuilder);
    }

    @Override
    protected Filter<CallbackQuery> toChecker(@NotNull Data annotationArgs) {
        return new CallbackQueryDataFilter(Arrays.asList(annotationArgs.startWith()),
                                           Arrays.asList(annotationArgs.equalWith()),
                                           Arrays.asList(annotationArgs.endWith()),
                                           annotationArgs.regExp());

    }

    @Override
    public Class<Data> getFactoryAnnotation() {
        return Data.class;
    }

    @Override
    public Class<CallbackQuery> getFilterInputClass() {
        return CallbackQuery.class;
    }

}



