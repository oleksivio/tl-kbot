package io.github.oleksivio.telegram.bot.core.controller.processor.session;

import io.github.oleksivio.telegram.bot.api.model.objects.Update;
import io.github.oleksivio.telegram.bot.api.model.objects.std.User;
import io.github.oleksivio.telegram.bot.core.controller.handler.Handler;
import io.github.oleksivio.telegram.bot.core.model.objects.IUserFrom;

import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

public class UserSession extends SessionManager {

    public UserSession(OrderManager orderManager,
                       Handler initialHandler,
                       Handler cancelHandler) {
        super(orderManager, initialHandler, cancelHandler);
    }

    @Override
    protected Optional<Long> getIdOptional(Update update) {

        return Stream.of(update.getMessage(),
                         update.getEditedMessage(),
                         update.getChannelPost(),
                         update.getEditedChannelPost(),
                         update.getShippingQuery(),
                         update.getPreCheckoutQuery(),
                         update.getChosenInlineResult(),
                         update.getInlineQuery(),
                         update.getCallbackQuery())
                .filter(Objects::nonNull)
                .map(IUserFrom::getFrom)
                .map(User::getId)
                .findFirst();

    }
}
