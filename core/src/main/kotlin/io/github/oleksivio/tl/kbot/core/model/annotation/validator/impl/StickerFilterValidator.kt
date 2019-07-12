package io.github.oleksivio.tl.kbot.core.model.annotation.validator.impl

import io.github.oleksivio.tl.kbot.core.model.annotation.validator.FilterValidator
import io.github.oleksivio.tl.kbot.server.api.objects.std.sticker.Sticker
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.Validator

class StickerFilterValidator(validator: Validator<Sticker>) : FilterValidator<Sticker>(
    Sticker::class, validator)