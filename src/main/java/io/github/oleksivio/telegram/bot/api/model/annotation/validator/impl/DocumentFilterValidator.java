package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl;

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.CustomValidator;
import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator;
import io.github.oleksivio.telegram.bot.api.model.objects.std.files.Document;

public class DocumentFilterValidator extends FilterValidator<Document> {

    public DocumentFilterValidator(CustomValidator<Document> validator) {
        super(Document.class, validator);
    }
}

