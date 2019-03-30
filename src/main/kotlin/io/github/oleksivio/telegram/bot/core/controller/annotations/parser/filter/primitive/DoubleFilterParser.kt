package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.primitive

import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.DoubleFilter
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.DoubleValidator
import org.springframework.stereotype.Component

@Component
class DoubleFilterParser : FilterParser<DoubleFilter, Double> {

    override val parserAnnotationClass = DoubleFilter::class

    override fun createChecker(annotation: DoubleFilter, finder: Finder): Validator<Double> {
        return DoubleValidator(annotation.lessThan,
                annotation.lessOrEqual,
                annotation.greatThan,
                annotation.greatOrEqual,
                annotation.equal)
    }

}
