package io.github.oleksivio.telegram.bot.core.controller.processor;

import io.github.oleksivio.telegram.bot.api.controller.TelegramProcessor;
import io.github.oleksivio.telegram.bot.api.model.objects.Update;
import io.github.oleksivio.telegram.bot.api.model.result.HandlerResult;
import io.github.oleksivio.telegram.bot.core.controller.processor.session.SessionProcessor;
import org.springframework.stereotype.Controller;

@Controller
public class MainProcessor implements TelegramProcessor {

    private final SessionProcessor sessionProcessor;
    private final StatelessProcessor statelessProcessor;

    public MainProcessor(SessionProcessor sessionProcessor,
                         StatelessProcessor statelessProcessor) {
        this.sessionProcessor = sessionProcessor;
        this.statelessProcessor = statelessProcessor;
    }

    @Override
    public void receive(Update update) {
        if (update == null) {
            return;
        }

        HandlerResult sessionResult = sessionProcessor.receive(update);

        if (sessionResult.isPassed()) {
            statelessProcessor.receive(update);
        }

    }

}
