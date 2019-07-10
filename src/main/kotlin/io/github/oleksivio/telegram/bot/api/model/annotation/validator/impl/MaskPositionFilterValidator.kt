package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator
import io.github.oleksivio.tl.kbot.server.api.objects.std.sticker.MaskPosition
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator

class MaskPositionFilterValidator(validator: Validator<MaskPosition>) : FilterValidator<MaskPosition>(
    MaskPosition::class, validator)
