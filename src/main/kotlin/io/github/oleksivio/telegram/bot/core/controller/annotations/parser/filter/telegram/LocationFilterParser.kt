package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.telegram

import io.github.oleksivio.telegram.bot.api.annotations.filter.composite.LocationFilter
import io.github.oleksivio.tl.kbot.server.api.objects.std.Location
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator
import org.springframework.stereotype.Component

@Component
class LocationFilterParser : FilterParser<LocationFilter, Location> {

    override val parserAnnotationClass = LocationFilter::class

    override fun createChecker(annotation: LocationFilter, finder: Finder): Validator<Location> {
        val unionExtractValidator = UnionExtractValidator<Location>()

        annotation.validator
                .map { validatorName -> finder.find(validatorName, Location::class) }
                .forEach { validator -> unionExtractValidator.add({ it }, validator) }

        val longitude = annotation.longitude
        if (longitude.status.isActive) {
            unionExtractValidator.add({ it.longitude }, finder.find(longitude))
        }
        val latitude = annotation.latitude
        if (latitude.status.isActive) {
            unionExtractValidator.add({ it.latitude }, finder.find(latitude))
        }

        return unionExtractValidator
    }

}

