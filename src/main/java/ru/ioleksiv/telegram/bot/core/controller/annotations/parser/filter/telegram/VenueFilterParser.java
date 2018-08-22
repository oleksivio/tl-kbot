package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.telegram;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.NotNullFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.LocationFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.VenueFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.std.Venue;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Validator;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator;

import java.util.Optional;

@Component
public class VenueFilterParser implements FilterParser<VenueFilter, Venue> {

    @Override
    public Validator<Venue> createChecker(VenueFilter annotation, Finder finder) {
        UnionExtractValidator<Venue> unionExtractValidator = new UnionExtractValidator<>();

        LocationFilter location = annotation.location();
        if (location.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getLocation()), finder.find(location));
        }
        StringFilter title = annotation.title();
        if (title.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getTitle()), finder.find(title));
        }
        StringFilter address = annotation.address();
        if (address.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getAddress()), finder.find(address));
        }
        NotNullFilter foursquareId = annotation.foursquareId();
        if (foursquareId.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getFoursquareId()), finder.find(foursquareId));
        }
        StringFilter foursquareType = annotation.foursquareType();
        if (foursquareType.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getFoursquareType()), finder.find(foursquareType));
        }

        return unionExtractValidator;
    }

    @Override
    public Class<VenueFilter> getAnnotationClass() {
        return VenueFilter.class;
    }

}

