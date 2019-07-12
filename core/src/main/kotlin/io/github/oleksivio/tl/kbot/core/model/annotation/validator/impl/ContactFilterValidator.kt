package io.github.oleksivio.tl.kbot.core.model.annotation.validator.impl

import io.github.oleksivio.tl.kbot.core.model.annotation.validator.FilterValidator
import io.github.oleksivio.tl.kbot.server.api.objects.std.Contact
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.Validator

class ContactFilterValidator(validator: Validator<Contact>) : FilterValidator<Contact>(
    Contact::class, validator)
