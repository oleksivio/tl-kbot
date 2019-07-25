package io.github.oleksivio.tl.kbot.micronaut

import io.github.oleksivio.tl.kbot.core.controller.BotBeanController
import io.github.oleksivio.tl.kbot.core.model.SimpleBean
import io.micronaut.context.ApplicationContext
import org.slf4j.LoggerFactory
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
open class MicronautBotApplicationContext(
    @Inject private val botBeanController: BotBeanController,
    @Inject private val applicationContext: ApplicationContext
) {

    private val LOG = LoggerFactory.getLogger(javaClass)

    fun registerBeans() {

        val simpleBeans = applicationContext.allBeanDefinitions
            .filter { !it.name.startsWith("io.micronaut") }
            .map {
                val instance = applicationContext.getBean(it.beanType)
                SimpleBean(it.name, instance)
            }

        botBeanController.register(simpleBeans)
    }
}
