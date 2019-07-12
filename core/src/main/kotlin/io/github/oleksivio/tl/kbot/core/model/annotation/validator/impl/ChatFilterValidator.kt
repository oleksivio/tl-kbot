package io.github.oleksivio.tl.kbot.core.model.annotation.validator.impl

import io.github.oleksivio.tl.kbot.core.model.annotation.validator.FilterValidator
import io.github.oleksivio.tl.kbot.server.api.objects.std.Chat
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.Validator

class ChatFilterValidator(validator: Validator<Chat>) : FilterValidator<Chat>(
    Chat::class, validator)
