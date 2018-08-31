package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.telegram;

import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.PhotoArrayFilter;
import io.github.oleksivio.telegram.bot.api.model.objects.std.files.PhotoSize;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.UnionExtractValidatorList;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component
public class PhotoArrayFilterParser implements FilterParser<PhotoArrayFilter, List<PhotoSize>> {
    @Override
    public Validator<List<PhotoSize>> createChecker(PhotoArrayFilter annotation, Finder finder) {
        UnionExtractValidatorList<PhotoSize> unionExtractValidatorList = new UnionExtractValidatorList<>();

        Arrays.stream(annotation.validator())
                .map(validatorName -> finder.find(validatorName, PhotoSize.class))
                .forEach(validator -> {
                    unionExtractValidatorList.add(Optional::of, validator);
                });

        IntegerFilter width = annotation.width();
        if (width.status().isActive()) {
            unionExtractValidatorList.add(in -> Optional.ofNullable(in.getWidth()), finder.find(width));
        }
        IntegerFilter height = annotation.height();
        if (height.status().isActive()) {
            unionExtractValidatorList.add(in -> Optional.ofNullable(in.getHeight()), finder.find(height));
        }
        IntegerFilter fileSize = annotation.fileSize();
        if (fileSize.status().isActive()) {
            unionExtractValidatorList.add(in -> Optional.ofNullable(in.getFileSize()), finder.find(fileSize));
        }

        return unionExtractValidatorList;
    }

    @Override
    public Class<PhotoArrayFilter> getAnnotationClass() {
        return PhotoArrayFilter.class;
    }
}
