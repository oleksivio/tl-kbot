package ru.ioleksiv.telegram.bot.core.configuration;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.ioleksiv.telegram.bot.core.controller.annotations.AnnotationProcessor;

@Configuration
@ComponentScan("ru.ioleksiv.telegram.bot.core.configuration")
public class BotApplicationContext implements ApplicationContextAware {

    @Autowired
    private AnnotationProcessor annotationProcessor;

    @Override
    public void setApplicationContext(@NotNull ApplicationContext applicationContext)
            throws BeansException {

        for (String beanName : applicationContext.getBeanDefinitionNames()) {
            Object obj = applicationContext.getBean(beanName);
            annotationProcessor.add(obj);
        }
    }
}
