package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.telegram;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.NotNullFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.EncryptedCredentialsFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.passport.EncryptedCredentials;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Validator;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator;

import java.util.Optional;

@Component
public class EncryptedCredentialsFilterParser implements
        FilterParser<EncryptedCredentialsFilter, EncryptedCredentials> {

    @Override
    public Validator<EncryptedCredentials> createChecker(EncryptedCredentialsFilter annotation, Finder finder) {
        UnionExtractValidator<EncryptedCredentials> unionExtractValidator = new UnionExtractValidator<>();

        NotNullFilter data = annotation.data();
        if (data.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getData()), finder.find(data));
        }
        NotNullFilter hash = annotation.hash();
        if (hash.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getHash()), finder.find(hash));
        }
        NotNullFilter secret = annotation.secret();
        if (secret.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getSecret()), finder.find(secret));
        }

        return unionExtractValidator;
    }

    @Override
    public Class<EncryptedCredentialsFilter> getAnnotationClass() {
        return EncryptedCredentialsFilter.class;
    }

}

