package ru.ioleksiv.telegram.bot.core.controller.updater;

import org.springframework.stereotype.Controller;
import ru.ioleksiv.telegram.bot.api.controller.TelegramProcessor;
import ru.ioleksiv.telegram.bot.api.controller.TelegramUpdater;
import ru.ioleksiv.telegram.bot.api.model.objects.Update;
import ru.ioleksiv.telegram.bot.core.controller.network.Loader;

@Controller
public class Updater implements TelegramUpdater {
    private final TelegramProcessor telegramProcessor;
    private final Loader loader;

    public Updater(TelegramProcessor telegramProcessor, Loader loader) {
        this.telegramProcessor = telegramProcessor;
        this.loader = loader;
    }

    @Override
    public final void longPolling() {

        Iterable<Update> updates = loader.loadUpdates();

        for (Update update : updates) {
            try {
                telegramProcessor.receive(update);
            }
            catch (Exception processException) {
                error(update, processException);
            }
        }

    }

    @Override
    public void error(Update update, Exception onProcessException) {
        // stub
    }
}
