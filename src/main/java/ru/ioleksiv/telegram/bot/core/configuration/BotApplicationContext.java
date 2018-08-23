package ru.ioleksiv.telegram.bot.core.configuration;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;
import ru.ioleksiv.telegram.bot.api.model.annotation.CustomValidator;
import ru.ioleksiv.telegram.bot.core.controller.annotations.AnnotationProcessor;
import ru.ioleksiv.telegram.bot.core.controller.annotations.holder.CustomValidatorHolder;

import java.lang.reflect.Type;

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

        for (String beanName : applicationContext.getBeanDefinitionNames()) {
            Object obj = applicationContext.getBean(beanName);
            if (isCustomValidator(obj)) {
                customValidatorHolder.add(beanName, (CustomValidator) obj);
            }
            annotationProcessor.add(obj);
        }
    }

    private static boolean isCustomValidator(Object obj) {
        Type[] genericInterfaces = obj.getClass().getGenericInterfaces();
        for (Type type : genericInterfaces) {
            if (type.getTypeName().startsWith(CustomValidator.class.getName())) {
                return true;
            }
        }

        return false;

    }
}
