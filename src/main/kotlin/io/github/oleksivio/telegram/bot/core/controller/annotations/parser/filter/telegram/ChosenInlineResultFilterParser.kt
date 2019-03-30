package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.telegram

import io.github.oleksivio.telegram.bot.api.annotations.filter.composite.ChosenInlineResultFilter
import io.github.oleksivio.telegram.bot.api.model.objects.inline.ChosenInlineResult
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator
import org.springframework.stereotype.Component

@Component
class ChosenInlineResultFilterParser : FilterParser<ChosenInlineResultFilter, ChosenInlineResult> {

    override val parserAnnotationClass = ChosenInlineResultFilter::class

    override fun createChecker(annotation: ChosenInlineResultFilter, finder: Finder): Validator<ChosenInlineResult> {
        val unionExtractValidator = UnionExtractValidator<ChosenInlineResult>()

        annotation.validator
                .map { validatorName -> finder.find(validatorName, ChosenInlineResult::class) }
                .forEach { validator -> unionExtractValidator.add({ it }, validator) }

        val from = annotation.from
        if (from.status.isActive) {
            unionExtractValidator.add({ it.from }, finder.find(from))
        }
        val location = annotation.location
        if (location.status.isActive) {
            unionExtractValidator.add({ it.location }, finder.find(location))
        }
        val inlineMessageId = annotation.inlineMessageId
        if (inlineMessageId.status.isActive) {
            unionExtractValidator.add({ it.inlineMessageId }, finder.find(inlineMessageId))
        }
        val query = annotation.query
        if (query.status.isActive) {
            unionExtractValidator.add({ it.query }, finder.find(query))
        }

        return unionExtractValidator
    }

}

