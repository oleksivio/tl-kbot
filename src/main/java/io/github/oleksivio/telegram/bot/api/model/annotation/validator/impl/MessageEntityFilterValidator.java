package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl;

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.CustomValidator;
import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator;
import io.github.oleksivio.telegram.bot.api.model.objects.std.MessageEntity;

public class MessageEntityFilterValidator extends FilterValidator<MessageEntity> {

    public MessageEntityFilterValidator(CustomValidator<MessageEntity> validator) {
        super(MessageEntity.class, validator);
    }
}
