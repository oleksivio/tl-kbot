package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.CustomValidator
import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator
import io.github.oleksivio.telegram.bot.api.model.objects.inline.ChosenInlineResult

class ChosenInlineResultFilterValidator(validator: CustomValidator<ChosenInlineResult>) : FilterValidator<ChosenInlineResult>(ChosenInlineResult::class, validator)

