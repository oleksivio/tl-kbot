package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.telegram;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.NotNullFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.EncryptedPassportElementFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.PassportFileArrayFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.PassportFileFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.passport.EncryptedPassportElement;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Validator;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.TypeNameValidator;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator;

import java.util.Optional;

@Component
public class EncryptedPassportElementFilterParser
        implements FilterParser<EncryptedPassportElementFilter, EncryptedPassportElement> {

    @Override
    public Validator<EncryptedPassportElement> createChecker(EncryptedPassportElementFilter annotation, Finder finder) {
        UnionExtractValidator<EncryptedPassportElement> unionExtractValidator = new UnionExtractValidator<>();

        EncryptedPassportElement.Type type = annotation.type();
        if (type.isChosen()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getType()), new TypeNameValidator(type));
        }
        NotNullFilter data = annotation.data();
        if (data.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getData()), finder.find(data));
        }
        StringFilter phoneNumber = annotation.phoneNumber();
        if (phoneNumber.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getPhoneNumber()), finder.find(phoneNumber));
        }
        StringFilter email = annotation.email();
        if (email.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getEmail()), finder.find(email));
        }
        PassportFileArrayFilter fileArray = annotation.fileArray();
        if (fileArray.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getFiles()), finder.find(fileArray));
        }
        PassportFileFilter frontSide = annotation.frontSide();
        if (frontSide.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getFrontSide()), finder.find(frontSide));
        }
        PassportFileFilter reverseSide = annotation.reverseSide();
        if (reverseSide.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getReverseSide()), finder.find(reverseSide));
        }
        PassportFileFilter selfie = annotation.selfie();
        if (selfie.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getSelfie()), finder.find(selfie));
        }

        return unionExtractValidator;
    }

    @Override
    public Class<EncryptedPassportElementFilter> getAnnotationClass() {
        return EncryptedPassportElementFilter.class;
    }

}

