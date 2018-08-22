package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.telegram;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.DocumentFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.PhotoFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.std.files.Document;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Validator;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator;

import java.util.Optional;

@Component
public class DocumentFilterParser implements FilterParser<DocumentFilter, Document> {

    @Override
    public Validator<Document> createChecker(DocumentFilter annotation, Finder finder) {
        UnionExtractValidator<Document> unionExtractValidator = new UnionExtractValidator<>();

        PhotoFilter thumb = annotation.thumb();
        if (thumb.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getThumb()), finder.find(thumb));
        }
        StringFilter fileName = annotation.fileName();
        if (fileName.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getFileName()), finder.find(fileName));
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
    public Class<DocumentFilter> getAnnotationClass() {
        return DocumentFilter.class;
    }

}

