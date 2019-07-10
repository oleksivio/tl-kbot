package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder

import io.github.oleksivio.telegram.bot.core.controller.annotations.holder.CustomValidatorHolder
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator
import io.github.oleksivio.tl.kbot.server.api.model.ITelegram
import org.springframework.stereotype.Controller
import kotlin.reflect.KClass

/**
 * Created by oleksivio on 15.03.19 at 9:44
 * Project: telegram-bot-api
 */
@Controller
class ValidatorFinder(filterParsers: Collection<FilterParser<*, *>>,
                      private val customValidatorHolder: CustomValidatorHolder) : Finder {

    private val annotationParserMap = hashMapOf<KClass<*>, FilterParser<*, *>>()

    init {
        for (filterParser in filterParsers) {
            annotationParserMap[filterParser.parserAnnotationClass] = filterParser
        }
    }

    override fun <SA : Annotation, T> find(annotation: SA): Validator<T> {
        val keyClass = annotation.annotationClass

        if (!annotationParserMap.containsKey(keyClass)) {
            return { true }
        }

        val secondaryFilterParser = annotationParserMap[keyClass] as FilterParser<SA, T>

        return secondaryFilterParser.createChecker(annotation, this)
    }

    override fun <T : ITelegram> find(validatorName: String, targetClass: KClass<T>): Validator<T> {
        return customValidatorHolder[validatorName, targetClass]
    }
}
