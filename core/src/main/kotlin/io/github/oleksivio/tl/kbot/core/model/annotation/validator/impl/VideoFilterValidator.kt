package io.github.oleksivio.tl.kbot.core.model.annotation.validator.impl

import io.github.oleksivio.tl.kbot.core.model.annotation.validator.FilterValidator
import io.github.oleksivio.tl.kbot.server.api.objects.std.files.Video
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.Validator

class VideoFilterValidator(validator: Validator<Video>) : FilterValidator<Video>(
    Video::class, validator)

