package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl;

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.CustomValidator;
import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator;
import io.github.oleksivio.telegram.bot.api.model.objects.std.User;

public class UserFilterValidator extends FilterValidator<User> {

    public UserFilterValidator(CustomValidator<User> validator) {
        super(User.class, validator);
    }
}
