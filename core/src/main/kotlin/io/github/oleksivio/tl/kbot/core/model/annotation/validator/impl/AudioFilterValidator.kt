package io.github.oleksivio.tl.kbot.core.model.annotation.validator.impl

import io.github.oleksivio.tl.kbot.core.model.annotation.validator.FilterValidator
import io.github.oleksivio.tl.kbot.server.api.objects.std.files.Audio
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.Validator

class AudioFilterValidator(validator: Validator<Audio>) : FilterValidator<Audio>(
    Audio::class, validator)

