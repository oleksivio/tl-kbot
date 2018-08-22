package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.telegram;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.PhotoFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.VideoFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.std.files.Video;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Validator;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator;

import java.util.Optional;

@Component
public class VideoFilterParser implements FilterParser<VideoFilter, Video> {

    @Override
    public Validator<Video> createChecker(VideoFilter annotation, Finder finder) {
        UnionExtractValidator<Video> unionExtractValidator = new UnionExtractValidator<>();

        IntegerFilter duration = annotation.duration();
        if (duration.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getDuration()), finder.find(duration));
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
        StringFilter mimeType = annotation.mimeType();
        if (mimeType.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getMimeType()), finder.find(mimeType));
        }
        IntegerFilter fileSize = annotation.fileSize();
        if (fileSize.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getFileSize()), finder.find(fileSize));
        }

        return unionExtractValidator;
    }

    @Override
    public Class<VideoFilter> getAnnotationClass() {
        return VideoFilter.class;
    }

}

