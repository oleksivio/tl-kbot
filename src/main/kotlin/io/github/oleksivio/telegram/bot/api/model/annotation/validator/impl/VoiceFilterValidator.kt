package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator
import io.github.oleksivio.telegram.bot.api.model.objects.std.files.Voice
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator

class VoiceFilterValidator(validator: Validator<Voice>) : FilterValidator<Voice>(Voice::class, validator)

