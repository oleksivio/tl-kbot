package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.secondary;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.PhotoFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.VideoFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.std.files.Video;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractChecker;

import java.util.Optional;

@Component
public class VideoFilterParser implements FilterParser<VideoFilter, Video> {

    @Override
    public Checker<Video> createChecker(VideoFilter annotation, Finder finder) {
        UnionExtractChecker<Video> unionExtractChecker = new UnionExtractChecker<>();

        IntegerFilter duration = annotation.duration();
        if (duration.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getDuration()), finder.find(duration));
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
        StringFilter mimeType = annotation.mimeType();
        if (mimeType.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getMimeType()), finder.find(mimeType));
        }
        IntegerFilter fileSize = annotation.fileSize();
        if (fileSize.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getFileSize()), finder.find(fileSize));
        }

        return unionExtractChecker;
    }

    @Override
    public Class<VideoFilter> getAnnotationClass() {
        return VideoFilter.class;
    }

}

