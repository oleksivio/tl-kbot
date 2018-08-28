package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.telegram;

import org.springframework.stereotype.Component;
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.PassportFileFilter;
import io.github.oleksivio.telegram.bot.api.model.objects.passport.PassportFile;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator;

import java.util.Optional;

@Component
public class PassportFileFilterParser implements FilterParser<PassportFileFilter, PassportFile> {

    @Override
    public Validator<PassportFile> createChecker(PassportFileFilter annotation, Finder finder) {
        UnionExtractValidator<PassportFile> unionExtractValidator = new UnionExtractValidator<>();

        IntegerFilter fileSize = annotation.fileSize();
        if (fileSize.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getFileSize()), finder.find(fileSize));
        }
        IntegerFilter fileDate = annotation.fileDate();
        if (fileDate.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getFileDate()), finder.find(fileDate));
        }

        return unionExtractValidator;
    }

    @Override
    public Class<PassportFileFilter> getAnnotationClass() {
        return PassportFileFilter.class;
    }

}

