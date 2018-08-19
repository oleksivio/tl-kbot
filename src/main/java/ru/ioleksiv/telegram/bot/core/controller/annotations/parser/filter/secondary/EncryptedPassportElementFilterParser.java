package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.secondary;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.NotNullFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.EncryptedPassportElementFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.PassportFileArrayFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.PassportFileFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.passport.EncryptedPassportElement;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.StringTypeChecker;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractChecker;

import java.util.Optional;

@Component
public class EncryptedPassportElementFilterParser implements FilterParser<EncryptedPassportElementFilter, EncryptedPassportElement> {

    @Override
    public Checker<EncryptedPassportElement> createChecker(EncryptedPassportElementFilter annotation, Finder finder) {
        UnionExtractChecker<EncryptedPassportElement> unionExtractChecker = new UnionExtractChecker<>();

        EncryptedPassportElement.Type type = annotation.type();
        if (type.isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getType()), new StringTypeChecker(type.toString()));
        }
        NotNullFilter data = annotation.data();
        if (data.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getData()), finder.find(data));
        }
        StringFilter phoneNumber = annotation.phoneNumber();
        if (phoneNumber.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getPhoneNumber()), finder.find(phoneNumber));
        }
        StringFilter email = annotation.email();
        if (email.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getEmail()), finder.find(email));
        }
        PassportFileArrayFilter fileArray = annotation.fileArray();
        if (fileArray.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getFiles()), finder.find(fileArray));
        }
        PassportFileFilter frontSide = annotation.frontSide();
        if (frontSide.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getFrontSide()), finder.find(frontSide));
        }
        PassportFileFilter reverseSide = annotation.reverseSide();
        if (reverseSide.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getReverseSide()), finder.find(reverseSide));
        }
        PassportFileFilter selfie = annotation.selfie();
        if (selfie.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getSelfie()), finder.find(selfie));
        }

        return unionExtractChecker;
    }

    @Override
    public Class<EncryptedPassportElementFilter> getAnnotationClass() {
        return EncryptedPassportElementFilter.class;
    }

}

