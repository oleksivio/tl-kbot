package io.github.oleksivio.telegram.bot.core.controller.annotations.composer

import io.github.oleksivio.telegram.bot.core.controller.processor.StatelessProcessor
import io.github.oleksivio.tl.kbot.server.api.model.ITelegram
import org.springframework.stereotype.Controller
import kotlin.reflect.KClass
import kotlin.reflect.full.functions

@Controller
class StatelessInitializer(private val handlerCreator: HandlerCreator, private val statelessProcessor: StatelessProcessor) {

    fun init(objClz: KClass<*>, obj: Any) = objClz.functions
            .mapNotNull { handlerCreator.create<ITelegram>(obj, it) }
            .forEach { statelessProcessor.add(it) }

}
