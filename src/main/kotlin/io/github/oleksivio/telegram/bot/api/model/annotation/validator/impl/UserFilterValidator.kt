package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator
import io.github.oleksivio.tl.kbot.server.api.objects.std.User
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator

class UserFilterValidator(validator: Validator<User>) : FilterValidator<User>(
    User::class, validator)
