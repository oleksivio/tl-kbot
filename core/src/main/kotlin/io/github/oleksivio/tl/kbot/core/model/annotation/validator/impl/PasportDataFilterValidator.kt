package io.github.oleksivio.tl.kbot.core.model.annotation.validator.impl

import io.github.oleksivio.tl.kbot.core.model.annotation.validator.FilterValidator
import io.github.oleksivio.tl.kbot.server.api.objects.passport.PassportData
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.Validator

class PasportDataFilterValidator(validator: Validator<PassportData>) : FilterValidator<PassportData>(
    PassportData::class, validator)
