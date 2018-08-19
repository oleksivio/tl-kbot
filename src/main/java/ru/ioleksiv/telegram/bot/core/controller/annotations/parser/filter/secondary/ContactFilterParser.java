package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.secondary;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.NotNullFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.ContactFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.std.Contact;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractChecker;

import java.util.Optional;

@Component
public class ContactFilterParser implements FilterParser<ContactFilter, Contact> {

    @Override
    public Checker<Contact> createChecker(ContactFilter annotation, Finder finder) {
        UnionExtractChecker<Contact> unionExtractChecker = new UnionExtractChecker<>();

        StringFilter phoneNumber = annotation.phoneNumber();
        if (phoneNumber.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getPhoneNumber()), finder.find(phoneNumber));
        }
        StringFilter firstName = annotation.firstName();
        if (firstName.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getFirstName()), finder.find(firstName));
        }
        StringFilter lastName = annotation.lastName();
        if (lastName.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getLastName()), finder.find(lastName));
        }
        StringFilter vCard = annotation.vCard();
        if (vCard.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getvCard()), finder.find(vCard));
        }
        NotNullFilter userId = annotation.userId();
        if (userId.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getUserId()), finder.find(userId));
        }

        return unionExtractChecker;
    }

    @Override
    public Class<ContactFilter> getAnnotationClass() {
        return ContactFilter.class;
    }

}

