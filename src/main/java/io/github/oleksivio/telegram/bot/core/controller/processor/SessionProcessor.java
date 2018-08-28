package io.github.oleksivio.telegram.bot.core.controller.processor;

import io.github.oleksivio.telegram.bot.api.model.objects.std.User;
import io.github.oleksivio.telegram.bot.api.model.result.HandlerResult;
import io.github.oleksivio.telegram.bot.core.controller.handler.Handler;
import io.github.oleksivio.telegram.bot.api.model.objects.Update;
import io.github.oleksivio.telegram.bot.core.model.objects.IUserFrom;

import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

public class SessionProcessor {
    private final SessionOrderManager orderManager;
    private final Handler initialHandler;
    private final Handler cancelHandler;

    public SessionProcessor(SessionOrderManager orderManager,
                            Handler initialHandler,
                            Handler cancelHandler) {
        this.orderManager = orderManager;
        this.initialHandler = initialHandler;
        this.cancelHandler = cancelHandler;
    }

    HandlerResult receive(Update update) {

        Optional<Long> userFromIdOptional = Stream.of(update.getMessage(),
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

        if (!userFromIdOptional.isPresent()) {
            return HandlerResult.pass();
        }

        long id = userFromIdOptional.get();

        if (!orderManager.isActive(id) && initialHandler.hasSubscription(update)) {
            HandlerResult handlerResult = initialHandler.run(update);
            if (handlerResult.hasSuccess()) {
                orderManager.next(id);
            }
            return handlerResult;
        }

        if (orderManager.isActive(id) && cancelHandler.hasSubscription(update)) {
            orderManager.reset(id);

            return cancelHandler.run(update);
        }

        if (orderManager.isActive(id)) {
            Handler handler = orderManager.getCurrent(id);

            if (handler != null && handler.hasSubscription(update)) {

                HandlerResult handlerResult = handler.run(update);

                if (handlerResult.hasSuccess()) {
                    orderManager.next(id);
                    return handlerResult;
                }
                if (handlerResult.hasCancelSession()) {
                    orderManager.reset(id);
                    return handlerResult;
                }

                return HandlerResult.success();
            }

        }

        return HandlerResult.pass();
    }

}
