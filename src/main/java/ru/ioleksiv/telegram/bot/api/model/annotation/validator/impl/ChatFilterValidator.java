package ru.ioleksiv.telegram.bot.api.model.annotation.validator.impl;

import ru.ioleksiv.telegram.bot.api.model.annotation.validator.CustomValidator;
import ru.ioleksiv.telegram.bot.api.model.annotation.validator.FilterValidator;
import ru.ioleksiv.telegram.bot.api.model.objects.std.Chat;

public class ChatFilterValidator extends FilterValidator<Chat> {

    public ChatFilterValidator(CustomValidator<Chat> validator) {
        super(Chat.class, validator);
    }
}
