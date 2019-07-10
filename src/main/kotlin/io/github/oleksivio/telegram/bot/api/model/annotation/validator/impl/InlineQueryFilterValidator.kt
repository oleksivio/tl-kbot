package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator
import io.github.oleksivio.tl.kbot.server.api.objects.inline.InlineQuery
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator

class InlineQueryFilterValidator(validator: Validator<InlineQuery>) : FilterValidator<InlineQuery>(
    InlineQuery::class, validator)

