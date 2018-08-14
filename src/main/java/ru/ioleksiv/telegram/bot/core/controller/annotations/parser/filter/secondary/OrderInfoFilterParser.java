package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.secondary;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.OrderInfoFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.ShippingAddressFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.payments.OrderInfo;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractChecker;

import java.util.Optional;

@Component
public class OrderInfoFilterParser extends FilterParser<OrderInfoFilter, OrderInfo> {

    @Override
    public Checker<OrderInfo> createChecker(OrderInfoFilter annotation, Finder finder) {
        UnionExtractChecker<OrderInfo> unionExtractChecker = new UnionExtractChecker<>();

        StringFilter name = annotation.name();
        if (name.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getName()), finder.find(name));
        }
        StringFilter phoneNumber = annotation.phoneNumber();
        if (phoneNumber.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getPhoneNumber()), finder.find(phoneNumber));
        }
        StringFilter email = annotation.email();
        if (email.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getEmail()), finder.find(email));
        }
        ShippingAddressFilter shippingAddress = annotation.shippingAddress();
        if (shippingAddress.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getShippingAddress()), finder.find(shippingAddress));
        }

        return unionExtractChecker;
    }

    @Override
    public Class<OrderInfoFilter> getAnnotationClass() {
        return OrderInfoFilter.class;
    }

}

