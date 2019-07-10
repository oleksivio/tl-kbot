package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator
import io.github.oleksivio.tl.kbot.server.api.objects.std.MessageEntity
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator

class MessageEntityFilterValidator(validator: Validator<MessageEntity>) : FilterValidator<MessageEntity>(
    MessageEntity::class, validator)
