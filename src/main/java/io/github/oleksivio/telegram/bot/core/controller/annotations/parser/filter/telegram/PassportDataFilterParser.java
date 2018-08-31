package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.telegram;

import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.EncryptedCredentialsFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.EncryptedPassportElementArrayFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.PassportDataFilter;
import io.github.oleksivio.telegram.bot.api.model.objects.passport.PassportData;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Optional;

@Component
public class PassportDataFilterParser implements FilterParser<PassportDataFilter, PassportData> {

    @Override
    public Validator<PassportData> createChecker(PassportDataFilter annotation, Finder finder) {
        UnionExtractValidator<PassportData> unionExtractValidator = new UnionExtractValidator<>();

        Arrays.stream(annotation.validator())
                .map(validatorName -> finder.find(validatorName, PassportData.class))
                .forEach(validator -> unionExtractValidator.add(Optional::of, validator));

        EncryptedPassportElementArrayFilter encryptedPassportElements = annotation.encryptedPassportElements();
        if (encryptedPassportElements.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getEncryptedPassportElements()),
                                      finder.find(encryptedPassportElements));
        }
        EncryptedCredentialsFilter encryptedCredentials = annotation.encryptedCredentials();
        if (encryptedCredentials.status().isActive()) {
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

