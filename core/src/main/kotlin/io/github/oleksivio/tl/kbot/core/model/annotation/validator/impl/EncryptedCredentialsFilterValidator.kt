package io.github.oleksivio.tl.kbot.core.model.annotation.validator.impl

import io.github.oleksivio.tl.kbot.core.model.annotation.validator.FilterValidator
import io.github.oleksivio.tl.kbot.server.api.objects.passport.EncryptedCredentials
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.Validator

class EncryptedCredentialsFilterValidator(validator: Validator<EncryptedCredentials>) : FilterValidator<EncryptedCredentials>(
    EncryptedCredentials::class, validator)
