package ru.ioleksiv.telegram.bot.core.controller.annotations.converter.filter.message;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.core.api.annotations.filter.message.LocationMessage;
import ru.ioleksiv.telegram.bot.core.api.model.ActionBuilder;
import ru.ioleksiv.telegram.bot.core.api.model.objects.std.Message;
import ru.ioleksiv.telegram.bot.core.controller.annotations.converter.filter.FilterConverter;
import ru.ioleksiv.telegram.bot.core.controller.handler.filter.Filter;

@Component
public class LocationMessageFactory extends FilterConverter<LocationMessage, Message> {

    public LocationMessageFactory(ActionBuilder actionBuilder) {
        super(actionBuilder);
    }

    @Override
    protected Filter<Message> toChecker(@NotNull LocationMessage annotationArgs) {
        return argument -> argument.getLocation() != null;
    }

    @Override
    protected Class<LocationMessage> getFactoryAnnotation() {
        return LocationMessage.class;
    }

    @Override
    public Class<Message> getFilterInputClass() {
        return Message.class;
    }

}
