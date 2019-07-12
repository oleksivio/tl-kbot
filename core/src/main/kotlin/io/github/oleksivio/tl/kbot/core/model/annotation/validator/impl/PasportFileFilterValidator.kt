package io.github.oleksivio.tl.kbot.core.model.annotation.validator.impl

import io.github.oleksivio.tl.kbot.core.model.annotation.validator.FilterValidator
import io.github.oleksivio.tl.kbot.server.api.objects.passport.PassportFile
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.Validator

class PasportFileFilterValidator(validator: Validator<PassportFile>) : FilterValidator<PassportFile>(
    PassportFile::class, validator)
