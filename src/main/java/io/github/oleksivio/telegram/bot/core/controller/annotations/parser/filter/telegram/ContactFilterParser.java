package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.telegram;

import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator;
import org.springframework.stereotype.Component;
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.NotNullFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.ContactFilter;
import io.github.oleksivio.telegram.bot.api.model.objects.std.Contact;

import java.util.Arrays;
import java.util.Optional;

@Component
public class ContactFilterParser implements FilterParser<ContactFilter, Contact> {

    @Override
    public Validator<Contact> createChecker(ContactFilter annotation, Finder finder) {
        UnionExtractValidator<Contact> unionExtractValidator = new UnionExtractValidator<>();

        Arrays.stream(annotation.validator())
                .map(validatorName -> finder.find(validatorName, Contact.class))
                .forEach(validator -> unionExtractValidator.add(Optional::of, validator));

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

