package io.github.oleksivio.tl.kbot.core.controller

import io.github.oleksivio.tl.kbot.core.model.SimpleBean
import io.github.oleksivio.tl.kbot.core.model.annotation.validator.FilterValidator

class BotBeanController(private val botContextController: BotContextController) {

    fun register(simpleBeans: List<SimpleBean>) {
        // on first step we add all validators
        simpleBeans.filter { it.isFilterValidator }
            .forEach {
                botContextController.customValidatorHolder.add(it.name, it.instance as FilterValidator<*>)
            }

        // on second step we add all instances
        simpleBeans.forEach {
            botContextController.annotationProcessor.add(it.instance)
        }
    }
}
