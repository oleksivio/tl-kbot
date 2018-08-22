package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.telegram;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.PhotoArrayFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.std.files.PhotoSize;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Validator;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractValidatorList;

import java.util.List;
import java.util.Optional;

@Component
public class PhotoArrayFilterParser implements FilterParser<PhotoArrayFilter, List<PhotoSize>> {
    @Override
    public Validator<List<PhotoSize>> createChecker(PhotoArrayFilter annotation, Finder finder) {
        UnionExtractValidatorList<PhotoSize> unionExtractValidatorList = new UnionExtractValidatorList<>();

        IntegerFilter width = annotation.width();
        if (width.value().isActive()) {
            unionExtractValidatorList.add(in -> Optional.ofNullable(in.getWidth()), finder.find(width));
        }
        IntegerFilter height = annotation.height();
        if (height.value().isActive()) {
            unionExtractValidatorList.add(in -> Optional.ofNullable(in.getHeight()), finder.find(height));
        }
        IntegerFilter fileSize = annotation.fileSize();
        if (fileSize.value().isActive()) {
            unionExtractValidatorList.add(in -> Optional.ofNullable(in.getFileSize()), finder.find(fileSize));
        }

        return unionExtractValidatorList;
    }

    @Override
    public Class<PhotoArrayFilter> getAnnotationClass() {
        return PhotoArrayFilter.class;
    }
}
