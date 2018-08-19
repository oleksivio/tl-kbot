package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.secondary;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.PhotoArrayFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.std.files.PhotoSize;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractCheckerList;

import java.util.List;
import java.util.Optional;

@Component
public class PhotoArrayFilterParser implements FilterParser<PhotoArrayFilter, List<PhotoSize>> {
    @Override
    public Checker<List<PhotoSize>> createChecker(PhotoArrayFilter annotation, Finder finder) {
        UnionExtractCheckerList<PhotoSize> unionExtractCheckerList = new UnionExtractCheckerList<>();

        IntegerFilter width = annotation.width();
        if (width.value().isActive()) {
            unionExtractCheckerList.add(in -> Optional.ofNullable(in.getWidth()), finder.find(width));
        }
        IntegerFilter height = annotation.height();
        if (height.value().isActive()) {
            unionExtractCheckerList.add(in -> Optional.ofNullable(in.getHeight()), finder.find(height));
        }
        IntegerFilter fileSize = annotation.fileSize();
        if (fileSize.value().isActive()) {
            unionExtractCheckerList.add(in -> Optional.ofNullable(in.getFileSize()), finder.find(fileSize));
        }

        return unionExtractCheckerList;
    }

    @Override
    public Class<PhotoArrayFilter> getAnnotationClass() {
        return PhotoArrayFilter.class;
    }
}
