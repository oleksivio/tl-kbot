package io.github.oleksivio.telegram.bot.api.model.annotation.validator.impl;

import io.github.oleksivio.telegram.bot.api.model.annotation.validator.CustomValidator;
import io.github.oleksivio.telegram.bot.api.model.annotation.validator.FilterValidator;
import io.github.oleksivio.telegram.bot.api.model.objects.payments.OrderInfo;

public class OrderInfoFilterValidator extends FilterValidator<OrderInfo> {

    public OrderInfoFilterValidator(CustomValidator<OrderInfo> validator) {
        super(OrderInfo.class, validator);
    }
}
