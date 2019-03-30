package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator
import io.github.oleksivio.telegram.bot.api.model.objects.std.CallbackQuery
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator

class CallbackQueryFilterValidator(validator: Validator<CallbackQuery>) : FilterValidator<CallbackQuery>(CallbackQuery::class, validator)

