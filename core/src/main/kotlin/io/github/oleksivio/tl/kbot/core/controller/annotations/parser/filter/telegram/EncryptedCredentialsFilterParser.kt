package io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.telegram

import io.github.oleksivio.tl.kbot.core.annotations.filter.composite.EncryptedCredentialsFilter
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.FilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.finder.Finder
import io.github.oleksivio.tl.kbot.core.controller.handler.check.Validator
import io.github.oleksivio.tl.kbot.core.controller.handler.check.impl.UnionExtractValidator
import io.github.oleksivio.tl.kbot.server.api.objects.passport.EncryptedCredentials

class EncryptedCredentialsFilterParser :
    FilterParser<EncryptedCredentialsFilter, EncryptedCredentials> {

    override val parserAnnotationClass = EncryptedCredentialsFilter::class

    override fun createChecker(
        annotation: EncryptedCredentialsFilter,
        finder: Finder
    ): Validator<EncryptedCredentials> {
        val unionExtractValidator =
            UnionExtractValidator<EncryptedCredentials>()

        annotation.validator
            .map { validatorName -> finder.find(validatorName, EncryptedCredentials::class) }
            .forEach { validator -> unionExtractValidator.add({ it }, validator) }

        val data = annotation.data
        if (data.status.isActive) {
            unionExtractValidator.add({ it.data }, finder.find(data))
        }
        val hash = annotation.hash
        if (hash.status.isActive) {
            unionExtractValidator.add({ it.hash }, finder.find(hash))
        }
        val secret = annotation.secret
        if (secret.status.isActive) {
            unionExtractValidator.add({ it.secret }, finder.find(secret))
        }

        return unionExtractValidator
    }
}

