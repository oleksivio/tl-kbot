package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl;

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.CustomValidator;
import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator;
import io.github.oleksivio.telegram.bot.api.model.objects.inline.InlineQuery;

public class InlineQueryFilterValidator extends FilterValidator<InlineQuery> {

    public InlineQueryFilterValidator(CustomValidator<InlineQuery> validator) {
        super(InlineQuery.class, validator);
    }
}

