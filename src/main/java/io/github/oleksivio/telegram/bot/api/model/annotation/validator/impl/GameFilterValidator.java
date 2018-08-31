package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl;

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.CustomValidator;
import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator;
import io.github.oleksivio.telegram.bot.api.model.objects.std.game.Game;

public class GameFilterValidator extends FilterValidator<Game> {

    public GameFilterValidator(CustomValidator<Game> validator) {
        super(Game.class, validator);
    }
}

