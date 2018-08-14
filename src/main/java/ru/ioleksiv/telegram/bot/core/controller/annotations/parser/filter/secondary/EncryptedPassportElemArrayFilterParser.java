package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.secondary;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.EncryptedPassportElementArrayFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.EncryptedPassportElementFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.passport.EncryptedPassportElement;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionChecker;

import java.util.List;

@Component
public class EncryptedPassportElemArrayFilterParser extends
        FilterParser<EncryptedPassportElementArrayFilter,
                List<EncryptedPassportElement>> {
    @Override
    public Checker<List<EncryptedPassportElement>> createChecker(EncryptedPassportElementArrayFilter annotation,
                                                                 Finder finder) {
        UnionChecker<EncryptedPassportElement> unionChecker = new UnionChecker<>();

        for (EncryptedPassportElementFilter messageEntityFilter : annotation.array()) {
            unionChecker.add(finder.find(messageEntityFilter));
        }

        return unionChecker;
    }

    @Override
    public Class<EncryptedPassportElementArrayFilter> getAnnotationClass() {
        return EncryptedPassportElementArrayFilter.class;
    }
}
