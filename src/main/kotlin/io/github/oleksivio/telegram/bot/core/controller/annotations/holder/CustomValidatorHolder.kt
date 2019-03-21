package io.github.oleksivio.telegram.bot.core.controller.annotations.holder

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.CustomValidator
import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator
import io.github.oleksivio.telegram.bot.core.model.ITelegram
import org.springframework.stereotype.Component
import java.util.*
import kotlin.reflect.KClass

@Component
class CustomValidatorHolder {

    private val filterValidatorMap = HashMap<String, FilterValidator<*>>()

    fun add(beanName: String, filterValidator: FilterValidator<*>) {
        filterValidatorMap[beanName] = filterValidator
    }

    operator fun <T : ITelegram> get(name: String, targetClass: KClass<T>): CustomValidator<T> {
        val filterValidator = filterValidatorMap[name]
                ?: throw RuntimeException("Can't find Filter Validator with '$name'")

        val foundClass = filterValidator.filterTarget
        if (foundClass != targetClass) {
            throw RuntimeException("Filter Validator with '" + name + "' have invalid validation type. " +
                    "Expected validation type is '"
                    + targetClass.simpleName + ".class' found  '"
                    + foundClass.simpleName + ".class' ")
        }

        return (filterValidator as FilterValidator<T>).validator

    }

}
