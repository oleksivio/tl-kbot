package io.github.oleksivio.tl.kbot.core.model.annotation.validator

import io.github.oleksivio.tl.kbot.core.controller.handler.check.Validator
import io.github.oleksivio.tl.kbot.server.api.model.ITelegram
import kotlin.reflect.KClass

abstract class FilterValidator<T : ITelegram>
protected constructor(val filterTarget: KClass<T>, val validator: Validator<T>)
