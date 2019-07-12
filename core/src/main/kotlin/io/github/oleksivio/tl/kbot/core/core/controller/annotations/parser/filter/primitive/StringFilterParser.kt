package io.github.oleksivio.tl.kbot.core.core.controller.annotations.parser.filter.primitive

import io.github.oleksivio.tl.kbot.core.annotations.filter.primitive.StringFilter
import io.github.oleksivio.tl.kbot.core.core.controller.annotations.parser.filter.FilterParser
import io.github.oleksivio.tl.kbot.core.core.controller.annotations.parser.finder.Finder
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.Validator
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.impl.StringValidator
 

class StringFilterParser :
    FilterParser<StringFilter, String> {

    override val parserAnnotationClass = StringFilter::class

    override fun createChecker(annotation: StringFilter, finder: Finder): Validator<String> {
        return StringValidator(
            annotation.startWith,
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
