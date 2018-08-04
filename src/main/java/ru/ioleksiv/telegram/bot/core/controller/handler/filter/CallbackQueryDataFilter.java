package ru.ioleksiv.telegram.bot.core.controller.handler.filter;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.ioleksiv.telegram.bot.core.api.model.objects.std.CallbackQuery;

import java.util.Collection;

public class CallbackQueryDataFilter extends TextFilter<CallbackQuery> {

    public CallbackQueryDataFilter(@NotNull Collection<String> startWith,
                                   @NotNull Collection<String> equalWith,
                                   @NotNull Collection<String> endWith,
                                   String regExp) {
        super(startWith, equalWith, endWith, regExp);
    }

    @Override
    @Nullable
    protected  String extractText(CallbackQuery argument) {
        return argument.getData();
    }

}
