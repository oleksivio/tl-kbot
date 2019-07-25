package io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.primitive

import io.github.oleksivio.tl.kbot.core.annotations.filter.primitive.FloatFilter
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.filter.FilterParser
import io.github.oleksivio.tl.kbot.core.controller.annotations.parser.finder.Finder
import io.github.oleksivio.tl.kbot.core.controller.handler.check.Validator
import io.github.oleksivio.tl.kbot.core.controller.handler.check.impl.FloatValidator

class FloatFilterParser :
    FilterParser<FloatFilter, Float> {

    override val parserAnnotationClass = FloatFilter::class

    override fun createChecker(annotation: FloatFilter, finder: Finder): Validator<Float> {
        return FloatValidator(
            annotation.lessThan,
            annotation.lessOrEqual,
            annotation.greatThan,
            annotation.greatOrEqual,
            annotation.equal
        )
    }
}
