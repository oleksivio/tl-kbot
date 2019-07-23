package io.github.oleksivio.tl.kbot.micronaut

import io.micronaut.runtime.event.annotation.EventListener
import io.micronaut.runtime.server.event.ServerStartupEvent
import org.slf4j.LoggerFactory
import javax.inject.Inject
import javax.inject.Singleton
import kotlin.system.measureTimeMillis

@Singleton
open class StartupListener(@Inject val micronautBotApplicationContext: MicronautBotApplicationContext) {

    private val LOG = LoggerFactory.getLogger(javaClass)

    @EventListener
    open fun onStartup(event: ServerStartupEvent) {
        LOG.info("Start registering telegram bot beans")
        val registerTime = measureTimeMillis { micronautBotApplicationContext.registerBeans() }
        LOG.info("Finish registering telegram bot beans in {}", registerTime)
    }
}
