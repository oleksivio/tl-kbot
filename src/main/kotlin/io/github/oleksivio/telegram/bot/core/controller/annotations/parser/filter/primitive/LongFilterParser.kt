package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.primitive

import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.LongFilter
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.LongValidator
import org.springframework.stereotype.Component

@Component
class LongFilterParser : FilterParser<LongFilter, Long> {

    override val parserAnnotationClass = LongFilter::class

    override fun createChecker(annotation: LongFilter, finder: Finder): Validator<Long> {
        return LongValidator(annotation.lessThan,
                annotation.lessOrEqual,
                annotation.greatThan,
                annotation.greatOrEqual)
    }

}
