package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.secondary;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.AudioFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.PhotoFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.std.files.Audio;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractChecker;

import java.util.Optional;

@Component
public class AudioFilterParser extends FilterParser<AudioFilter, Audio> {

    @Override
    public Checker<Audio> createChecker(AudioFilter annotation, Finder finder) {
        UnionExtractChecker<Audio> unionExtractChecker = new UnionExtractChecker<>();

        IntegerFilter duration = annotation.duration();
        if (duration.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getDuration()), finder.find(duration));
        }
        StringFilter performer = annotation.performer();
        if (performer.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getPerformer()), finder.find(performer));
        }
        StringFilter title = annotation.title();
        if (title.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getTitle()), finder.find(title));
        }
        StringFilter mimeType = annotation.mimeType();
        if (mimeType.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getMimeType()), finder.find(mimeType));
        }
        IntegerFilter fileSize = annotation.fileSize();
        if (fileSize.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getFileSize()), finder.find(fileSize));
        }
        PhotoFilter thumb = annotation.thumb();
        if (thumb.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getThumb()), finder.find(thumb));
        }

        return unionExtractChecker;
    }

    @Override
    public Class<AudioFilter> getAnnotationClass() {
        return AudioFilter.class;
    }

}

