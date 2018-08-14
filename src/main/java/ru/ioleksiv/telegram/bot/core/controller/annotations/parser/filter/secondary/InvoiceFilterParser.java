package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.secondary;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.InvoiceFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.payments.Invoice;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractChecker;

import java.util.Optional;

@Component
public class InvoiceFilterParser extends FilterParser<InvoiceFilter, Invoice> {

    @Override
    public Checker<Invoice> createChecker(InvoiceFilter annotation, Finder finder) {
        UnionExtractChecker<Invoice> unionExtractChecker = new UnionExtractChecker<>();

        StringFilter title = annotation.title();
        if (title.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getTitle()), finder.find(title));
        }
        StringFilter description = annotation.description();
        if (description.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getDescription()), finder.find(description));
        }
        StringFilter startParameter = annotation.startParameter();
        if (startParameter.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getStartParameter()), finder.find(startParameter));
        }
        StringFilter currency = annotation.currency();
        if (currency.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getCurrency()), finder.find(currency));
        }
        IntegerFilter totalAmount = annotation.totalAmount();
        if (totalAmount.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getTotalAmount()), finder.find(totalAmount));
        }

        return unionExtractChecker;
    }

    @Override
    public Class<InvoiceFilter> getAnnotationClass() {
        return InvoiceFilter.class;
    }

}

