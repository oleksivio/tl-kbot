package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.telegram;

import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.NotNullFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.EncryptedPassportElementArrayFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.PassportFileArrayFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.PassportFileFilter;
import io.github.oleksivio.telegram.bot.api.model.objects.passport.EncryptedPassportElement;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.TypeNameValidator;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.UnionExtractValidatorList;
import org.springframework.stereotype.Component;

import java.util.Arrays;
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
        if (type.isChosen()) {
            unionExtractValidatorList.add(in -> Optional.ofNullable(in.getType()), new TypeNameValidator(type));
        }

        Arrays.stream(annotation.validator())
                .map(validatorName -> finder.find(validatorName, EncryptedPassportElement.class))
                .forEach(validator -> unionExtractValidatorList.add(Optional::of, validator));

        NotNullFilter data = annotation.data();
        if (data.status().isActive()) {
            unionExtractValidatorList.add(in -> Optional.ofNullable(in.getData()), finder.find(data));
        }
        StringFilter phoneNumber = annotation.phoneNumber();
        if (phoneNumber.status().isActive()) {
            unionExtractValidatorList.add(in -> Optional.ofNullable(in.getPhoneNumber()), finder.find(phoneNumber));
        }
        StringFilter email = annotation.email();
        if (email.status().isActive()) {
            unionExtractValidatorList.add(in -> Optional.ofNullable(in.getEmail()), finder.find(email));
        }
        PassportFileArrayFilter fileArray = annotation.fileArray();
        if (fileArray.status().isActive()) {
            unionExtractValidatorList.add(in -> Optional.ofNullable(in.getFiles()), finder.find(fileArray));
        }
        PassportFileFilter frontSide = annotation.frontSide();
        if (frontSide.status().isActive()) {
            unionExtractValidatorList.add(in -> Optional.ofNullable(in.getFrontSide()), finder.find(frontSide));
        }
        PassportFileFilter reverseSide = annotation.reverseSide();
        if (reverseSide.status().isActive()) {
            unionExtractValidatorList.add(in -> Optional.ofNullable(in.getReverseSide()), finder.find(reverseSide));
        }
        PassportFileFilter selfie = annotation.selfie();
        if (selfie.status().isActive()) {
            unionExtractValidatorList.add(in -> Optional.ofNullable(in.getSelfie()), finder.find(selfie));
        }

        return unionExtractValidatorList;
    }

    @Override
    public Class<EncryptedPassportElementArrayFilter> getAnnotationClass() {
        return EncryptedPassportElementArrayFilter.class;
    }
}
