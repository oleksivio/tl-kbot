package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.telegram;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.FloatFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.MaskPositionFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.std.sticker.MaskPosition;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Validator;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.TypeNameValidator;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator;

import java.util.Arrays;
import java.util.Optional;

@Component
public class MaskPositionFilterParser implements FilterParser<MaskPositionFilter, MaskPosition> {

    @Override
    public Validator<MaskPosition> createChecker(MaskPositionFilter annotation, Finder finder) {
        UnionExtractValidator<MaskPosition> unionExtractValidator = new UnionExtractValidator<>();

        Arrays.stream(annotation.validator())
                .map(validatorName -> finder.find(validatorName,MaskPosition.class))
                .forEach(validator -> unionExtractValidator.add(Optional::of, validator));

        MaskPosition.Type type = annotation.point();
        if (type.isChosen()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getPoint()), new TypeNameValidator(type));
        }

        FloatFilter xShift = annotation.xShift();
        if (xShift.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getXShift()), finder.find(xShift));
        }
        FloatFilter yShift = annotation.yShift();
        if (yShift.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getYShift()), finder.find(yShift));
        }
        FloatFilter scale = annotation.scale();
        if (scale.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getScale()), finder.find(scale));
        }

        return unionExtractValidator;
    }

    @Override
    public Class<MaskPositionFilter> getAnnotationClass() {
        return MaskPositionFilter.class;
    }

}

