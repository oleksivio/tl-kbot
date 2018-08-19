package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.secondary;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.BooleanFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.ChatFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.std.Chat;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.StringTypeChecker;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractChecker;

import java.util.Optional;

@Component
public class ChatFilterParser implements FilterParser<ChatFilter, Chat> {

    @Override
    public Checker<Chat> createChecker(ChatFilter annotation, Finder finder) {
        UnionExtractChecker<Chat> unionExtractChecker = new UnionExtractChecker<>();

        Chat.Type type = annotation.type();
        if (type.isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getType()), new StringTypeChecker(type.toString()));
        }
        StringFilter title = annotation.title();
        if (title.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getTitle()), finder.find(title));
        }
        StringFilter username = annotation.username();
        if (username.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getUsername()), finder.find(username));
        }
        StringFilter firstName = annotation.firstName();
        if (firstName.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getFirstName()), finder.find(firstName));
        }
        StringFilter lastName = annotation.lastName();
        if (lastName.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getLastName()), finder.find(lastName));
        }
        BooleanFilter allMembersAreAdministrators = annotation.allMembersAreAdministrators();
        if (allMembersAreAdministrators.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getAllMembersAreAdmin()),
                                    finder.find(allMembersAreAdministrators));
        }

        return unionExtractChecker;
    }

    @Override
    public Class<ChatFilter> getAnnotationClass() {
        return ChatFilter.class;
    }

}

