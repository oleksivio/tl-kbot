package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.secondary;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.NotNullFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.OrderInfoFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.SuccessfulPaymentFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.payments.SuccessfulPayment;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractChecker;

import java.util.Optional;

@Component
public class SuccessfulPaymentFilterParser implements FilterParser<SuccessfulPaymentFilter, SuccessfulPayment> {

    @Override
    public Checker<SuccessfulPayment> createChecker(SuccessfulPaymentFilter annotation, Finder finder) {
        UnionExtractChecker<SuccessfulPayment> unionExtractChecker = new UnionExtractChecker<>();

        StringFilter currency = annotation.currency();
        if (currency.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getCurrency()), finder.find(currency));
        }
        IntegerFilter totalAmount = annotation.totalAmount();
        if (totalAmount.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getTotalAmount()), finder.find(totalAmount));
        }
        StringFilter invoicePayload = annotation.invoicePayload();
        if (invoicePayload.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getInvoicePayload()), finder.find(invoicePayload));
        }
        NotNullFilter shippingOptionId = annotation.shippingOptionId();
        if (shippingOptionId.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getShippingOptionId()), finder.find(shippingOptionId));
        }
        OrderInfoFilter orderInfo = annotation.orderInfo();
        if (orderInfo.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getOrderInfo()), finder.find(orderInfo));
        }
        NotNullFilter telegramPaymentChargeId = annotation.telegramPaymentChargeId();
        if (telegramPaymentChargeId.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getTelegramPaymentChargeId()), finder.find(telegramPaymentChargeId));
        }
        NotNullFilter providerPaymentChargeId = annotation.providerPaymentChargeId();
        if (providerPaymentChargeId.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getProviderPaymentChargeId()), finder.find(providerPaymentChargeId));
        }

        return unionExtractChecker;
    }

    @Override
    public Class<SuccessfulPaymentFilter> getAnnotationClass() {
        return SuccessfulPaymentFilter.class;
    }

}

