package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.CustomValidator
import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator
import io.github.oleksivio.telegram.bot.api.model.objects.payments.PreCheckoutQuery

class PreCheckoutQueryFilterValidator(validator: CustomValidator<PreCheckoutQuery>) : FilterValidator<PreCheckoutQuery>(PreCheckoutQuery::class, validator)

