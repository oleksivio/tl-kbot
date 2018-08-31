package io.github.oleksivio.telegram.bot.core.controller.annotations;

import io.github.oleksivio.telegram.bot.api.annotations.behavior.Session;
import io.github.oleksivio.telegram.bot.core.controller.annotations.composer.SessionInitializer;
import io.github.oleksivio.telegram.bot.core.controller.annotations.composer.StatelessInitializer;
import org.springframework.stereotype.Controller;

@Controller
public class AnnotationProcessor {

    private final StatelessInitializer statelessInitializer;

    private final SessionInitializer sessionInitializer;

    public AnnotationProcessor(StatelessInitializer statelessInitializer,
                               SessionInitializer sessionInitializer) {
        this.statelessInitializer = statelessInitializer;
        this.sessionInitializer = sessionInitializer;
    }

    public void add(Object obj) {
        Class<?> objClz = obj.getClass();

        if (objClz.isAnnotationPresent(Session.class)) {
            sessionInitializer.init(objClz, obj);
        }
        else {
            statelessInitializer.init(objClz, obj);
        }
    }

}