package ru.ioleksiv.telegram.bot.core.controller.annotations.composer;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import ru.ioleksiv.telegram.bot.api.model.objects.Update;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.producer.ArgCheckerProducer;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.producer.ArgUnpackerProducer;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.producer.InvokerProducer;
import ru.ioleksiv.telegram.bot.core.controller.handler.Handler;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.ExtractChecker;
import ru.ioleksiv.telegram.bot.core.controller.handler.invoke.Invoker;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpack.Unpacker;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpack.UpdateUnpacker;
import ru.ioleksiv.telegram.bot.core.model.ITelegram;

import java.lang.reflect.Method;
import java.util.Optional;

@Controller
public final class HandlerComposer {
    @NotNull
    private final ArgCheckerProducer argCheckerProducer;
    @NotNull
    private final ArgUnpackerProducer argUnpackerProducer;
    @NotNull
    private final InvokerProducer invokerProducer;

    public HandlerComposer(@NotNull ArgCheckerProducer argCheckerProducer,
                           @NotNull ArgUnpackerProducer argUnpackerProducer,
                           @NotNull InvokerProducer invokerProducer) {
        this.argCheckerProducer = argCheckerProducer;
        this.argUnpackerProducer = argUnpackerProducer;
        this.invokerProducer = invokerProducer;
    }

    @NotNull
    public <ARG extends ITelegram> Optional<Handler> create(@NotNull Object classInstance,
                                                            @NotNull Method method) {

        Optional<UpdateUnpacker<ARG>> argUnpackerOptional = argUnpackerProducer.create(method);

        if (!argUnpackerOptional.isPresent()) {
            return Optional.empty();
        }
        UpdateUnpacker<ARG> updateUnpacker = argUnpackerOptional.get();

        Optional<Checker<ARG>> argCheckerOptional = argCheckerProducer.create(method);

        if (!argCheckerOptional.isPresent()) {
            //todo log message with method
            //todo may be not null checker
            return Optional.empty();
        }

        Optional<Invoker<ARG>> invokerOptional = invokerProducer.create(method,
                                                                        classInstance,
                                                                        updateUnpacker.getOutClass());

        if (!invokerOptional.isPresent()) {
            //todo log message with method
            return Optional.empty();
        }
        Unpacker<Update, ARG> argUnpacker = updateUnpacker.get();

        ExtractChecker<Update, ARG> updateChecker = new ExtractChecker<>(argUnpacker,
                                                                         argCheckerOptional.get());

        return Optional.of(new Handler<>(invokerOptional.get(), updateChecker, argUnpacker));

    }

}
