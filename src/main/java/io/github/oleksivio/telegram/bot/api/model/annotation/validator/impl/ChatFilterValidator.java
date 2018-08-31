package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl;

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.CustomValidator;
import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator;
import io.github.oleksivio.telegram.bot.api.model.objects.std.Chat;

public class ChatFilterValidator extends FilterValidator<Chat> {

    public ChatFilterValidator(CustomValidator<Chat> validator) {
        super(Chat.class, validator);
    }
}
