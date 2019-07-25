package io.github.oleksivio.tl.kbot.spring

import io.github.oleksivio.tl.kbot.core.controller.BotBeanController
import io.github.oleksivio.tl.kbot.core.model.SimpleBean
import org.springframework.beans.BeansException
import org.springframework.context.ApplicationContext
import org.springframework.context.ApplicationContextAware
import org.springframework.context.annotation.Configuration

/**
 * Created by oleksivio on 13.03.19 at 19:55
 * Project: telegram-bot-api
 */
@Configuration
class SpringBotApplicationContext(
    private val botBeanController: BotBeanController
) : ApplicationContextAware {

    @Throws(BeansException::class)
    override fun setApplicationContext(applicationContext: ApplicationContext) {

        val simpleBeans = applicationContext.beanDefinitionNames
            .filter { !it.startsWith("org.springframework") }
            .map {
                val instance = applicationContext.getBean(it)
                SimpleBean(it, instance)
            }


        botBeanController.register(simpleBeans)
    }
}
