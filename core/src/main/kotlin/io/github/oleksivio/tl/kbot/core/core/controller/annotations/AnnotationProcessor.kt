package io.github.oleksivio.tl.kbot.core.core.controller.annotations

import io.github.oleksivio.tl.kbot.core.annotations.behavior.Session
import io.github.oleksivio.tl.kbot.core.core.controller.annotations.composer.SessionInitializer
import io.github.oleksivio.tl.kbot.core.core.controller.annotations.composer.StatelessInitializer
import kotlin.reflect.full.findAnnotation

class AnnotationProcessor(
    private val statelessInitializer: StatelessInitializer,
    private val sessionInitializer: SessionInitializer
) {

    fun add(obj: Any) {

        val objClz = obj::class

        // if we find annotation on Java Lambda classes - kotlin reflection throw Exception
        if (objClz.java.annotations.isEmpty()) {
            return
        }

        if (objClz.findAnnotation<Session>() != null) {
            sessionInitializer.init(objClz, obj)
        } else {
            statelessInitializer.init(objClz, obj)
        }
    }
}
