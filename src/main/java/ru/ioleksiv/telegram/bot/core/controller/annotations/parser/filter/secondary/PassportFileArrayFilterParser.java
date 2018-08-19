package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.secondary;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.PassportFileArrayFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.passport.PassportFile;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractCheckerList;

import java.util.List;
import java.util.Optional;

@Component
public class PassportFileArrayFilterParser implements FilterParser<PassportFileArrayFilter, List<PassportFile>> {

    @Override
    public Checker<List<PassportFile>> createChecker(PassportFileArrayFilter annotation, Finder finder) {
        UnionExtractCheckerList<PassportFile> unionExtractCheckerList = new UnionExtractCheckerList<>();

        IntegerFilter fileSize = annotation.fileSize();
        if (fileSize.value().isActive()) {
            unionExtractCheckerList.add(in -> Optional.ofNullable(in.getFileSize()), finder.find(fileSize));
        }
        IntegerFilter fileDate = annotation.fileDate();
        if (fileDate.value().isActive()) {
            unionExtractCheckerList.add(in -> Optional.ofNullable(in.getFileDate()), finder.find(fileDate));
        }

        return unionExtractCheckerList;
    }

    @Override
    public Class<PassportFileArrayFilter> getAnnotationClass() {
        return PassportFileArrayFilter.class;
    }

}

