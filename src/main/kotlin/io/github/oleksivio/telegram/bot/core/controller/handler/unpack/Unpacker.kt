package io.github.oleksivio.telegram.bot.core.controller.handler.unpack

import io.github.oleksivio.tl.kbot.server.api.objects.Update
import io.github.oleksivio.tl.kbot.server.api.model.ITelegram
import kotlin.reflect.KClass

typealias UnpackerFunction<IN, OUT> = (IN) -> OUT?

data class UpdateUnpacker<OUT : ITelegram>(val unpacker: UnpackerFunction<Update, OUT>,
                                                                                        val outClass: KClass<OUT>)
