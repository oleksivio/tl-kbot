package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.secondary;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.MaskPositionFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.PhotoFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.StickerFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.std.sticker.Sticker;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractChecker;

import java.util.Optional;

@Component
public class StickerFilterParser extends FilterParser<StickerFilter, Sticker> {

    @Override
    public Checker<Sticker> createChecker(StickerFilter annotation, Finder finder) {
        UnionExtractChecker<Sticker> unionExtractChecker = new UnionExtractChecker<>();

        MaskPositionFilter maskPosition = annotation.maskPosition();
        if (maskPosition.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getMaskPosition()), finder.find(maskPosition));
        }
        IntegerFilter width = annotation.width();
        if (width.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getWidth()), finder.find(width));
        }
        IntegerFilter height = annotation.height();
        if (height.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getHeight()), finder.find(height));
        }
        PhotoFilter thumb = annotation.thumb();
        if (thumb.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getThumb()), finder.find(thumb));
        }
        StringFilter emoji = annotation.emoji();
        if (emoji.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getEmoji()), finder.find(emoji));
        }
        StringFilter setName = annotation.setName();
        if (setName.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getSetName()), finder.find(setName));
        }
        IntegerFilter fileSize = annotation.fileSize();
        if (fileSize.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getFileSize()), finder.find(fileSize));
        }

        return unionExtractChecker;
    }

    @Override
    public Class<StickerFilter> getAnnotationClass() {
        return StickerFilter.class;
    }

}

