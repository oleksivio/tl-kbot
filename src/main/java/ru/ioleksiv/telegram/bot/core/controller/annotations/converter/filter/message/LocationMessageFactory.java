package ru.ioleksiv.telegram.bot.core.controller.annotations.converter.filter.message;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.message.LocationMessage;
import ru.ioleksiv.telegram.bot.api.model.objects.std.Location;
import ru.ioleksiv.telegram.bot.api.model.objects.std.Message;
import ru.ioleksiv.telegram.bot.core.controller.handler.checker.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpacker.Unpacker;

import java.util.Objects;

@Component
public class LocationMessageFactory extends MessageFilterConverter<LocationMessage, Location> {

    @Override
    protected Class<LocationMessage> getFactoryAnnotation() {
        return LocationMessage.class;
    }

    @Override
    @NotNull
    protected Checker<Location> createChecker(LocationMessage annotation) {
        return Objects::nonNull;
    }

    @Override
    @Nullable
    public Unpacker<Message, Location> getUnpacker() {
        return Message::getLocation;
    }

    @Override
    @NotNull
    protected Class<Location> outClass() {
        return Location.class;
    }

}
