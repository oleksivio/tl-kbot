package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator
import io.github.oleksivio.telegram.bot.api.model.objects.std.sticker.Sticker
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator

class StickerFilterValidator(validator: Validator<Sticker>) : FilterValidator<Sticker>(Sticker::class, validator)
