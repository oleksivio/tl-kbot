package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.telegram;

import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.DoubleFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.LocationFilter;
import io.github.oleksivio.telegram.bot.api.model.objects.std.Location;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Optional;

@Component
public class LocationFilterParser implements FilterParser<LocationFilter, Location> {

    @Override
    public Validator<Location> createChecker(LocationFilter annotation, Finder finder) {
        UnionExtractValidator<Location> unionExtractValidator = new UnionExtractValidator<>();

        Arrays.stream(annotation.validator())
                .map(validatorName -> finder.find(validatorName, Location.class))
                .forEach(validator -> unionExtractValidator.add(Optional::of, validator));

        DoubleFilter longitude = annotation.longitude();
        if (longitude.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getLongitude()), finder.find(longitude));
        }
        DoubleFilter latitude = annotation.latitude();
        if (latitude.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getLatitude()), finder.find(latitude));
        }

        return unionExtractValidator;
    }

    @Override
    public Class<LocationFilter> getAnnotationClass() {
        return LocationFilter.class;
    }

}

