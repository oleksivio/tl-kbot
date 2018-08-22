package ru.ioleksiv.telegram.bot.core.controller.annotations.composer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import ru.ioleksiv.telegram.bot.api.model.objects.Update;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.producer.ArgCheckerProducer;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.producer.ArgUnpackerProducer;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.producer.InvokerProducer;
import ru.ioleksiv.telegram.bot.core.controller.handler.Handler;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Validator;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.ExtractValidator;
import ru.ioleksiv.telegram.bot.core.controller.handler.invoke.Invoker;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpack.Unpacker;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpack.UpdateUnpacker;
import ru.ioleksiv.telegram.bot.core.model.ITelegram;

import java.lang.reflect.Method;
import java.util.Optional;

@Controller
public final class HandlerComposer {
    private static final Logger LOG = LoggerFactory.getLogger(HandlerComposer.class);

    private final ArgCheckerProducer argCheckerProducer;

    private final ArgUnpackerProducer argUnpackerProducer;

    private final InvokerProducer invokerProducer;

    public HandlerComposer(ArgCheckerProducer argCheckerProducer,
                           ArgUnpackerProducer argUnpackerProducer,
                           InvokerProducer invokerProducer) {
        this.argCheckerProducer = argCheckerProducer;
        this.argUnpackerProducer = argUnpackerProducer;
        this.invokerProducer = invokerProducer;
    }

    public <ARG extends ITelegram> Optional<Handler> create(Object classInstance,
                                                            Method method) {

        Optional<UpdateUnpacker<ARG>> argUnpackerOptional = argUnpackerProducer.create(method);
        Optional<Validator<ARG>> argCheckerOptional = argCheckerProducer.create(method);

        if (!argUnpackerOptional.isPresent() && !argCheckerOptional.isPresent()) {
            return Optional.empty();
        }

        if (!argCheckerOptional.isPresent()) {
            LOG.error(" Filter annotation was not found for method " + method);
            return Optional.empty();
        }

        if (!argUnpackerOptional.isPresent()) {
            LOG.error(" Receiver annotation was not found for method " + method);
            return Optional.empty();
        }

        UpdateUnpacker<ARG> updateUnpacker = argUnpackerOptional.get();

        Optional<Invoker<ARG>> invokerOptional = invokerProducer.create(method,
                                                                        classInstance,
                                                                        updateUnpacker.getOutClass());

        if (!invokerOptional.isPresent()) {
            return Optional.empty();
        }
        Unpacker<Update, ARG> argUnpacker = updateUnpacker.get();

        ExtractValidator<Update, ARG> updateChecker = new ExtractValidator<>(argUnpacker,
                                                                             argCheckerOptional.get());

        return Optional.of(new Handler<>(invokerOptional.get(), updateChecker, argUnpacker));

    }

}
