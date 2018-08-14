package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.secondary;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.EncryptedCredentialsFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.EncryptedPassportElementArrayFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.PassportDataFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.passport.PassportData;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractChecker;

import java.util.Optional;

@Component
public class PassportDataFilterParser extends FilterParser<PassportDataFilter, PassportData> {

    @Override
    public Checker<PassportData> createChecker(PassportDataFilter annotation, Finder finder) {
        UnionExtractChecker<PassportData> unionExtractChecker = new UnionExtractChecker<>();

        EncryptedPassportElementArrayFilter encryptedPassportElements = annotation.encryptedPassportElements();
        if (encryptedPassportElements.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getEncryptedPassportElements()), finder.find(encryptedPassportElements));
        }
        EncryptedCredentialsFilter encryptedCredentials = annotation.encryptedCredentials();
        if (encryptedCredentials.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getEncryptedCredentials()), finder.find(encryptedCredentials));
        }

        return unionExtractChecker;
    }

    @Override
    public Class<PassportDataFilter> getAnnotationClass() {
        return PassportDataFilter.class;
    }

}

