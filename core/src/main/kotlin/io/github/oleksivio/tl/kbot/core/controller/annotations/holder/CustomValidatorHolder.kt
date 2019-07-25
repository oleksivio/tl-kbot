package io.github.oleksivio.tl.kbot.core.controller.annotations.holder

import io.github.oleksivio.tl.kbot.core.controller.handler.check.Validator
import io.github.oleksivio.tl.kbot.core.model.annotation.validator.FilterValidator
import io.github.oleksivio.tl.kbot.server.api.model.ITelegram
import java.util.HashMap
import kotlin.reflect.KClass

class CustomValidatorHolder {

    private val filterValidatorMap = HashMap<String, FilterValidator<*>>()

    fun add(beanName: String, filterValidator: FilterValidator<*>) {
        filterValidatorMap[beanName] = filterValidator
    }

    operator fun <T : ITelegram> get(name: String, targetClass: KClass<T>): Validator<T> {
        val filterValidator = filterValidatorMap[name]
            ?: throw RuntimeException("Can't find Filter Validator with '$name'")

        val foundClass = filterValidator.filterTarget
        if (foundClass != targetClass) {
            throw RuntimeException(
                "Filter Validator with '" + name + "' have invalid validation type. " +
                        "Expected validation type is '"
                        + targetClass.simpleName + ".class' found  '"
                        + foundClass.simpleName + ".class' "
            )
        }

        return (filterValidator as FilterValidator<T>).validator
    }
}
