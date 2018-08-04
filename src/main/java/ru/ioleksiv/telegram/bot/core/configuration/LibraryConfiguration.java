package ru.ioleksiv.telegram.bot.core.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import ru.ioleksiv.telegram.bot.core.api.model.ActionBuilder;
import ru.ioleksiv.telegram.bot.core.api.model.TelegramProcessor;
import ru.ioleksiv.telegram.bot.core.controller.annotations.AnnotationProcessor;
import ru.ioleksiv.telegram.bot.core.controller.annotations.composer.SessionComposer;
import ru.ioleksiv.telegram.bot.core.controller.annotations.composer.StatelessComposer;
import ru.ioleksiv.telegram.bot.core.controller.annotations.converter.HandlerFactory;
import ru.ioleksiv.telegram.bot.core.controller.annotations.converter.filter.FilterConverter;
import ru.ioleksiv.telegram.bot.core.controller.annotations.converter.handler.HandlerConverter;
import ru.ioleksiv.telegram.bot.core.controller.builder.ActionBuilderImpl;
import ru.ioleksiv.telegram.bot.core.controller.network.Loader;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.controller.processor.MainProcessor;
import ru.ioleksiv.telegram.bot.core.controller.updater.Updater;

import java.util.Collection;

@Configuration
@ComponentScan("ru.ioleksiv.telegram.bot.core.controller.annotations.converter.impl")
public class LibraryConfiguration {

    @Bean
    public MainProcessor processor() {
        return new MainProcessor();
    }

    @Bean
    public Updater updater(Loader loader,
                           TelegramProcessor telegramProcessor) {
        return new Updater(telegramProcessor, loader);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public Networker networker(RestTemplate restTemplate,
                               @Value("${telegram.bot.token}") String token) {
        return new Networker(restTemplate, token);
    }

    @Bean
    public Loader loader(Networker networker) {
        return new Loader(networker);
    }

    @Bean
    public HandlerFactory handlerFactory(Collection<FilterConverter> filterConverters,
                                         Collection<HandlerConverter> handlerConverters) {
        return new HandlerFactory(filterConverters, handlerConverters);
    }

    @Bean
    public StatelessComposer statelessComposer(HandlerFactory handlerFactory) {
        return new StatelessComposer(handlerFactory);
    }

    @Bean
    public AnnotationProcessor annotationProcessor(MainProcessor mainProcessor,
                                                   SessionComposer sessionComposer,
                                                   StatelessComposer statelessComposer) {
        return new AnnotationProcessor(mainProcessor, statelessComposer, sessionComposer);
    }

    @Bean
    public ActionBuilder actionBuilder(Networker networker) {
        return new ActionBuilderImpl(networker);
    }

    @Bean
    public SessionComposer sessionComposer(HandlerFactory handlerFactory) {
        return new SessionComposer(handlerFactory);
    }

}
