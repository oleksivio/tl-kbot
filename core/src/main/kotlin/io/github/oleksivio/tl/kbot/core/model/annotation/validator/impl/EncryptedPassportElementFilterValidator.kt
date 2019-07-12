package io.github.oleksivio.tl.kbot.core.model.annotation.validator.impl

import io.github.oleksivio.tl.kbot.core.model.annotation.validator.FilterValidator
import io.github.oleksivio.tl.kbot.server.api.objects.passport.EncryptedPassportElement
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.Validator

class EncryptedPassportElementFilterValidator(validator: Validator<EncryptedPassportElement>) : FilterValidator<EncryptedPassportElement>(
    EncryptedPassportElement::class, validator)
