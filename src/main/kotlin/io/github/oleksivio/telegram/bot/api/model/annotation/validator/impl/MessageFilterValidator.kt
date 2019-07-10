package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator
import io.github.oleksivio.tl.kbot.server.api.objects.std.Message
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator

class MessageFilterValidator(validator: Validator<Message>) : FilterValidator<Message>(
    Message::class, validator)
