package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.secondary;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.PhotoFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.VideoNoteFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.std.files.VideoNote;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractChecker;

import java.util.Optional;

@Component
public class VideoNoteFilterParser extends FilterParser<VideoNoteFilter, VideoNote> {

    @Override
    public Checker<VideoNote> createChecker(VideoNoteFilter annotation, Finder finder) {
        UnionExtractChecker<VideoNote> unionExtractChecker = new UnionExtractChecker<>();

        IntegerFilter length = annotation.length();
        if (length.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getLength()), finder.find(length));
        }
        IntegerFilter duration = annotation.duration();
        if (duration.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getDuration()), finder.find(duration));
        }
        PhotoFilter thumb = annotation.thumb();
        if (thumb.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getThumb()), finder.find(thumb));
        }
        IntegerFilter fileSize = annotation.fileSize();
        if (fileSize.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getFileSize()), finder.find(fileSize));
        }

        return unionExtractChecker;
    }

    @Override
    public Class<VideoNoteFilter> getAnnotationClass() {
        return VideoNoteFilter.class;
    }

}

