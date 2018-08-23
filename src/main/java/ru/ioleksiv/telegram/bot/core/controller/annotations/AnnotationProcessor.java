package ru.ioleksiv.telegram.bot.core.controller.annotations;

import org.springframework.stereotype.Controller;
import ru.ioleksiv.telegram.bot.api.annotations.behavior.UserSession;
import ru.ioleksiv.telegram.bot.core.controller.annotations.composer.SessionComposer;
import ru.ioleksiv.telegram.bot.core.controller.annotations.composer.StatelessComposer;
import ru.ioleksiv.telegram.bot.core.controller.processor.MainProcessor;
import ru.ioleksiv.telegram.bot.core.controller.processor.SessionProcessor;
import ru.ioleksiv.telegram.bot.core.controller.processor.StatelessProcessor;

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