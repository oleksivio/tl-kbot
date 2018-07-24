package ru.ioleksiv.telegram.bot.core.utils;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.ChosenInlineResult;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.Message;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.query.CallbackQuery;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.query.InlineQuery;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.query.PreCheckoutQuery;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.query.ShippingQuery;

public enum Target {
    USER {
        @Override
        @NotNull
        public Long getId(@NotNull Message message) {
            return message.getSender().getId();
        }

        @Override
        public Long getId(@NotNull CallbackQuery callbackQuery) {
            return callbackQuery.getSender().getId();
        }

        @Override
        public Long getId(@NotNull ShippingQuery shippingQuery) {

            // TODO change default method body
            throw new UnsupportedOperationException("You should change default method body");
        }

        @Override
        public Long getId(@NotNull PreCheckoutQuery preCheckoutQuery) {

            // TODO change default method body
            throw new UnsupportedOperationException("You should change default method body");
        }

        @Override
        public Long getId(@NotNull InlineQuery inlineQuery) {
            return inlineQuery.getSender().getId();
        }

        @Override
        public Long getId(@NotNull ChosenInlineResult chosenInlineResult) {

            // TODO change default method body
            throw new UnsupportedOperationException("You should change default method body");
        }
    },
    CHAT {
        @Override
        @NotNull

        public Long getId(@NotNull Message message) {
            return message.getChat().getId();
        }

        @Override
        @Nullable
        public Long getId(@NotNull CallbackQuery callbackQuery) {
            Message message = callbackQuery.getMessage();
            if (message != null) {
                return message.getChat().getId();
            }
            return null;
        }

        @Override
        public Long getId(@NotNull ShippingQuery shippingQuery) {

            // TODO change default method body
            throw new UnsupportedOperationException("You should change default method body");
        }

        @Override
        public Long getId(@NotNull PreCheckoutQuery preCheckoutQuery) {

            // TODO change default method body
            throw new UnsupportedOperationException("You should change default method body");
        }

        @Override
        @Nullable
        public Long getId(@NotNull InlineQuery inlineQuery) {
            return null;
        }

        @Override
        public Long getId(@NotNull ChosenInlineResult chosenInlineResult) {

            // TODO change default method body
            throw new UnsupportedOperationException("You should change default method body");
        }
    };

    @NotNull
    public abstract Long getId(@NotNull Message message);

    public abstract Long getId(@NotNull CallbackQuery callbackQuery);

    public abstract Long getId(@NotNull ShippingQuery shippingQuery);

    public abstract Long getId(@NotNull PreCheckoutQuery preCheckoutQuery);

    public abstract Long getId(@NotNull InlineQuery inlineQuery);

    public abstract Long getId(@NotNull ChosenInlineResult chosenInlineResult);

}
