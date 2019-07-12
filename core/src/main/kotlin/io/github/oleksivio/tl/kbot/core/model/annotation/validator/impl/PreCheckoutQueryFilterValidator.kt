package io.github.oleksivio.tl.kbot.core.model.annotation.validator.impl

import io.github.oleksivio.tl.kbot.core.model.annotation.validator.FilterValidator
import io.github.oleksivio.tl.kbot.server.api.objects.payments.PreCheckoutQuery
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.Validator

class PreCheckoutQueryFilterValidator(validator: Validator<PreCheckoutQuery>) : FilterValidator<PreCheckoutQuery>(
    PreCheckoutQuery::class, validator)
