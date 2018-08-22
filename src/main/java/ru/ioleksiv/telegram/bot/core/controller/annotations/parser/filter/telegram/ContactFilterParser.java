package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.telegram;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.NotNullFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.ContactFilter;
import ru.ioleksiv.telegram.bot.api.model.annotation.stub.StubCustomValidator;
import ru.ioleksiv.telegram.bot.api.model.objects.std.Contact;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Validator;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator;

import java.util.Objects;
import java.util.Optional;

@Component
public class ContactFilterParser implements FilterParser<ContactFilter, Contact> {

    @Override
    public Validator<Contact> createChecker(ContactFilter annotation, Finder finder) {
        UnionExtractValidator<Contact> unionExtractValidator = new UnionExtractValidator<>();

        Class<? extends Validator>[] validators = annotation.validator();
        for(Class<? extends Validator> validator : validators) {
            if (!Objects.equals(validator, StubCustomValidator.class)) {
                unionExtractValidator.add(Optional::of, finder.find(validator));
            }
        }
        StringFilter phoneNumber = annotation.phoneNumber();
        if (phoneNumber.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getPhoneNumber()), finder.find(phoneNumber));
        }
        StringFilter firstName = annotation.firstName();
        if (firstName.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getFirstName()), finder.find(firstName));
        }
        StringFilter lastName = annotation.lastName();
        if (lastName.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getLastName()), finder.find(lastName));
        }
        StringFilter vCard = annotation.vCard();
        if (vCard.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getvCard()), finder.find(vCard));
        }
        NotNullFilter userId = annotation.userId();
        if (userId.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getUserId()), finder.find(userId));
        }

        return unionExtractValidator;
    }

    @Override
    public Class<ContactFilter> getAnnotationClass() {
        return ContactFilter.class;
    }

}

