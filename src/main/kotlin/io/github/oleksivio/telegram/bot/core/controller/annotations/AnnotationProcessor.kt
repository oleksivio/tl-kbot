package io.github.oleksivio.telegram.bot.core.controller.annotations

import io.github.oleksivio.telegram.bot.api.annotations.behavior.Session
import io.github.oleksivio.telegram.bot.core.controller.annotations.composer.SessionInitializer
import io.github.oleksivio.telegram.bot.core.controller.annotations.composer.StatelessInitializer
import org.springframework.stereotype.Controller
import kotlin.reflect.full.findAnnotation

@Controller
class AnnotationProcessor(private val statelessInitializer: StatelessInitializer,
                          private val sessionInitializer: SessionInitializer) {

    fun add(obj: Any) {
        val objClz = obj::class

        if (objClz.findAnnotation<Session>() != null) {
            sessionInitializer.init(objClz, obj)
        } else {
            statelessInitializer.init(objClz, obj)
        }
    }

}
