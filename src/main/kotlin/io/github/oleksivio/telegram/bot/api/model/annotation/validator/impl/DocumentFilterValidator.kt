package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator
import io.github.oleksivio.telegram.bot.api.model.objects.std.files.Document
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator

class DocumentFilterValidator(validator: Validator<Document>) : FilterValidator<Document>(Document::class, validator)

