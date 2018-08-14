package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.primary;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primary.ShippingQueryFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.ShippingAddressFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.UserFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.payments.ShippingQuery;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractChecker;

import java.util.Optional;

@Component
public class ShippingQueryFilterParser extends FilterParser<ShippingQueryFilter, ShippingQuery> {

    @Override
    public Checker<ShippingQuery> createChecker(ShippingQueryFilter annotation, Finder finder) {
        UnionExtractChecker<ShippingQuery> unionExtractChecker = new UnionExtractChecker<>();

        UserFilter from = annotation.from();
        if (from.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getFrom()), finder.find(from));
        }
        StringFilter invoicePayload = annotation.invoicePayload();
        if (invoicePayload.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getInvoicePayload()), finder.find(invoicePayload));
        }
        ShippingAddressFilter shippingAddress = annotation.shippingAddress();
        if (shippingAddress.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getShippingAddress()), finder.find(shippingAddress));
        }

        return unionExtractChecker;
    }

    @Override
    public Class<ShippingQueryFilter> getAnnotationClass() {
        return ShippingQueryFilter.class;
    }

}

