package ru.ioleksiv.telegram.bot.core.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import ru.ioleksiv.telegram.bot.core.api.TelegramProcessor;
import ru.ioleksiv.telegram.bot.core.controller.annotations.AnnotationProcessor;
import ru.ioleksiv.telegram.bot.core.controller.network.Loader;
import ru.ioleksiv.telegram.bot.core.controller.network.Networker;
import ru.ioleksiv.telegram.bot.core.controller.network.Sender;
import ru.ioleksiv.telegram.bot.core.controller.processor.MainProcessor;
import ru.ioleksiv.telegram.bot.core.controller.updater.Updater;

@Configuration
public class LibraryConfiguration {

    @Bean
    public MainProcessor processor() {
        return new MainProcessor();
    }

    @Bean
    public Sender sender(Networker networker) {
        return new Sender(networker);
    }

    @Bean
    public Updater updater(Loader loader,
                           Sender sender,
                           TelegramProcessor telegramProcessor) {
        return new Updater(telegramProcessor, loader, sender);
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
    public AnnotationProcessor annotationProcessor(MainProcessor mainProcessor) {
        return new AnnotationProcessor(mainProcessor);
    }

}
