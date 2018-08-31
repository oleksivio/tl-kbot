package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.telegram;

import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.AnimationFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.PhotoFilter;
import io.github.oleksivio.telegram.bot.api.model.objects.std.game.Animation;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Optional;

@Component
public class AnimationFilterParser implements FilterParser<AnimationFilter, Animation> {

    @Override
    public Validator<Animation> createChecker(AnimationFilter annotation, Finder finder) {
        UnionExtractValidator<Animation> unionExtractValidator = new UnionExtractValidator<>();

        Arrays.stream(annotation.validator())
                .map(validatorName -> finder.find(validatorName, Animation.class))
                .forEach(validator -> unionExtractValidator.add(Optional::of, validator));

        PhotoFilter thumb = annotation.thumb();
        if (thumb.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getThumb()), finder.find(thumb));
        }
        StringFilter fileName = annotation.fileName();
        if (fileName.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getFileName()), finder.find(fileName));
        }
        StringFilter mimeType = annotation.mimeType();
        if (mimeType.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getMimeType()), finder.find(mimeType));
        }
        IntegerFilter fileSize = annotation.fileSize();
        if (fileSize.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getFileSize()), finder.find(fileSize));
        }
        IntegerFilter width = annotation.width();
        if (width.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getWidth()), finder.find(width));
        }
        IntegerFilter height = annotation.height();
        if (height.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getHeight()), finder.find(height));
        }
        IntegerFilter duration = annotation.duration();
        if (duration.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getDuration()), finder.find(duration));
        }

        return unionExtractValidator;
    }

    @Override
    public Class<AnimationFilter> getAnnotationClass() {
        return AnimationFilter.class;
    }

}

