package io.github.oleksivio.tl.kbot.core.model.annotation.validator.impl

import io.github.oleksivio.tl.kbot.core.model.annotation.validator.FilterValidator
import io.github.oleksivio.tl.kbot.server.api.objects.inline.ChosenInlineResult
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.Validator

class ChosenInlineResultFilterValidator(validator: Validator<ChosenInlineResult>) : FilterValidator<ChosenInlineResult>(
    ChosenInlineResult::class, validator)
