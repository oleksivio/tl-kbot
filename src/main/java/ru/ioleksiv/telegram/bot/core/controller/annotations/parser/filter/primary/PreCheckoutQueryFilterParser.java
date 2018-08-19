package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.primary;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primary.PreCheckoutQueryFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.OrderInfoFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.UserFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.payments.PreCheckoutQuery;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractChecker;

import java.util.Optional;

@Component
public class PreCheckoutQueryFilterParser implements FilterParser<PreCheckoutQueryFilter, PreCheckoutQuery> {

    @Override
    public Checker<PreCheckoutQuery> createChecker(PreCheckoutQueryFilter annotation, Finder finder) {
        UnionExtractChecker<PreCheckoutQuery> unionExtractChecker = new UnionExtractChecker<>();

        UserFilter from = annotation.from();
        if (from.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getFrom()), finder.find(from));
        }
        StringFilter currency = annotation.currency();
        if (currency.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getCurrency()), finder.find(currency));
        }
        StringFilter totalAmount = annotation.totalAmount();
        if (totalAmount.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getTotalAmount()), finder.find(totalAmount));
        }
        StringFilter invoicePayload = annotation.invoicePayload();
        if (invoicePayload.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getInvoicePayload()), finder.find(invoicePayload));
        }
        StringFilter shippingOptionId = annotation.shippingOptionId();
        if (shippingOptionId.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getShippingOptionId()), finder.find(shippingOptionId));
        }
        OrderInfoFilter orderInfo = annotation.orderInfo();
        if (orderInfo.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getOrderInfo()), finder.find(orderInfo));
        }

        return unionExtractChecker;
    }

    @Override
    public Class<PreCheckoutQueryFilter> getAnnotationClass() {
        return PreCheckoutQueryFilter.class;
    }

}

