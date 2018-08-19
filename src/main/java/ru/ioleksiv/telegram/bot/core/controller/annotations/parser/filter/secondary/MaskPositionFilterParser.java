package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.secondary;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.MaskPositionFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.std.sticker.MaskPosition;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractChecker;

import java.util.Optional;

@Component
public class MaskPositionFilterParser implements FilterParser<MaskPositionFilter, MaskPosition> {

    @Override
    public Checker<MaskPosition> createChecker(MaskPositionFilter annotation, Finder finder) {
        UnionExtractChecker<MaskPosition> unionExtractChecker = new UnionExtractChecker<>();

        StringFilter point = annotation.point();
        if (point.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getPoint()), finder.find(point));
        }

        return unionExtractChecker;
    }

    @Override
    public Class<MaskPositionFilter> getAnnotationClass() {
        return MaskPositionFilter.class;
    }

}

