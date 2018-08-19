package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.secondary;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.NotNullFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.EncryptedCredentialsFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.passport.EncryptedCredentials;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractChecker;

import java.util.Optional;

@Component
public class EncryptedCredentialsFilterParser implements FilterParser<EncryptedCredentialsFilter, EncryptedCredentials> {

    @Override
    public Checker<EncryptedCredentials> createChecker(EncryptedCredentialsFilter annotation, Finder finder) {
        UnionExtractChecker<EncryptedCredentials> unionExtractChecker = new UnionExtractChecker<>();

        NotNullFilter data = annotation.data();
        if (data.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getData()), finder.find(data));
        }
        NotNullFilter hash = annotation.hash();
        if (hash.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getHash()), finder.find(hash));
        }
        NotNullFilter secret = annotation.secret();
        if (secret.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getSecret()), finder.find(secret));
        }

        return unionExtractChecker;
    }

    @Override
    public Class<EncryptedCredentialsFilter> getAnnotationClass() {
        return EncryptedCredentialsFilter.class;
    }

}

