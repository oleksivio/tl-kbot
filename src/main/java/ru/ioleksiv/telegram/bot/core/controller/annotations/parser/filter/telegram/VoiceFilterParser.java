package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.telegram;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.VoiceFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.std.files.Voice;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Validator;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator;

import java.util.Optional;

@Component
public class VoiceFilterParser implements FilterParser<VoiceFilter, Voice> {

    @Override
    public Validator<Voice> createChecker(VoiceFilter annotation, Finder finder) {
        UnionExtractValidator<Voice> unionExtractValidator = new UnionExtractValidator<>();

        IntegerFilter duration = annotation.duration();
        if (duration.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getDuration()), finder.find(duration));
        }
        StringFilter mimeType = annotation.mimeType();
        if (mimeType.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getMimeType()), finder.find(mimeType));
        }
        IntegerFilter fileSize = annotation.fileSize();
        if (fileSize.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getFileSize()), finder.find(fileSize));
        }

        return unionExtractValidator;
    }

    @Override
    public Class<VoiceFilter> getAnnotationClass() {
        return VoiceFilter.class;
    }

}

