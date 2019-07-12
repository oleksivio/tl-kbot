package io.github.oleksivio.tl.kbot.core.core.controller.annotations.composer

import io.github.oleksivio.tl.kbot.core.core.controller.processor.StatelessProcessor
import io.github.oleksivio.tl.kbot.server.api.model.ITelegram

import kotlin.reflect.KClass
import kotlin.reflect.full.functions

class StatelessInitializer(
    private val handlerCreator: HandlerCreator,
    private val statelessProcessor: StatelessProcessor
) {

    fun init(objClz: KClass<*>, obj: Any) = objClz.functions
        .mapNotNull { handlerCreator.create<ITelegram>(obj, it) }
        .forEach { statelessProcessor.add(it) }
}
