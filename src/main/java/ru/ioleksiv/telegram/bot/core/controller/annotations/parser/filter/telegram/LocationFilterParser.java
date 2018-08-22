package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.telegram;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.DoubleFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.LocationFilter;
import ru.ioleksiv.telegram.bot.api.model.annotation.stub.StubCustomValidator;
import ru.ioleksiv.telegram.bot.api.model.objects.std.Location;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Validator;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator;

import java.util.Objects;
import java.util.Optional;

@Component
public class LocationFilterParser implements FilterParser<LocationFilter, Location> {

    @Override
    public Validator<Location> createChecker(LocationFilter annotation, Finder finder) {
        UnionExtractValidator<Location> unionExtractValidator = new UnionExtractValidator<>();

        Class<? extends Validator>[] validators = annotation.validator();
        for(Class<? extends Validator> validator : validators) {
            if (!Objects.equals(validator, StubCustomValidator.class)) {
                unionExtractValidator.add(Optional::of, finder.find(validator));
            }
        }
        DoubleFilter longitude = annotation.longitude();
        if (longitude.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getLongitude()), finder.find(longitude));
        }
        DoubleFilter latitude = annotation.latitude();
        if (latitude.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getLatitude()), finder.find(latitude));
        }

        return unionExtractValidator;
    }

    @Override
    public Class<LocationFilter> getAnnotationClass() {
        return LocationFilter.class;
    }

}

