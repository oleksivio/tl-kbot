package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.CustomValidator
import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator
import io.github.oleksivio.telegram.bot.api.model.objects.passport.EncryptedCredentials

class EncryptedCredentialsFilterValidator(validator: CustomValidator<EncryptedCredentials>) : FilterValidator<EncryptedCredentials>(EncryptedCredentials::class, validator)
