package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.telegram;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.InvoiceFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.payments.Invoice;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Validator;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator;

import java.util.Arrays;
import java.util.Optional;

@Component
public class InvoiceFilterParser implements FilterParser<InvoiceFilter, Invoice> {

    @Override
    public Validator<Invoice> createChecker(InvoiceFilter annotation, Finder finder) {
        UnionExtractValidator<Invoice> unionExtractValidator = new UnionExtractValidator<>();

        Arrays.stream(annotation.validator())
                .map(validatorName -> finder.find(validatorName,Invoice.class))
                .forEach(validator -> unionExtractValidator.add(Optional::of, validator));

        StringFilter title = annotation.title();
        if (title.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getTitle()), finder.find(title));
        }
        StringFilter description = annotation.description();
        if (description.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getDescription()), finder.find(description));
        }
        StringFilter startParameter = annotation.startParameter();
        if (startParameter.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getStartParameter()), finder.find(startParameter));
        }
        StringFilter currency = annotation.currency();
        if (currency.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getCurrency()), finder.find(currency));
        }
        IntegerFilter totalAmount = annotation.totalAmount();
        if (totalAmount.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getTotalAmount()), finder.find(totalAmount));
        }

        return unionExtractValidator;
    }

    @Override
    public Class<InvoiceFilter> getAnnotationClass() {
        return InvoiceFilter.class;
    }

}

