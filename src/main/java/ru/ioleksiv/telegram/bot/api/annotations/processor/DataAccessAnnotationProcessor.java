package ru.ioleksiv.telegram.bot.api.annotations.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;

@Component
public class DataAccessAnnotationProcessor implements BeanPostProcessor {

    private final ConfigurableListableBeanFactory mConfigurableBeanFactory;

    @Autowired
    public DataAccessAnnotationProcessor(ConfigurableListableBeanFactory beanFactory) {
        mConfigurableBeanFactory = beanFactory;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws BeansException {
        addMethods(bean);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {
        return bean;
    }

    private void addMethods(Object bean) {
        Class<?> managedBeanClass = bean.getClass();
        ReflectionUtils.MethodCallback methodCallback = new MessageHandlerMethodCallback(mConfigurableBeanFactory, bean);
        ReflectionUtils.doWithMethods(managedBeanClass, methodCallback);
    }
}
