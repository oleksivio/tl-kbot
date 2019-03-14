package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.primitive

import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.IntegerFilter
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.IntegerValidator
import org.springframework.stereotype.Component

@Component
class IntegerFilterParser : FilterParser<IntegerFilter, Int> {

    override val parserAnnotationClass = IntegerFilter::class

    override fun createChecker(annotation: IntegerFilter, finder: Finder): Validator<Int> {
        return IntegerValidator(annotation.lessThan,
                annotation.lessOrEqual,
                annotation.moreThan,
                annotation.moreOrEqual)
    }

}
