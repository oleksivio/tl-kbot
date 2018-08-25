package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.telegram;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.MaskPositionFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.PhotoFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.StickerFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.std.sticker.Sticker;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Validator;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator;

import java.util.Arrays;
import java.util.Optional;

@Component
public class StickerFilterParser implements FilterParser<StickerFilter, Sticker> {

    @Override
    public Validator<Sticker> createChecker(StickerFilter annotation, Finder finder) {
        UnionExtractValidator<Sticker> unionExtractValidator = new UnionExtractValidator<>();

        Arrays.stream(annotation.validator())
                .map(validatorName -> finder.find(validatorName,Sticker.class))
                .forEach(validator -> unionExtractValidator.add(Optional::of, validator));

        MaskPositionFilter maskPosition = annotation.maskPosition();
        if (maskPosition.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getMaskPosition()), finder.find(maskPosition));
        }
        IntegerFilter width = annotation.width();
        if (width.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getWidth()), finder.find(width));
        }
        IntegerFilter height = annotation.height();
        if (height.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getHeight()), finder.find(height));
        }
        PhotoFilter thumb = annotation.thumb();
        if (thumb.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getThumb()), finder.find(thumb));
        }
        StringFilter emoji = annotation.emoji();
        if (emoji.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getEmoji()), finder.find(emoji));
        }
        StringFilter setName = annotation.setName();
        if (setName.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getSetName()), finder.find(setName));
        }
        IntegerFilter fileSize = annotation.fileSize();
        if (fileSize.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getFileSize()), finder.find(fileSize));
        }

        return unionExtractValidator;
    }

    @Override
    public Class<StickerFilter> getAnnotationClass() {
        return StickerFilter.class;
    }

}

