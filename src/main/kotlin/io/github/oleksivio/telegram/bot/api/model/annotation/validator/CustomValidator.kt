package io.github.oleksivio.telegram.bot.api.model.annotation.validator

import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator
import io.github.oleksivio.telegram.bot.core.model.ITelegram

interface CustomValidator<T : ITelegram> : Validator<T>
