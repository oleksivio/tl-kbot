package io.github.oleksivio.tl.kbot.core.model.annotation.validator.impl

import io.github.oleksivio.tl.kbot.core.model.annotation.validator.FilterValidator
import io.github.oleksivio.tl.kbot.server.api.objects.std.sticker.MaskPosition
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.Validator

class MaskPositionFilterValidator(validator: Validator<MaskPosition>) : FilterValidator<MaskPosition>(
    MaskPosition::class, validator)
