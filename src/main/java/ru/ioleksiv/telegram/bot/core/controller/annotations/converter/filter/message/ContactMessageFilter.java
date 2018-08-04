package ru.ioleksiv.telegram.bot.core.controller.annotations.converter.filter.message;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.core.api.annotations.filter.message.ContactMessage;
import ru.ioleksiv.telegram.bot.core.api.model.ActionBuilder;
import ru.ioleksiv.telegram.bot.core.api.model.objects.std.Message;
import ru.ioleksiv.telegram.bot.core.controller.annotations.converter.filter.FilterConverter;
import ru.ioleksiv.telegram.bot.core.controller.handler.filter.Filter;

@Component
public class ContactMessageFilter extends FilterConverter<ContactMessage, Message> {

    public ContactMessageFilter(ActionBuilder actionBuilder) {
        super(actionBuilder);
    }

    @Override
    protected Filter<Message> toChecker(@NotNull ContactMessage annotationArgs) {
        return argument -> argument.getContact() != null;
    }

    @Override
    public Class<ContactMessage> getFactoryAnnotation() {
        return ContactMessage.class;
    }

    @Override
    public Class<Message> getFilterInputClass() {
        return Message.class;
    }

}



