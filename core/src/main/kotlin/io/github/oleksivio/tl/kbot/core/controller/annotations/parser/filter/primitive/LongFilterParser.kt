package io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.primitive

import io.github.oleksivio.tl.kbot.core.annotations.filter.primitive.LongFilter
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.FilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.finder.Finder
import io.github.oleksivio.tl.kbot.core.controller.handler.check.Validator
import io.github.oleksivio.tl.kbot.core.controller.handler.check.impl.LongValidator

class LongFilterParser :
    FilterParser<LongFilter, Long> {

    override val parserAnnotationClass = LongFilter::class

    override fun createChecker(annotation: LongFilter, finder: Finder): Validator<Long> {
        return LongValidator(
            annotation.lessThan,
            annotation.lessOrEqual,
            annotation.greatThan,
            annotation.greatOrEqual
        )
    }
}
