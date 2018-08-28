package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.telegram;

import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.PhotoFilter;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator;
import org.springframework.stereotype.Component;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.VideoNoteFilter;
import io.github.oleksivio.telegram.bot.api.model.objects.std.files.VideoNote;

import java.util.Optional;

@Component
public class VideoNoteFilterParser implements FilterParser<VideoNoteFilter, VideoNote> {

    @Override
    public Validator<VideoNote> createChecker(VideoNoteFilter annotation, Finder finder) {
        UnionExtractValidator<VideoNote> unionExtractValidator = new UnionExtractValidator<>();

        IntegerFilter length = annotation.length();
        if (length.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getLength()), finder.find(length));
        }
        IntegerFilter duration = annotation.duration();
        if (duration.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getDuration()), finder.find(duration));
        }
        PhotoFilter thumb = annotation.thumb();
        if (thumb.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getThumb()), finder.find(thumb));
        }
        IntegerFilter fileSize = annotation.fileSize();
        if (fileSize.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getFileSize()), finder.find(fileSize));
        }

        return unionExtractValidator;
    }

    @Override
    public Class<VideoNoteFilter> getAnnotationClass() {
        return VideoNoteFilter.class;
    }

}

