package ru.ioleksiv.telegram.bot.core.controller.updater;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ioleksiv.telegram.bot.core.api.TelegramProcessor;
import ru.ioleksiv.telegram.bot.core.api.TelegramUpdater;
import ru.ioleksiv.telegram.bot.core.api.result.HandlerResult;
import ru.ioleksiv.telegram.bot.core.controller.handler.invoke.AbstractInvokeHandler;
import ru.ioleksiv.telegram.bot.core.controller.network.Loader;
import ru.ioleksiv.telegram.bot.core.controller.network.Sender;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.Update;

public class Updater implements TelegramUpdater {
    private static final Logger LOG = LoggerFactory.getLogger(AbstractInvokeHandler.class);

    private final TelegramProcessor telegramProcessor;
    private final Loader loader;
    private final Sender sender;

    public Updater(TelegramProcessor telegramProcessor, Loader loader, Sender sender) {
        this.telegramProcessor = telegramProcessor;
        this.loader = loader;
        this.sender = sender;
    }

    @Override
    public void request() {

        Iterable<Update> updates = loader.loadUpdates();

        for (Update update : updates) {
            try {
                HandlerResult handlerResult = telegramProcessor.process(update);
                sender.send(handlerResult.getAction());
            }
            catch (Exception ignored) {
                // todo add abiltity to hook update
                LOG.error("Error when trying to process update #" + update.getUpdateId());
            }
        }

    }
}
