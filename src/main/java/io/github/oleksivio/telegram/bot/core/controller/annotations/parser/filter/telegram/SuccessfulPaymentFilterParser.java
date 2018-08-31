package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.telegram;

import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.IntegerFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.NotNullFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.OrderInfoFilter;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.SuccessfulPaymentFilter;
import io.github.oleksivio.telegram.bot.api.model.objects.payments.SuccessfulPayment;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Optional;

@Component
public class SuccessfulPaymentFilterParser implements FilterParser<SuccessfulPaymentFilter, SuccessfulPayment> {

    @Override
    public Validator<SuccessfulPayment> createChecker(SuccessfulPaymentFilter annotation, Finder finder) {
        UnionExtractValidator<SuccessfulPayment> unionExtractValidator = new UnionExtractValidator<>();

        Arrays.stream(annotation.validator())
                .map(validatorName -> finder.find(validatorName, SuccessfulPayment.class))
                .forEach(validator -> unionExtractValidator.add(Optional::of, validator));

        StringFilter currency = annotation.currency();
        if (currency.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getCurrency()), finder.find(currency));
        }
        IntegerFilter totalAmount = annotation.totalAmount();
        if (totalAmount.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getTotalAmount()), finder.find(totalAmount));
        }
        StringFilter invoicePayload = annotation.invoicePayload();
        if (invoicePayload.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getInvoicePayload()), finder.find(invoicePayload));
        }
        NotNullFilter shippingOptionId = annotation.shippingOptionId();
        if (shippingOptionId.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getShippingOptionId()), finder.find(shippingOptionId));
        }
        OrderInfoFilter orderInfo = annotation.orderInfo();
        if (orderInfo.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getOrderInfo()), finder.find(orderInfo));
        }
        NotNullFilter telegramPaymentChargeId = annotation.telegramPaymentChargeId();
        if (telegramPaymentChargeId.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getTelegramPaymentChargeId()),
                                      finder.find(telegramPaymentChargeId));
        }
        NotNullFilter providerPaymentChargeId = annotation.providerPaymentChargeId();
        if (providerPaymentChargeId.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getProviderPaymentChargeId()),
                                      finder.find(providerPaymentChargeId));
        }

        return unionExtractValidator;
    }

    @Override
    public Class<SuccessfulPaymentFilter> getAnnotationClass() {
        return SuccessfulPaymentFilter.class;
    }

}

