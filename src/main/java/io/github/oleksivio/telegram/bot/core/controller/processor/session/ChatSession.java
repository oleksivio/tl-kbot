package io.github.oleksivio.telegram.bot.core.controller.processor.session;

import io.github.oleksivio.telegram.bot.api.model.objects.Update;
import io.github.oleksivio.telegram.bot.api.model.objects.std.Chat;
import io.github.oleksivio.telegram.bot.core.controller.handler.Handler;
import io.github.oleksivio.telegram.bot.core.model.objects.IChat;

import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

public class ChatSession extends SessionManager {

    public ChatSession(OrderManager orderManager,
                       Handler initialHandler,
                       Handler cancelHandler) {
        super(orderManager, initialHandler, cancelHandler);
    }

    @Override
    protected Optional<Long> getIdOptional(Update update) {
        return Stream.of(update.getMessage(),
                         update.getEditedMessage(),
                         update.getChannelPost(),
                         update.getEditedChannelPost())
                .filter(Objects::nonNull)
                .map(IChat::getChat)
                .map(Chat::getId)
                .findFirst();

    }
}
