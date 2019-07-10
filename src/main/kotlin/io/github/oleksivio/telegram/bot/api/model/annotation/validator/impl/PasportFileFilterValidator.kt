package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator
import io.github.oleksivio.tl.kbot.server.api.objects.passport.PassportFile
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator

class PasportFileFilterValidator(validator: Validator<PassportFile>) : FilterValidator<PassportFile>(
    PassportFile::class, validator)
