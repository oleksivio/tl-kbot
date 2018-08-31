package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl;

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.CustomValidator;
import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator;
import io.github.oleksivio.telegram.bot.api.model.objects.inline.ChosenInlineResult;

public class ChosenInlineResultFilterValidator extends FilterValidator<ChosenInlineResult> {

    public ChosenInlineResultFilterValidator(CustomValidator<ChosenInlineResult> validator) {
        super(ChosenInlineResult.class, validator);
    }
}

