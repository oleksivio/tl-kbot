package io.github.oleksivio.telegram.bot.core.controller.handler.unpack

import io.github.oleksivio.telegram.bot.api.model.objects.Update
import io.github.oleksivio.telegram.bot.core.model.ITelegram
import kotlin.reflect.KClass

typealias UnpackerFunction<IN, OUT> = (IN) -> OUT?

data class UpdateUnpacker<OUT : ITelegram>(val unpacker: UnpackerFunction<Update, OUT>,
                                           val outClass: KClass<OUT>) 
