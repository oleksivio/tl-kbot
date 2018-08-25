package ru.ioleksiv.telegram.bot.api.model.annotation.validator.impl;

import ru.ioleksiv.telegram.bot.api.model.annotation.validator.CustomValidator;
import ru.ioleksiv.telegram.bot.api.model.annotation.validator.FilterValidator;
import ru.ioleksiv.telegram.bot.api.model.objects.payments.OrderInfo;

public class OrderInfoFilterValidator extends FilterValidator<OrderInfo> {

    public OrderInfoFilterValidator(CustomValidator<OrderInfo> validator) {
        super(OrderInfo.class, validator);
    }
}
