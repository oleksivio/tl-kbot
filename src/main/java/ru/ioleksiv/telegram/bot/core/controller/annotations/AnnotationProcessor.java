package ru.ioleksiv.telegram.bot.core.controller.annotations;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import ru.ioleksiv.telegram.bot.api.annotations.behavior.Session;
import ru.ioleksiv.telegram.bot.api.annotations.behavior.Stateless;
import ru.ioleksiv.telegram.bot.core.controller.annotations.composer.SessionComposer;
import ru.ioleksiv.telegram.bot.core.controller.annotations.composer.StatelessComposer;
import ru.ioleksiv.telegram.bot.core.controller.processor.MainProcessor;
import ru.ioleksiv.telegram.bot.core.controller.processor.SessionProcessor;
import ru.ioleksiv.telegram.bot.core.controller.processor.StatelessProcessor;

import java.util.List;

@Controller
public class AnnotationProcessor {

    @NotNull
    private final MainProcessor mainProcessor;
    @NotNull
    private final StatelessComposer statelessComposer;
    @NotNull
    private final SessionComposer sessionComposer;

    public AnnotationProcessor(@NotNull MainProcessor mainProcessor,
                               @NotNull StatelessComposer statelessComposer,
                               @NotNull SessionComposer sessionComposer) {
        this.mainProcessor = mainProcessor;
        this.statelessComposer = statelessComposer;
        this.sessionComposer = sessionComposer;
    }

    public void add(@NotNull Object obj) {
        Class<?> objClz = obj.getClass();

        if (objClz.isAnnotationPresent(Session.class)) {
            SessionProcessor sessionProcessor = sessionComposer.create(objClz, obj);
            mainProcessor.addSession(sessionProcessor);
        }
        else if (objClz.isAnnotationPresent(Stateless.class)) {
            List<StatelessProcessor> statelessProcessor = statelessComposer.create(objClz, obj);
            mainProcessor.addStateless(statelessProcessor);
        }
    }

}