package ru.ioleksiv.telegram.bot.core.utils;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.ChosenInlineResult;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.Message;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.query.CallbackQuery;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.query.InlineQuery;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.query.PreCheckoutQuery;
import ru.ioleksiv.telegram.bot.core.model.telegram.model.query.ShippingQuery;

public interface ITargetChat {
    @NotNull
    Long getId(@NotNull Message message);

    @Nullable
    Long getId(@NotNull CallbackQuery callbackQuery);

    Long getId(@NotNull ShippingQuery shippingQuery);

    Long getId(@NotNull PreCheckoutQuery preCheckoutQuery);

    @Nullable
    Long getId(@NotNull InlineQuery inlineQuery);

    Long getId(@NotNull ChosenInlineResult chosenInlineResult);
}
