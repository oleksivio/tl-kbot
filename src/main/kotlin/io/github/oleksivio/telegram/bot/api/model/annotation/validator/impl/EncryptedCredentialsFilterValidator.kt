package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator
import io.github.oleksivio.telegram.bot.api.model.objects.passport.EncryptedCredentials
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator

class EncryptedCredentialsFilterValidator(validator: Validator<EncryptedCredentials>) : FilterValidator<EncryptedCredentials>(EncryptedCredentials::class, validator)
