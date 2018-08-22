package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.telegram;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.PhotoFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.VideoNoteFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.std.files.VideoNote;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Validator;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator;

import java.util.Optional;

@Component
public class VideoNoteFilterParser implements FilterParser<VideoNoteFilter, VideoNote> {

    @Override
    public Validator<VideoNote> createChecker(VideoNoteFilter annotation, Finder finder) {
        UnionExtractValidator<VideoNote> unionExtractValidator = new UnionExtractValidator<>();

        IntegerFilter length = annotation.length();
        if (length.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getLength()), finder.find(length));
        }
        IntegerFilter duration = annotation.duration();
        if (duration.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getDuration()), finder.find(duration));
        }
        PhotoFilter thumb = annotation.thumb();
        if (thumb.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getThumb()), finder.find(thumb));
        }
        IntegerFilter fileSize = annotation.fileSize();
        if (fileSize.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getFileSize()), finder.find(fileSize));
        }

        return unionExtractValidator;
    }

    @Override
    public Class<VideoNoteFilter> getAnnotationClass() {
        return VideoNoteFilter.class;
    }

}

