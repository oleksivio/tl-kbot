package io.github.oleksivio.tl.kbot.core.model.annotation.validator.impl

import io.github.oleksivio.tl.kbot.core.model.annotation.validator.FilterValidator
import io.github.oleksivio.tl.kbot.server.api.objects.std.files.Document
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.Validator

class DocumentFilterValidator(validator: Validator<Document>) : FilterValidator<Document>(
    Document::class, validator)

