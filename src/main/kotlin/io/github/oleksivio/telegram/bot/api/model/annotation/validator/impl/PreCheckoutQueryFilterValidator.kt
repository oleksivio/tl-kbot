package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator
import io.github.oleksivio.tl.kbot.server.api.objects.payments.PreCheckoutQuery
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator

class PreCheckoutQueryFilterValidator(validator: Validator<PreCheckoutQuery>) : FilterValidator<PreCheckoutQuery>(
    PreCheckoutQuery::class, validator)

