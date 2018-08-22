package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.telegram;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.AnimationFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.PhotoFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.std.game.Animation;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Validator;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator;

import java.util.Optional;

@Component
public class AnimationFilterParser implements FilterParser<AnimationFilter, Animation> {

    @Override
    public Validator<Animation> createChecker(AnimationFilter annotation, Finder finder) {
        UnionExtractValidator<Animation> unionExtractValidator = new UnionExtractValidator<>();

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

