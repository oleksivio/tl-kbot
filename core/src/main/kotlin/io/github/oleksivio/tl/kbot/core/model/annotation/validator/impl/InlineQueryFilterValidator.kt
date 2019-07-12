package io.github.oleksivio.tl.kbot.core.model.annotation.validator.impl

import io.github.oleksivio.tl.kbot.core.model.annotation.validator.FilterValidator
import io.github.oleksivio.tl.kbot.server.api.objects.inline.InlineQuery
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.Validator

class InlineQueryFilterValidator(validator: Validator<InlineQuery>) : FilterValidator<InlineQuery>(
    InlineQuery::class, validator)

