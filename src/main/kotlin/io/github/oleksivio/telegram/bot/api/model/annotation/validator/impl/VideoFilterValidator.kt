package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator
import io.github.oleksivio.telegram.bot.api.model.objects.std.files.Video
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator

class VideoFilterValidator(validator: Validator<Video>) : FilterValidator<Video>(Video::class, validator)

