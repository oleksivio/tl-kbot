package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.telegram;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.OrderInfoFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.ShippingAddressFilter;
import ru.ioleksiv.telegram.bot.api.model.annotation.stub.StubCustomValidator;
import ru.ioleksiv.telegram.bot.api.model.objects.payments.OrderInfo;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Validator;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator;

import java.util.Objects;
import java.util.Optional;

@Component
public class OrderInfoFilterParser implements FilterParser<OrderInfoFilter, OrderInfo> {

    @Override
    public Validator<OrderInfo> createChecker(OrderInfoFilter annotation, Finder finder) {
        UnionExtractValidator<OrderInfo> unionExtractValidator = new UnionExtractValidator<>();

        Class<? extends Validator>[] validators = annotation.validator();
        for(Class<? extends Validator> validator : validators) {
            if (!Objects.equals(validator, StubCustomValidator.class)) {
                unionExtractValidator.add(Optional::of, finder.find(validator));
            }
        }
        StringFilter name = annotation.name();
        if (name.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getName()), finder.find(name));
        }
        StringFilter phoneNumber = annotation.phoneNumber();
        if (phoneNumber.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getPhoneNumber()), finder.find(phoneNumber));
        }
        StringFilter email = annotation.email();
        if (email.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getEmail()), finder.find(email));
        }
        ShippingAddressFilter shippingAddress = annotation.shippingAddress();
        if (shippingAddress.value().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getShippingAddress()), finder.find(shippingAddress));
        }

        return unionExtractValidator;
    }

    @Override
    public Class<OrderInfoFilter> getAnnotationClass() {
        return OrderInfoFilter.class;
    }

}

