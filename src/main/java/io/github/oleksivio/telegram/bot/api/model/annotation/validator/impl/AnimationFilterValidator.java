package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl;

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.CustomValidator;
import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator;
import io.github.oleksivio.telegram.bot.api.model.objects.std.game.Animation;

public class AnimationFilterValidator extends FilterValidator<Animation> {

    public AnimationFilterValidator(CustomValidator<Animation> validator) {
        super(Animation.class, validator);
    }
}
