package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.primitive

import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.StringValidator
import org.springframework.stereotype.Component

@Component
class StringFilterParser : FilterParser<StringFilter, String> {

    override val parserAnnotationClass = StringFilter::class

    override fun createChecker(annotation: StringFilter, finder: Finder): Validator<String> {
        return StringValidator(annotation.startWith,
                annotation.equalWith,
                annotation.endWith,
                annotation.contain,
                annotation.regExp,
                annotation.notStartWith,
                annotation.notEndWith,
                annotation.notContain
        )
    }

}
