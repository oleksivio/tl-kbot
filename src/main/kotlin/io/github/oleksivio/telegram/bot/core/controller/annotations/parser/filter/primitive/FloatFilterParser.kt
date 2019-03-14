package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.primitive

import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.FloatFilter
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.FloatValidator
import org.springframework.stereotype.Component

@Component
class FloatFilterParser : FilterParser<FloatFilter, Float> {

    override val parserAnnotationClass = FloatFilter::class

    override fun createChecker(annotation: FloatFilter, finder: Finder): Validator<Float> {
        return FloatValidator(annotation.lessThan,
                annotation.lessOrEqual,
                annotation.moreThan,
                annotation.moreOrEqual,
                annotation.equal)
    }

}
