package ru.ioleksiv.telegram.bot.core.controller.annotations.factory.impl;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.core.api.annotations.handler.message.LocationMessage;
import ru.ioleksiv.telegram.bot.core.api.model.ActionBuilder;
import ru.ioleksiv.telegram.bot.core.controller.annotations.factory.interfaces.SimpleFactory;
import ru.ioleksiv.telegram.bot.core.controller.handler.Handler;
import ru.ioleksiv.telegram.bot.core.controller.handler.message.LocationHandler;

import java.lang.reflect.Method;
import java.util.Optional;

@Component
public class LocationMessageFactory extends SimpleFactory<LocationMessage> {

    public LocationMessageFactory(ActionBuilder actionBuilder) {
        super(actionBuilder);
    }

    @Override
    protected Class<LocationMessage> getFactoryAnnotation() {
        return LocationMessage.class;
    }

    @Override
    protected Optional<Handler> mapper(@NotNull LocationMessage annotationArgs,
                                       @NotNull Object classInstance,
                                       @NotNull Method method,
                                       @NotNull ActionBuilder actionBuilder) {

        Handler locationHandler = new LocationHandler(actionBuilder, classInstance, method);

        return Optional.of(locationHandler);
    }
}
