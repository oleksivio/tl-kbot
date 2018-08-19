package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.secondary;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.VoiceFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.std.files.Voice;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractChecker;

import java.util.Optional;

@Component
public class VoiceFilterParser implements FilterParser<VoiceFilter, Voice> {

    @Override
    public Checker<Voice> createChecker(VoiceFilter annotation, Finder finder) {
        UnionExtractChecker<Voice> unionExtractChecker = new UnionExtractChecker<>();

        IntegerFilter duration = annotation.duration();
        if (duration.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getDuration()), finder.find(duration));
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
    public Class<VoiceFilter> getAnnotationClass() {
        return VoiceFilter.class;
    }

}

