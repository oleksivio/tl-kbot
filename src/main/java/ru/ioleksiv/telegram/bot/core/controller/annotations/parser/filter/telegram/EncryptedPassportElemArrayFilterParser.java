package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.telegram;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.NotNullFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.EncryptedPassportElementArrayFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.PassportFileArrayFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.PassportFileFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.passport.EncryptedPassportElement;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Validator;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.TypeNameValidator;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractValidatorList;

import java.util.List;
import java.util.Optional;

@Component
public class EncryptedPassportElemArrayFilterParser implements FilterParser<EncryptedPassportElementArrayFilter,
        List<EncryptedPassportElement>> {
    @Override
    public Validator<List<EncryptedPassportElement>> createChecker(EncryptedPassportElementArrayFilter annotation,
                                                                   Finder finder) {
        UnionExtractValidatorList<EncryptedPassportElement> unionExtractValidatorList = new UnionExtractValidatorList<>();

        EncryptedPassportElement.Type type = annotation.type();
        if (type.notAll()) {
            unionExtractValidatorList.add(in -> Optional.ofNullable(in.getType()), new TypeNameValidator(type));
        }
        NotNullFilter data = annotation.data();
        if (data.value().isActive()) {
            unionExtractValidatorList.add(in -> Optional.ofNullable(in.getData()), finder.find(data));
        }
        StringFilter phoneNumber = annotation.phoneNumber();
        if (phoneNumber.value().isActive()) {
            unionExtractValidatorList.add(in -> Optional.ofNullable(in.getPhoneNumber()), finder.find(phoneNumber));
        }
        StringFilter email = annotation.email();
        if (email.value().isActive()) {
            unionExtractValidatorList.add(in -> Optional.ofNullable(in.getEmail()), finder.find(email));
        }
        PassportFileArrayFilter fileArray = annotation.fileArray();
        if (fileArray.value().isActive()) {
            unionExtractValidatorList.add(in -> Optional.ofNullable(in.getFiles()), finder.find(fileArray));
        }
        PassportFileFilter frontSide = annotation.frontSide();
        if (frontSide.value().isActive()) {
            unionExtractValidatorList.add(in -> Optional.ofNullable(in.getFrontSide()), finder.find(frontSide));
        }
        PassportFileFilter reverseSide = annotation.reverseSide();
        if (reverseSide.value().isActive()) {
            unionExtractValidatorList.add(in -> Optional.ofNullable(in.getReverseSide()), finder.find(reverseSide));
        }
        PassportFileFilter selfie = annotation.selfie();
        if (selfie.value().isActive()) {
            unionExtractValidatorList.add(in -> Optional.ofNullable(in.getSelfie()), finder.find(selfie));
        }

        return unionExtractValidatorList;
    }

    @Override
    public Class<EncryptedPassportElementArrayFilter> getAnnotationClass() {
        return EncryptedPassportElementArrayFilter.class;
    }
}
