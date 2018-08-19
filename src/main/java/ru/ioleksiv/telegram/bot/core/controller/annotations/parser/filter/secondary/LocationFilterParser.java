package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.secondary;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.DoubleFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.LocationFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.std.Location;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractChecker;

import java.util.Optional;

@Component
public class LocationFilterParser implements FilterParser<LocationFilter, Location> {

    @Override
    public Checker<Location> createChecker(LocationFilter annotation, Finder finder) {
        UnionExtractChecker<Location> unionExtractChecker = new UnionExtractChecker<>();

        DoubleFilter longitude = annotation.longitude();
        if (longitude.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getLongitude()), finder.find(longitude));
        }
        DoubleFilter latitude = annotation.latitude();
        if (latitude.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getLatitude()), finder.find(latitude));
        }

        return unionExtractChecker;
    }

    @Override
    public Class<LocationFilter> getAnnotationClass() {
        return LocationFilter.class;
    }

}

