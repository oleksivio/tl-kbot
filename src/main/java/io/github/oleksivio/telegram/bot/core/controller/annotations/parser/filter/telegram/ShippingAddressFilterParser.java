package io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.telegram;

import io.github.oleksivio.telegram.bot.api.annotations.filter.primitive.StringFilter;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.finder.Finder;
import org.springframework.stereotype.Component;
import io.github.oleksivio.telegram.bot.api.annotations.filter.telegram.ShippingAddressFilter;
import io.github.oleksivio.telegram.bot.api.model.objects.payments.ShippingAddress;
import io.github.oleksivio.telegram.bot.core.controller.annotations.parser.filter.FilterParser;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.Validator;
import io.github.oleksivio.telegram.bot.core.controller.handler.check.impl.UnionExtractValidator;

import java.util.Arrays;
import java.util.Optional;

@Component
public class ShippingAddressFilterParser implements FilterParser<ShippingAddressFilter, ShippingAddress> {

    @Override
    public Validator<ShippingAddress> createChecker(ShippingAddressFilter annotation, Finder finder) {
        UnionExtractValidator<ShippingAddress> unionExtractValidator = new UnionExtractValidator<>();

        Arrays.stream(annotation.validator())
                .map(validatorName -> finder.find(validatorName,ShippingAddress.class))
                .forEach(validator -> unionExtractValidator.add(Optional::of, validator));

        StringFilter countryCode = annotation.countryCode();
        if (countryCode.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getCountryCode()), finder.find(countryCode));
        }
        StringFilter state = annotation.state();
        if (state.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getState()), finder.find(state));
        }
        StringFilter city = annotation.city();
        if (city.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getCity()), finder.find(city));
        }
        StringFilter streetLine1 = annotation.streetLine1();
        if (streetLine1.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getStreetLine1()), finder.find(streetLine1));
        }
        StringFilter streetLine2 = annotation.streetLine2();
        if (streetLine2.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getStreetLine2()), finder.find(streetLine2));
        }
        StringFilter postCode = annotation.postCode();
        if (postCode.status().isActive()) {
            unionExtractValidator.add(in -> Optional.ofNullable(in.getPostCode()), finder.find(postCode));
        }

        return unionExtractValidator;
    }

    @Override
    public Class<ShippingAddressFilter> getAnnotationClass() {
        return ShippingAddressFilter.class;
    }

}

