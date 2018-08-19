package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.secondary;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.PhotoFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.std.files.PhotoSize;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractChecker;

import java.util.Optional;

@Component
public class PhotoFilterParser implements FilterParser<PhotoFilter, PhotoSize> {

    @Override
    public Checker<PhotoSize> createChecker(PhotoFilter annotation, Finder finder) {
        UnionExtractChecker<PhotoSize> unionExtractChecker = new UnionExtractChecker<>();

        IntegerFilter width = annotation.width();
        if (width.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getWidth()), finder.find(width));
        }
        IntegerFilter height = annotation.height();
        if (height.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getHeight()), finder.find(height));
        }
        IntegerFilter fileSize = annotation.fileSize();
        if (fileSize.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getFileSize()), finder.find(fileSize));
        }

        return unionExtractChecker;
    }

    @Override
    public Class<PhotoFilter> getAnnotationClass() {
        return PhotoFilter.class;
    }

}

