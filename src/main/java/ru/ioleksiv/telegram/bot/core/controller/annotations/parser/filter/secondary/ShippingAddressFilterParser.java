package ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.secondary;

import org.springframework.stereotype.Component;
import ru.ioleksiv.telegram.bot.api.annotations.filter.primitive.StringFilter;
import ru.ioleksiv.telegram.bot.api.annotations.filter.secondary.ShippingAddressFilter;
import ru.ioleksiv.telegram.bot.api.model.objects.payments.ShippingAddress;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import ru.ioleksiv.telegram.bot.core.controller.annotations.parser.finder.Finder;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.check.impl.UnionExtractChecker;

import java.util.Optional;

@Component
public class ShippingAddressFilterParser implements FilterParser<ShippingAddressFilter, ShippingAddress> {

    @Override
    public Checker<ShippingAddress> createChecker(ShippingAddressFilter annotation, Finder finder) {
        UnionExtractChecker<ShippingAddress> unionExtractChecker = new UnionExtractChecker<>();

        StringFilter countryCode = annotation.countryCode();
        if (countryCode.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getCountryCode()), finder.find(countryCode));
        }
        StringFilter state = annotation.state();
        if (state.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getState()), finder.find(state));
        }
        StringFilter city = annotation.city();
        if (city.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getCity()), finder.find(city));
        }
        StringFilter streetLine1 = annotation.streetLine1();
        if (streetLine1.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getStreetLine1()), finder.find(streetLine1));
        }
        StringFilter streetLine2 = annotation.streetLine2();
        if (streetLine2.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getStreetLine2()), finder.find(streetLine2));
        }
        StringFilter postCode = annotation.postCode();
        if (postCode.value().isActive()) {
            unionExtractChecker.add(in -> Optional.ofNullable(in.getPostCode()), finder.find(postCode));
        }

        return unionExtractChecker;
    }

    @Override
    public Class<ShippingAddressFilter> getAnnotationClass() {
        return ShippingAddressFilter.class;
    }

}

