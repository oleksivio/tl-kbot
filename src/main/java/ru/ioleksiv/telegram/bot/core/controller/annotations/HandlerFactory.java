package ru.ioleksiv.telegram.bot.core.controller.annotations;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import ru.ioleksiv.telegram.bot.api.model.ActionBuilder;
import ru.ioleksiv.telegram.bot.api.model.objects.Update;
import ru.ioleksiv.telegram.bot.core.controller.handler.Filter;
import ru.ioleksiv.telegram.bot.core.controller.handler.Handler;
import ru.ioleksiv.telegram.bot.core.controller.handler.MethodInvoker;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpacker.Unpacker;

import java.lang.reflect.Method;
import java.util.Optional;

@Controller
public final class HandlerFactory {
    @NotNull
    private final ActionBuilder actionBuilder;
    @NotNull
    private final FilterFactory filterFactory;

    public HandlerFactory(@NotNull ActionBuilder actionBuilder,
                          @NotNull FilterFactory filterFactory) {
        this.actionBuilder = actionBuilder;
        this.filterFactory = filterFactory;
    }

    @NotNull
    public Optional<Handler> create(@NotNull Object classInstance,
                                    @NotNull Method method) {

        Optional<Filter<Update, ?>> rootFilterOptional = filterFactory.findRootFilter(method);

        if (!rootFilterOptional.isPresent()) {
            return Optional.empty();
        }

        Filter<Update, ?> rootFilter = rootFilterOptional.get();
        Unpacker<Update, ?> updateUnpacker = rootFilter.getUnpacker();

        MethodInvoker methodInvoker = new MethodInvoker(method, classInstance, actionBuilder);

        return Optional.of(new Handler(methodInvoker,
                                       rootFilter, updateUnpacker));

    }

}
