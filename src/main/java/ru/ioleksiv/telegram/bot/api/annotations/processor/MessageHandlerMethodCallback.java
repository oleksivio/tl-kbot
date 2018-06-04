package ru.ioleksiv.telegram.bot.api.annotations.processor;

import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Method;

import ru.ioleksiv.telegram.bot.api.annotations.MessageHandler;

public class MessageHandlerMethodCallback implements ReflectionUtils.MethodCallback {

    private static final int AUTOWIRE_MODE = AutowireCapableBeanFactory.AUTOWIRE_BY_NAME;


    private ConfigurableListableBeanFactory configurableBeanFactory;
    private Object bean;

    public MessageHandlerMethodCallback(ConfigurableListableBeanFactory bf, Object bean) {
        configurableBeanFactory = bf;
        this.bean = bean;
    }


    private Object getBeanInstance(Class<?> beanClass) {
        Object daoInstance = null;
        if (!configurableBeanFactory.containsBean(beanClass.getCanonicalName())) {
            daoInstance = configurableBeanFactory.createBean(beanClass);
            configurableBeanFactory.autowireBeanProperties(daoInstance, AUTOWIRE_MODE, true);
            configurableBeanFactory.registerSingleton(beanClass.getCanonicalName(), daoInstance);
        } else {
            daoInstance = configurableBeanFactory.getBean(beanClass.getCanonicalName());
        }
        return daoInstance;
    }

    @Override
    public void doWith(Method method) throws IllegalArgumentException{
        if (!method.isAnnotationPresent(MessageHandler.class)) {
            return;
        }

        Class<?> classValue = method.getDeclaringClass();

        Object beanInstance = getBeanInstance(classValue);



    }

}
