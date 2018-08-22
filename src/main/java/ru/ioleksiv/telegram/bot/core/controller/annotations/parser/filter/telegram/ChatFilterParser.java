package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.telegram;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.BooleanFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.ChatFilter;
import ru.ioleksiv.telegram.bot.api.model.annotation.stub.StubCustomValidator;
import ru.ioleksiv.telegram.bot.api.model.objects.std.Chat;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Validator;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.TypeNameValidator;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator;

import java.util.Objects;
import java.util.Optional;

@Component
public class ChatFilterParser implements FilterParser<ChatFilter, Chat> {

    @Override
    public Validator<Chat> createChecker(ChatFilter annotation,
                                         Finder finder) {
        UnionExtractValidator<Chat> unionExtractValidator = new UnionExtractValidator<>();

        Chat.Type type = annotation.type();
        if (type.notAll()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getType()), new TypeNameValidator(type));
        }
        Class<? extends Validator>[] validators = annotation.validator();
        for(Class<? extends Validator> validator : validators) {
            if (!Objects.equals(validator, StubCustomValidator.class)) {
                unionExtractValidator.add(Optional::of, finder.find(validator));
            }
        }
        StringFilter title = annotation.
                title();
        if (title.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getTitle()), finder.find(title));
        }
        StringFilter username = annotation.username();
        if (username.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getUsername()), finder.find(username));
        }
        StringFilter firstName = annotation.firstName();
        if (firstName.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getFirstName()), finder.find(firstName));
        }
        StringFilter lastName = annotation.lastName();
        if (lastName.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getLastName()), finder.find(lastName));
        }
        BooleanFilter allMembersAreAdministrators = annotation.allMembersAreAdministrators();
        if (allMembersAreAdministrators.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getAllMembersAreAdmin()),
                                      finder.find(allMembersAreAdministrators));
        }

        return unionExtractValidator;
    }

    @Override
    public Class<ChatFilter> getAnnotationClass() {
        return ChatFilter.class;
    }

}

