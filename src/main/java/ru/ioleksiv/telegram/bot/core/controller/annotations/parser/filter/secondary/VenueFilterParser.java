package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.secondary;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.NotNullFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.LocationFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.VenueFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.std.Venue;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractChecker;

import java.util.Optional;

@Component
public class VenueFilterParser implements FilterParser<VenueFilter, Venue> {

    @Override
    public Checker<Venue> createChecker(VenueFilter annotation, Finder finder) {
        UnionExtractChecker<Venue> unionExtractChecker = new UnionExtractChecker<>();

        LocationFilter location = annotation.location();
        if (location.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getLocation()), finder.find(location));
        }
        StringFilter title = annotation.title();
        if (title.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getTitle()), finder.find(title));
        }
        StringFilter address = annotation.address();
        if (address.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getAddress()), finder.find(address));
        }
        NotNullFilter foursquareId = annotation.foursquareId();
        if (foursquareId.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getFoursquareId()), finder.find(foursquareId));
        }
        StringFilter foursquareType = annotation.foursquareType();
        if (foursquareType.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getFoursquareType()), finder.find(foursquareType));
        }

        return unionExtractChecker;
    }

    @Override
    public Class<VenueFilter> getAnnotationClass() {
        return VenueFilter.class;
    }

}

