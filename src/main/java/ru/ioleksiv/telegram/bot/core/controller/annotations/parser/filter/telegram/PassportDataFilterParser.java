package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.telegram;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.EncryptedCredentialsFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.EncryptedPassportElementArrayFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.PassportDataFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.passport.PassportData;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Validator;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator;

import java.util.Optional;

@Component
public class PassportDataFilterParser implements FilterParser<PassportDataFilter, PassportData> {

    @Override
    public Validator<PassportData> createChecker(PassportDataFilter annotation, Finder finder) {
        UnionExtractValidator<PassportData> unionExtractValidator = new UnionExtractValidator<>();

        EncryptedPassportElementArrayFilter encryptedPassportElements = annotation.encryptedPassportElements();
        if (encryptedPassportElements.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getEncryptedPassportElements()),
                                      finder.find(encryptedPassportElements));
        }
        EncryptedCredentialsFilter encryptedCredentials = annotation.encryptedCredentials();
        if (encryptedCredentials.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getEncryptedCredentials()),
                                      finder.find(encryptedCredentials));
        }

        return unionExtractValidator;
    }

    @Override
    public Class<PassportDataFilter> getAnnotationClass() {
        return PassportDataFilter.class;
    }

}

