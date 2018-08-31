package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl;

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.CustomValidator;
import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator;
import io.github.oleksivio.telegram.bot.api.model.objects.std.Message;

public class MessageFilterValidator extends FilterValidator<Message> {

    public MessageFilterValidator(CustomValidator<Message> validator) {
        super(Message.class, validator);
    }
}
