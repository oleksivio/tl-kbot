package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.telegram;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.MaskPositionFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.std.sticker.MaskPosition;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Validator;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator;

import java.util.Optional;

@Component
public class MaskPositionFilterParser implements FilterParser<MaskPositionFilter, MaskPosition> {

    @Override
    public Validator<MaskPosition> createChecker(MaskPositionFilter annotation, Finder finder) {
        UnionExtractValidator<MaskPosition> unionExtractValidator = new UnionExtractValidator<>();

        StringFilter point = annotation.point();
        if (point.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getPoint()), finder.find(point));
        }

        return unionExtractValidator;
    }

    @Override
    public Class<MaskPositionFilter> getAnnotationClass() {
        return MaskPositionFilter.class;
    }

}

