package io.github.oleksivio.tl.kbot.core.model.annotation.validator.impl

import io.github.oleksivio.tl.kbot.core.model.annotation.validator.FilterValidator
import io.github.oleksivio.tl.kbot.server.api.objects.std.Message
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.Validator

class MessageFilterValidator(validator: Validator<Message>) : FilterValidator<Message>(
    Message::class, validator)
