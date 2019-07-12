package io.github.oleksivio.tl.kbot.core.model.annotation.validator.impl

import io.github.oleksivio.tl.kbot.core.model.annotation.validator.FilterValidator
import io.github.oleksivio.tl.kbot.server.api.objects.std.game.Game
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.Validator

class GameFilterValidator(validator: Validator<Game>) : FilterValidator<Game>(
    Game::class, validator)
