package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator
import io.github.oleksivio.telegram.bot.api.model.objects.std.game.Game
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator

class GameFilterValidator(validator: Validator<Game>) : FilterValidator<Game>(Game::class, validator)

