package io.github.oleksivio.telegram.bot.core.configuration;

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator;
import io.github.oleksivio.telegram.bot.core.controller.annotations.holder.CustomValidatorHolder;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;
import io.github.oleksivio.telegram.bot.core.controller.annotations.AnnotationProcessor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Configuration
public class BotApplicationContext implements ApplicationContextAware {

    private final AnnotationProcessor annotationProcessor;
    private final CustomValidatorHolder customValidatorHolder;

    public BotApplicationContext(AnnotationProcessor annotationProcessor,
                                 CustomValidatorHolder customValidatorHolder) {
        this.annotationProcessor = annotationProcessor;
        this.customValidatorHolder = customValidatorHolder;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        List<SimpleBean> simpleBeans = new ArrayList<>();
        for (String beanName : applicationContext.getBeanDefinitionNames()) {
            Object instance = applicationContext.getBean(beanName);
            simpleBeans.add(new SimpleBean(beanName, instance));
        }

        for (SimpleBean simpleBean : simpleBeans) {
            if (simpleBean.isFilterValidator()) {
                customValidatorHolder.add(simpleBean.getName(), (FilterValidator) simpleBean.getInstance());
            }
        }

        for (SimpleBean simpleBean : simpleBeans) {
            annotationProcessor.add(simpleBean.getInstance());
        }
    }

    private static class SimpleBean {
        private final String name;
        private final Object instance;

        SimpleBean(String name, Object instance) {
            this.name = name;
            this.instance = instance;
        }

        public String getName() {
            return name;
        }

        Object getInstance() {
            return instance;
        }

        private boolean isFilterValidator() {
            return Objects.equals(instance.getClass().getSuperclass(), FilterValidator.class);
        }
    }
}
