package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator
import io.github.oleksivio.telegram.bot.api.model.objects.std.Contact
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator

class ContactFilterValidator(validator: Validator<Contact>) : FilterValidator<Contact>(Contact::class, validator)
