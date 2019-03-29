package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator
import io.github.oleksivio.telegram.bot.api.model.objects.std.files.Audio
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator

class AudioFilterValidator(validator: Validator<Audio>) : FilterValidator<Audio>(Audio::class, validator)

