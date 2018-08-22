package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.telegram;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.ShippingAddressFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.ShippingQueryFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.UserFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.payments.ShippingQuery;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Validator;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator;

import java.util.Optional;

@Component
public class ShippingQueryFilterParser implements FilterParser<ShippingQueryFilter, ShippingQuery> {

    @Override
    public Validator<ShippingQuery> createChecker(ShippingQueryFilter annotation, Finder finder) {
        UnionExtractValidator<ShippingQuery> unionExtractValidator = new UnionExtractValidator<>();

        UserFilter from = annotation.from();
        if (from.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getFrom()), finder.find(from));
        }
        StringFilter invoicePayload = annotation.invoicePayload();
        if (invoicePayload.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getInvoicePayload()), finder.find(invoicePayload));
        }
        ShippingAddressFilter shippingAddress = annotation.shippingAddress();
        if (shippingAddress.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getShippingAddress()), finder.find(shippingAddress));
        }

        return unionExtractValidator;
    }

    @Override
    public Class<ShippingQueryFilter> getAnnotationClass() {
        return ShippingQueryFilter.class;
    }

}

