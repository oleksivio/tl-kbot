package io.github.oleksivio.tl.kbot.core.controller.handler.unpack

import io.github.oleksivio.tl.kbot.server.api.model.ITelegram
import io.github.oleksivio.tl.kbot.server.api.objects.Update
import kotlin.reflect.KClass

typealias UnpackerFunction<IN, OUT> = (IN) -> OUT?

data class UpdateUnpacker<OUT : ITelegram>(
    val unpacker: UnpackerFunction<Update, OUT>,
    val outClass: KClass<OUT>
)
