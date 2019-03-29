package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator
import io.github.oleksivio.telegram.bot.api.model.objects.std.files.PhotoSize
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator

class PhotoFilterValidator(validator: Validator<PhotoSize>) : FilterValidator<PhotoSize>(PhotoSize::class, validator)

