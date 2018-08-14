package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.secondary;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.PhotoArrayFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.PhotoFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.std.files.PhotoSize;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionChecker;

import java.util.List;

@Component
public class PhotoArrayFilterParser extends FilterParser<PhotoArrayFilter, List<PhotoSize>> {
    @Override
    public Checker<List<PhotoSize>> createChecker(PhotoArrayFilter annotation, Finder finder) {
        UnionChecker<PhotoSize> unionChecker = new UnionChecker<>();

        for (PhotoFilter messageEntityFilter : annotation.array()) {
            unionChecker.add(finder.find(messageEntityFilter));
        }

        return unionChecker;
    }

    @Override
    public Class<PhotoArrayFilter> getAnnotationClass() {
        return PhotoArrayFilter.class;
    }
}
