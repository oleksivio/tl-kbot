package io.github.oleksivio.tl.kbot.spring

import io.github.oleksivio.tl.kbot.core.core.controller.annotations.AnnotationProcessor
import io.github.oleksivio.tl.kbot.core.core.controller.annotations.holder.CustomValidatorHolder
import io.github.oleksivio.tl.kbot.core.model.annotation.validator.FilterValidator
import org.springframework.beans.BeansException
import org.springframework.context.ApplicationContext
import org.springframework.context.ApplicationContextAware
import org.springframework.context.annotation.Configuration

/**
 * Created by oleksivio on 13.03.19 at 19:55
 * Project: telegram-bot-api
 */
@Configuration
class BotApplicationContext(private val annotationProcessor: AnnotationProcessor,
                            private val customValidatorHolder: CustomValidatorHolder
) : ApplicationContextAware {

    @Throws(BeansException::class)
    override fun setApplicationContext(applicationContext: ApplicationContext) {

        val simpleBeans = applicationContext.beanDefinitionNames
                .filter { !it.startsWith("org.springframework") }
                .map {
                    val instance = applicationContext.getBean(it)
                    SimpleBean(it, instance)
                }

        // on first step we add all validators
        simpleBeans.filter { it.isFilterValidator }
                .forEach {
                    customValidatorHolder.add(it.name, it.instance as FilterValidator<*>)
                }

        // on second step we add all instances
        simpleBeans.forEach {
            annotationProcessor.add(it.instance)
        }

    }

    private class SimpleBean constructor(val name: String, val instance: Any) {
        // use java because if we try to get superclasses from java lambda class kotlin reflect throw exception
        val isFilterValidator: Boolean = instance::class.java.superclass == FilterValidator::class.java

    }

}
