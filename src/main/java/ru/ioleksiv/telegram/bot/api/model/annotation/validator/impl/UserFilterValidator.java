package ru.ioleksiv.telegram.bot.api.model.annotation.validator.impl;

import ru.ioleksiv.telegram.bot.api.model.annotation.validator.CustomValidator;
import ru.ioleksiv.telegram.bot.api.model.annotation.validator.FilterValidator;
import ru.ioleksiv.telegram.bot.api.model.objects.std.User;

public class UserFilterValidator extends FilterValidator<User> {

    public UserFilterValidator(CustomValidator<User> validator) {
        super(User.class, validator);
    }
}
