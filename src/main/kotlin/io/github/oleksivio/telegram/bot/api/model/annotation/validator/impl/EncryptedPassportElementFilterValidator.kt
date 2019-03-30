package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator
import io.github.oleksivio.telegram.bot.api.model.objects.passport.EncryptedPassportElement
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator

class EncryptedPassportElementFilterValidator(validator: Validator<EncryptedPassportElement>) : FilterValidator<EncryptedPassportElement>(EncryptedPassportElement::class, validator)
