package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.telegram;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.OrderInfoFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.telegram.ShippingAddressFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.payments.OrderInfo;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.ParserUtils;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Validator;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator;

import java.util.Arrays;
import java.util.Optional;

@Component
public class OrderInfoFilterParser implements FilterParser<OrderInfoFilter, OrderInfo> {

    @Override
    public Validator<OrderInfo> createChecker(OrderInfoFilter annotation, Finder finder) {
        UnionExtractValidator<OrderInfo> unionExtractValidator = new UnionExtractValidator<>();

        Arrays.stream(annotation.validator())
                .filter(ParserUtils::isNotStubValidator)
                .map(finder::find)
                .forEach(validator -> {
                    unionExtractValidator.add(Optional::of, validator);
                });

        StringFilter name = annotation.name();
        if (name.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getName()), finder.find(name));
        }
        StringFilter phoneNumber = annotation.phoneNumber();
        if (phoneNumber.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getPhoneNumber()), finder.find(phoneNumber));
        }
        StringFilter email = annotation.email();
        if (email.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getEmail()), finder.find(email));
        }
        ShippingAddressFilter shippingAddress = annotation.shippingAddress();
        if (shippingAddress.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getShippingAddress()), finder.find(shippingAddress));
        }

        return unionExtractValidator;
    }

    @Override
    public Class<OrderInfoFilter> getAnnotationClass() {
        return OrderInfoFilter.class;
    }

}

