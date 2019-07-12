package io.github.oleksivio.tl.kbot.core.core.controller.annotations.parser.filter.telegram

import io.github.oleksivio.tl.kbot.core.annotations.filter.composite.VenueFilter
import io.github.oleksivio.tl.kbot.server.api.objects.std.Venue
import io.github.oleksivio.tl.kbot.core.core.controller.annotations.parser.filter.FilterParser
import io.github.oleksivio.tl.kbot.core.core.controller.annotations.parser.finder.Finder
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.Validator
import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.impl.UnionExtractValidator
 

  
class VenueFilterParser :
    FilterParser<VenueFilter, Venue> {

    override val parserAnnotationClass = VenueFilter::class

    override fun createChecker(annotation: VenueFilter, finder: Finder): Validator<Venue> {
        val unionExtractValidator =
            UnionExtractValidator<Venue>()

        annotation.validator
                .map { validatorName -> finder.find(validatorName, Venue::class) }
                .forEach { validator -> unionExtractValidator.add({ it }, validator) }

        val location = annotation.location
        if (location.status.isActive) {
            unionExtractValidator.add({ it.location }, finder.find(location))
        }
        val title = annotation.title
        if (title.status.isActive) {
            unionExtractValidator.add({ it.title }, finder.find(title))
        }
        val address = annotation.address
        if (address.status.isActive) {
            unionExtractValidator.add({ it.address }, finder.find(address))
        }
        val foursquareId = annotation.foursquareId
        if (foursquareId.status.isActive) {
            unionExtractValidator.add({ it.foursquareId }, finder.find(foursquareId))
        }
        val foursquareType = annotation.foursquareType
        if (foursquareType.status.isActive) {
            unionExtractValidator.add({ it.foursquareType }, finder.find(foursquareType))
        }

        return unionExtractValidator
    }

}

