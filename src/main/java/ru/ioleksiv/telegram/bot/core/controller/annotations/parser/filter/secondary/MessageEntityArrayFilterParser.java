package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.secondary;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.MessageEntityArrayFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.MessageEntityFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.std.MessageEntity;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionChecker;

import java.util.List;

@Component
public class MessageEntityArrayFilterParser extends FilterParser<MessageEntityArrayFilter, List<MessageEntity>> {
    @Override
    public Checker<List<MessageEntity>> createChecker(MessageEntityArrayFilter annotation, Finder finder) {
        UnionChecker<MessageEntity> unionChecker = new UnionChecker<>();

        for (MessageEntityFilter messageEntityFilter : annotation.array()) {
            unionChecker.add(finder.find(messageEntityFilter));
        }

        return unionChecker;
    }

    @Override
    public Class<MessageEntityArrayFilter> getAnnotationClass() {
        return MessageEntityArrayFilter.class;
    }
}
