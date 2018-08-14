package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.secondary;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.AnimationFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.PhotoFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.std.game.Animation;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractChecker;

import java.util.Optional;

@Component
public class AnimationFilterParser extends FilterParser<AnimationFilter, Animation> {

    @Override
    public Checker<Animation> createChecker(AnimationFilter annotation, Finder finder) {
        UnionExtractChecker<Animation> unionExtractChecker = new UnionExtractChecker<>();

        PhotoFilter thumb = annotation.thumb();
        if (thumb.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getThumb()), finder.find(thumb));
        }
        StringFilter fileName = annotation.fileName();
        if (fileName.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getFileName()), finder.find(fileName));
        }
        StringFilter mimeType = annotation.mimeType();
        if (mimeType.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getMimeType()), finder.find(mimeType));
        }
        IntegerFilter fileSize = annotation.fileSize();
        if (fileSize.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getFileSize()), finder.find(fileSize));
        }
        IntegerFilter width = annotation.width();
        if (width.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getWidth()), finder.find(width));
        }
        IntegerFilter height = annotation.height();
        if (height.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getHeight()), finder.find(height));
        }
        IntegerFilter duration = annotation.duration();
        if (duration.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getDuration()), finder.find(duration));
        }

        return unionExtractChecker;
    }

    @Override
    public Class<AnimationFilter> getAnnotationClass() {
        return AnimationFilter.class;
    }

}

