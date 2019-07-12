package io.github.oleksivio.tl.kbot.core.model.annotation.validator.impl

import io.github.oleksivio.tl.kbot.core.model.annotation.validator.FilterValidator
import io.github.oleksivio.tl.kbot.server.api.objects.std.files.PhotoSize
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.Validator

class PhotoFilterValidator(validator: Validator<PhotoSize>) : FilterValidator<PhotoSize>(
    PhotoSize::class, validator)

