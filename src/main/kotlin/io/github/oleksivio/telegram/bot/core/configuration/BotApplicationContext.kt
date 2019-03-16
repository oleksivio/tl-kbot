package io.github.oleksivio.telegram.bot.core.configuration

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator
import io.github.oleksivio.telegram.bot.core.controller.annotations.AnnotationProcessor
import io.github.oleksivio.telegram.bot.core.controller.annotations.holder.CustomValidatorHolder
import org.springframework.beans.BeansException
import org.springframework.context.ApplicationContext
import org.springframework.context.ApplicationContextAware
import org.springframework.context.annotation.Configuration
import kotlin.reflect.full.superclasses

/**
 * Created by oleksivio on 13.03.19 at 19:55
 * Project: telegram-bot-api
 */

@Configuration
class BotApplicationContext(private val annotationProcessor: AnnotationProcessor,
                            private val customValidatorHolder: CustomValidatorHolder) : ApplicationContextAware {

    @Throws(BeansException::class)
    override fun setApplicationContext(applicationContext: ApplicationContext) {

        applicationContext.beanDefinitionNames
                .filter { !it.contains("loggingCodecCustomizer") }
                .filter { !it.contains("jacksonCodecCustomizer") }
                .filter { !it.startsWith("org.springframework") }
                .map { SimpleBean(it, applicationContext.getBean(it)) }
                .forEach {
                    if (it.isFilterValidator) {
                        customValidatorHolder.add(it.name, it.instance as FilterValidator<*>)
                    }
                    // TODO check why is not else condition
                    annotationProcessor.add(it.instance)

                }

    }

    private class SimpleBean constructor(val name: String, val instance: Any) {
        val isFilterValidator: Boolean = instance::class.superclasses.any {
            it == FilterValidator::class
        }
    }

}
