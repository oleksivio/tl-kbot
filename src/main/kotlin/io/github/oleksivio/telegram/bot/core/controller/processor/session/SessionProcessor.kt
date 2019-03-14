package io.github.oleksivio.telegram.bot.core.controller.processor.session

import io.github.oleksivio.telegram.bot.api.model.objects.Update
import io.github.oleksivio.telegram.bot.api.model.result.HandlerResult
import org.springframework.stereotype.Controller
import java.util.*

@Controller
class SessionProcessor {

    private val sessionManagers = ArrayList<SessionManager>()

    fun receive(update: Update): HandlerResult {

        // check already activated sessions
        for (manager in sessionManagers) {
            if (manager.isActive(update)) {
                val handlerResult = manager.receive(update)
                if (!handlerResult.isPassed) {
                    return handlerResult
                }
            }
        }

        // if no any active session receive this update
        // find in initial method
        for (manager in sessionManagers) {
            val handlerResult = manager.init(update)
            if (handlerResult.hasSuccess()) {
                return handlerResult
            }
        }

        return HandlerResult.pass()
    }

    fun add(sessionManager: SessionManager) {
        sessionManagers.add(sessionManager)
    }
}
