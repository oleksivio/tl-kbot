package io.github.oleksivio.tl.kbot.core.model.annotation.validator.impl

import io.github.oleksivio.tl.kbot.core.model.annotation.validator.FilterValidator
import io.github.oleksivio.tl.kbot.server.api.objects.std.CallbackQuery
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.Validator

class CallbackQueryFilterValidator(validator: Validator<CallbackQuery>) : FilterValidator<CallbackQuery>(
    CallbackQuery::class, validator)

