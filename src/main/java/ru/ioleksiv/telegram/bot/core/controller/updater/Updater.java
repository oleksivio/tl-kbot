package ru.ioleksiv.telegram.bot.core.controller.updater;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.core.api.model.TelegramProcessor;
import ru.ioleksiv.telegram.bot.core.api.model.TelegramUpdater;
import ru.ioleksiv.telegram.bot.core.api.model.objects.Update;
import ru.ioleksiv.telegram.bot.core.controller.handler.Handler;
import ru.ioleksiv.telegram.bot.core.controller.network.Loader;

public class Updater implements TelegramUpdater {
    private static final Logger LOG = LoggerFactory.getLogger(Handler.class);

    private final TelegramProcessor telegramProcessor;
    private final Loader loader;

    public Updater(TelegramProcessor telegramProcessor, Loader loader) {
        this.telegramProcessor = telegramProcessor;
        this.loader = loader;
    }

    @Override
    public final void process() {

        Iterable<Update> updates = loader.loadUpdates();

        for (Update update : updates) {
            try {
                telegramProcessor.process(update);
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
