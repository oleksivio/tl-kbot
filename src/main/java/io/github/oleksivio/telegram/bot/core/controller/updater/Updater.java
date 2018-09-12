package io.github.oleksivio.telegram.bot.core.controller.updater;

import io.github.oleksivio.telegram.bot.api.controller.TelegramProcessor;
import io.github.oleksivio.telegram.bot.api.controller.TelegramUpdater;
import io.github.oleksivio.telegram.bot.api.controller.UpdateErrorListener;
import io.github.oleksivio.telegram.bot.api.model.objects.Update;
import io.github.oleksivio.telegram.bot.core.controller.network.Loader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class Updater implements TelegramUpdater {
    private final TelegramProcessor telegramProcessor;
    private final Loader loader;
    private UpdateErrorListener updateErrorListener = (update, onProcessException) -> {
    };

    public Updater(TelegramProcessor telegramProcessor,
                   Loader loader) {
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
                updateErrorListener.onError(update, processException);
            }
        }

    }

    @Autowired(required = false)
    public void setErrorListener(UpdateErrorListener updateErrorListener) {
        this.updateErrorListener = updateErrorListener;
    }

}
