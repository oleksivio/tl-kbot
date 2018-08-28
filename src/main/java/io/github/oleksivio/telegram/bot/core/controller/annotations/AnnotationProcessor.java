package io.github.oleksivio.telegram.bot.core.controller.annotations;

import io.github.oleksivio.telegram.bot.core.controller.annotations.composer.SessionComposer;
import io.github.oleksivio.telegram.bot.core.controller.annotations.composer.StatelessComposer;
import org.springframework.stereotype.Controller;
import io.github.oleksivio.telegram.bot.api.annotations.behavior.UserSession;
import io.github.oleksivio.telegram.bot.core.controller.processor.MainProcessor;
import io.github.oleksivio.telegram.bot.core.controller.processor.SessionProcessor;
import io.github.oleksivio.telegram.bot.core.controller.processor.StatelessProcessor;

import java.util.Optional;

@Controller
public class AnnotationProcessor {

    private final MainProcessor mainProcessor;

    private final StatelessComposer statelessComposer;

    private final SessionComposer sessionComposer;

    public AnnotationProcessor(MainProcessor mainProcessor,
                               StatelessComposer statelessComposer,
                               SessionComposer sessionComposer) {
        this.mainProcessor = mainProcessor;
        this.statelessComposer = statelessComposer;
        this.sessionComposer = sessionComposer;
    }

    public void add(Object obj) {
        Class<?> objClz = obj.getClass();

        if (objClz.isAnnotationPresent(UserSession.class)) {
            SessionProcessor sessionProcessor = sessionComposer.create(objClz, obj);
            mainProcessor.addSession(sessionProcessor);
        }
        else {
            Optional<StatelessProcessor> statelessProcessorOpt = statelessComposer.create(objClz, obj);
            statelessProcessorOpt.ifPresent(mainProcessor::addStateless);
        }
    }

}