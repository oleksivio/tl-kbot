package io.github.oleksivio.tl.kbot.core.model.annotation.validator.impl

import io.github.oleksivio.tl.kbot.core.model.annotation.validator.FilterValidator
import io.github.oleksivio.tl.kbot.server.api.objects.std.User
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.Validator

class UserFilterValidator(validator: Validator<User>) : FilterValidator<User>(
    User::class, validator)
