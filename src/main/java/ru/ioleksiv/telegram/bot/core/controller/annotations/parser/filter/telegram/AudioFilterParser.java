package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.telegram;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.AudioFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.PhotoFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.std.files.Audio;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Validator;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator;

import java.util.Optional;

@Component
public class AudioFilterParser implements FilterParser<AudioFilter, Audio> {

    @Override
    public Validator<Audio> createChecker(AudioFilter annotation, Finder finder) {
        UnionExtractValidator<Audio> unionExtractValidator = new UnionExtractValidator<>();

        IntegerFilter duration = annotation.duration();
        if (duration.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getDuration()), finder.find(duration));
        }
        StringFilter performer = annotation.performer();
        if (performer.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getPerformer()), finder.find(performer));
        }
        StringFilter title = annotation.title();
        if (title.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getTitle()), finder.find(title));
        }
        StringFilter mimeType = annotation.mimeType();
        if (mimeType.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getMimeType()), finder.find(mimeType));
        }
        IntegerFilter fileSize = annotation.fileSize();
        if (fileSize.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getFileSize()), finder.find(fileSize));
        }
        PhotoFilter thumb = annotation.thumb();
        if (thumb.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getThumb()), finder.find(thumb));
        }

        return unionExtractValidator;
    }

    @Override
    public Class<AudioFilter> getAnnotationClass() {
        return AudioFilter.class;
    }

}

