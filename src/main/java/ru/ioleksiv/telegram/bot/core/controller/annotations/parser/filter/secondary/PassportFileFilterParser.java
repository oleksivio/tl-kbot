package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.secondary;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.PassportFileFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.passport.PassportFile;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractChecker;

import java.util.Optional;

@Component
public class PassportFileFilterParser extends FilterParser<PassportFileFilter, PassportFile> {

    @Override
    public Checker<PassportFile> createChecker(PassportFileFilter annotation, Finder finder) {
        UnionExtractChecker<PassportFile> unionExtractChecker = new UnionExtractChecker<>();

        IntegerFilter fileSize = annotation.fileSize();
        if (fileSize.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getFileSize()), finder.find(fileSize));
        }
        IntegerFilter fileDate = annotation.fileDate();
        if (fileDate.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getFileDate()), finder.find(fileDate));
        }

        return unionExtractChecker;
    }

    @Override
    public Class<PassportFileFilter> getAnnotationClass() {
        return PassportFileFilter.class;
    }

}

