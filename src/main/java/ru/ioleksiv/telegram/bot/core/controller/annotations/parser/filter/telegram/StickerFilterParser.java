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

import java.util.Optional;

@Component
public class StickerFilterParser implements FilterParser<StickerFilter, Sticker> {

    @Override
    public Validator<Sticker> createChecker(StickerFilter annotation, Finder finder) {
        UnionExtractValidator<Sticker> unionExtractValidator = new UnionExtractValidator<>();

        MaskPositionFilter maskPosition = annotation.maskPosition();
        if (maskPosition.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getMaskPosition()), finder.find(maskPosition));
        }
        IntegerFilter width = annotation.width();
        if (width.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getWidth()), finder.find(width));
        }
        IntegerFilter height = annotation.height();
        if (height.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getHeight()), finder.find(height));
        }
        PhotoFilter thumb = annotation.thumb();
        if (thumb.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getThumb()), finder.find(thumb));
        }
        StringFilter emoji = annotation.emoji();
        if (emoji.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getEmoji()), finder.find(emoji));
        }
        StringFilter setName = annotation.setName();
        if (setName.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getSetName()), finder.find(setName));
        }
        IntegerFilter fileSize = annotation.fileSize();
        if (fileSize.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getFileSize()), finder.find(fileSize));
        }

        return unionExtractValidator;
    }

    @Override
    public Class<StickerFilter> getAnnotationClass() {
        return StickerFilter.class;
    }

}

