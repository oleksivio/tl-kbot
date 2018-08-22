package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.telegram;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.NotNullFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.ContactFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.std.Contact;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.ParserUtils;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Validator;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator;

import java.util.Arrays;
import java.util.Optional;

@Component
public class ContactFilterParser implements FilterParser<ContactFilter, Contact> {

    @Override
    public Validator<Contact> createChecker(ContactFilter annotation, Finder finder) {
        UnionExtractValidator<Contact> unionExtractValidator = new UnionExtractValidator<>();

        Arrays.stream(annotation.validator())
                .filter(ParserUtils::isNotStubValidator)
                .map(finder::find)
                .forEach(validator -> {
                    unionExtractValidator.add(Optional::of, validator);
                });

        StringFilter phoneNumber = annotation.phoneNumber();
        if (phoneNumber.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getPhoneNumber()), finder.find(phoneNumber));
        }
        StringFilter firstName = annotation.firstName();
        if (firstName.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getFirstName()), finder.find(firstName));
        }
        StringFilter lastName = annotation.lastName();
        if (lastName.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getLastName()), finder.find(lastName));
        }
        StringFilter vCard = annotation.vCard();
        if (vCard.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getvCard()), finder.find(vCard));
        }
        NotNullFilter userId = annotation.userId();
        if (userId.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getUserId()), finder.find(userId));
        }

        return unionExtractValidator;
    }

    @Override
    public Class<ContactFilter> getAnnotationClass() {
        return ContactFilter.class;
    }

}

