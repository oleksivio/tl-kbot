package io.github.oleksivio.telegram.bot.api.model.annotation.validator

import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator
import io.github.oleksivio.telegram.bot.core.model.ITelegram
import kotlin.reflect.KClass

abstract class FilterValidator<T : ITelegram>
protected constructor(val filterTarget: KClass<T>, val validator: Validator<T>)
