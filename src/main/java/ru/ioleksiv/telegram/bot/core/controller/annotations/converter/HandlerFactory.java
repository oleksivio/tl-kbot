package ru.ioleksiv.telegram.bot.core.controller.annotations.converter;

import org.jetbrains.annotations.NotNull;
import ru.ioleksiv.telegram.bot.core.controller.annotations.converter.filter.FilterConverter;
import ru.ioleksiv.telegram.bot.core.controller.annotations.converter.handler.HandlerConverter;
import ru.ioleksiv.telegram.bot.core.controller.handler.Handler;
import ru.ioleksiv.telegram.bot.core.controller.handler.filter.Filter;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.Optional;

public final class HandlerFactory {
    private final Iterable<FilterConverter> filterConverters;
    private final Iterable<HandlerConverter> handlerConverters;

    public HandlerFactory(Iterable<FilterConverter> filterConverters,
                          Iterable<HandlerConverter> handlerConverters) {
        this.handlerConverters = handlerConverters;
        this.filterConverters = filterConverters;
    }

    @NotNull
    public Optional<Handler> create(@NotNull Object classInstance,
                                    @NotNull Method method) {

        HandlerConverter handlerConverter = findHandlerConverter(method);

        if (handlerConverter == null) {
            return Optional.empty();
        }

        Collection<Filter> methodFilters = new ArrayList<>();
        for (FilterConverter filterConverter : filterConverters) {
            if (Objects.equals(filterConverter.getFilterInputClass(),
                               handlerConverter.getArgumentType())) {
                methodFilters.add(filterConverter.toChecker(method));
            }
        }

        Handler handler = handlerConverter.create(classInstance, method, methodFilters);

        return Optional.of(handler);
    }

    private HandlerConverter findHandlerConverter(@NotNull Method method) {
        for (HandlerConverter converter : handlerConverters) {
            if (converter.hasAnnotated(method)) {
                return converter;
            }
        }
        return null;
    }

}
