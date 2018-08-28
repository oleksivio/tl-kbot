package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.telegram;

import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.PassportFileArrayFilter;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder;
import org.springframework.stereotype.Component;
import io.github.oleksivio.telegram.bot.api.model.objects.passport.PassportFile;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.UnionExtractValidatorList;

import java.util.List;
import java.util.Optional;

@Component
public class PassportFileArrayFilterParser implements FilterParser<PassportFileArrayFilter, List<PassportFile>> {

    @Override
    public Validator<List<PassportFile>> createChecker(PassportFileArrayFilter annotation, Finder finder) {
        UnionExtractValidatorList<PassportFile> unionExtractValidatorList = new UnionExtractValidatorList<>();

        IntegerFilter fileSize = annotation.fileSize();
        if (fileSize.status().isActive()) {
            unionExtractValidatorList.add(in -> Optional.ofNullable(in.getFileSize()), finder.find(fileSize));
        }
        IntegerFilter fileDate = annotation.fileDate();
        if (fileDate.status().isActive()) {
            unionExtractValidatorList.add(in -> Optional.ofNullable(in.getFileDate()), finder.find(fileDate));
        }

        return unionExtractValidatorList;
    }

    @Override
    public Class<PassportFileArrayFilter> getAnnotationClass() {
        return PassportFileArrayFilter.class;
    }

}

