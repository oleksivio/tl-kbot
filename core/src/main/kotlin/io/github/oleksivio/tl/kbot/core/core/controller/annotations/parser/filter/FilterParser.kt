package io.github.oleksivio.tl.kbot.core.core.controller.annotations.parser.filter

import io.github.oleksivio.tl.kbot.core.core.controller.annotations.parser.Parser
import io.github.oleksivio.tl.kbot.core.core.controller.annotations.parser.finder.Finder
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.Validator

interface FilterParser<A : Annotation, IN> :
    Parser<A> {

    fun createChecker(annotation: A, finder: Finder): Validator<IN>

}
