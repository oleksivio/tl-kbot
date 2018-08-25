package ru.ioleksiv.telegram.bot.api.model.annotation.validator.impl;

import ru.ioleksiv.telegram.bot.api.model.annotation.validator.CustomValidator;
import ru.ioleksiv.telegram.bot.api.model.annotation.validator.FilterValidator;
import ru.ioleksiv.telegram.bot.api.model.objects.std.Message;

public class MessageFilterValidator extends FilterValidator<Message> {

    public MessageFilterValidator(CustomValidator<Message> validator) {
        super(Message.class, validator);
    }
}
