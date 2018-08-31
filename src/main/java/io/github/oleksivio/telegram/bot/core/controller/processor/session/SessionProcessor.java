package io.github.oleksivio.telegram.bot.core.controller.processor.session;

import io.github.oleksivio.telegram.bot.api.model.objects.Update;
import io.github.oleksivio.telegram.bot.api.model.result.HandlerResult;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.Collection;

@Controller
public class SessionProcessor {

    private final Collection<SessionManager> sessionManagers = new ArrayList<>();

    public HandlerResult receive(Update update) {

        // check already activated sessions
        for (SessionManager manager : sessionManagers) {
            if (manager.isActive(update)) {
                HandlerResult handlerResult = manager.receive(update);
                if (!handlerResult.isPassed()) {
                    return handlerResult;
                }
            }
        }

        // if no any active session receive this update
        // find in initial method
        for (SessionManager manager : sessionManagers) {
            HandlerResult handlerResult = manager.init(update);
            if (handlerResult.hasSuccess()) {
                return handlerResult;
            }
        }

        return HandlerResult.pass();
    }


    public void add(SessionManager sessionManager) {
        sessionManagers.add(sessionManager);
    }
}
