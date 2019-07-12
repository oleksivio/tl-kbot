package io.github.oleksivio.tl.kbot.core.core.controller.processor.session

import io.github.oleksivio.tl.kbot.core.model.result.HandlerResult
import io.github.oleksivio.tl.kbot.server.api.objects.Update
import java.util.ArrayList

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
            if (handlerResult.isSucess) {
                return handlerResult
            }
        }

        return HandlerResult.pass()
    }

    fun add(sessionManager: SessionManager) {
        sessionManagers.add(sessionManager)
    }
}
