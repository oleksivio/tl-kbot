package io.github.oleksivio.tl.kbot.core.model.annotation.validator.impl

import io.github.oleksivio.tl.kbot.core.model.annotation.validator.FilterValidator
import io.github.oleksivio.tl.kbot.server.api.objects.std.files.Voice
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.Validator

class VoiceFilterValidator(validator: Validator<Voice>) : FilterValidator<Voice>(
    Voice::class, validator)
