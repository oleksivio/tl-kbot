package io.github.oleksivio.tl.kbot.core.core.controller.annotations.parser.filter.telegram

import io.github.oleksivio.tl.kbot.core.annotations.filter.composite.InlineQueryFilter
import io.github.oleksivio.tl.kbot.server.api.objects.inline.InlineQuery
import io.github.oleksivio.tl.kbot.core.core.controller.annotations.parser.filter.FilterParser
import io.github.oleksivio.tl.kbot.core.core.controller.annotations.parser.finder.Finder
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.Validator
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.impl.UnionExtractValidator
 

  
class InlineQueryFilterParser :
    FilterParser<InlineQueryFilter, InlineQuery> {

    override val parserAnnotationClass = InlineQueryFilter::class

    override fun createChecker(annotation: InlineQueryFilter, finder: Finder): Validator<InlineQuery> {
        val unionExtractValidator =
            UnionExtractValidator<InlineQuery>()

        annotation.validator
                .map { validatorName -> finder.find(validatorName, InlineQuery::class) }
                .forEach { validator -> unionExtractValidator.add({ it }, validator) }

        val from = annotation.from
        if (from.status.isActive) {
            unionExtractValidator.add({ it.from }, finder.find(from))
        }
        val location = annotation.location
        if (location.status.isActive) {
            unionExtractValidator.add({ it.location }, finder.find(location))
        }
        val query = annotation.query
        if (query.status.isActive) {
            unionExtractValidator.add({ it.query }, finder.find(query))
        }
        val offset = annotation.offset
        if (offset.status.isActive) {
            unionExtractValidator.add({ it.offset }, finder.find(offset))
        }

        return unionExtractValidator
    }

}

