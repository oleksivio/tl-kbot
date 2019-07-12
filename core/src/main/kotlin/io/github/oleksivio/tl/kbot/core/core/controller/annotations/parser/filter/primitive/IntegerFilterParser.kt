package io.github.oleksivio.tl.kbot.core.core.controller.annotations.parser.filter.primitive

import io.github.oleksivio.tl.kbot.core.annotations.filter.primitive.IntegerFilter
import io.github.oleksivio.tl.kbot.core.core.controller.annotations.parser.filter.FilterParser
import io.github.oleksivio.tl.kbot.core.core.controller.annotations.parser.finder.Finder
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.Validator
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.impl.IntegerValidator
 

class IntegerFilterParser :
    FilterParser<IntegerFilter, Int> {

    override val parserAnnotationClass = IntegerFilter::class

    override fun createChecker(annotation: IntegerFilter, finder: Finder): Validator<Int> {
        return IntegerValidator(
            annotation.lessThan,
            annotation.lessOrEqual,
            annotation.greatThan,
            annotation.greatOrEqual
        )
    }

}
