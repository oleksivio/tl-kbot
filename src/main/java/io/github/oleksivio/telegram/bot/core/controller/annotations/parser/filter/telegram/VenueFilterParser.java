package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.telegram;

import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.NotNullFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.LocationFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.VenueFilter;
import io.github.oleksivio.telegram.bot.api.model.objects.std.Venue;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Optional;

@Component
public class VenueFilterParser implements FilterParser<VenueFilter, Venue> {

    @Override
    public Validator<Venue> createChecker(VenueFilter annotation, Finder finder) {
        UnionExtractValidator<Venue> unionExtractValidator = new UnionExtractValidator<>();

        Arrays.stream(annotation.validator())
                .map(validatorName -> finder.find(validatorName, Venue.class))
                .forEach(validator -> unionExtractValidator.add(Optional::of, validator));

        LocationFilter location = annotation.location();
        if (location.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getLocation()), finder.find(location));
        }
        StringFilter title = annotation.title();
        if (title.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getTitle()), finder.find(title));
        }
        StringFilter address = annotation.address();
        if (address.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getAddress()), finder.find(address));
        }
        NotNullFilter foursquareId = annotation.foursquareId();
        if (foursquareId.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getFoursquareId()), finder.find(foursquareId));
        }
        StringFilter foursquareType = annotation.foursquareType();
        if (foursquareType.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getFoursquareType()), finder.find(foursquareType));
        }

        return unionExtractValidator;
    }

    @Override
    public Class<VenueFilter> getAnnotationClass() {
        return VenueFilter.class;
    }

}

