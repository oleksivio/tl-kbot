package ru.ioleksiv.telegram.bot.core.controller.annotations;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import ru.ioleksiv.telegram.bot.api.model.objects.Update;
import ru.ioleksiv.telegram.bot.core.controller.annotations.converter.FilterConverter;
import ru.ioleksiv.telegram.bot.core.controller.handler.Filter;
import ru.ioleksiv.telegram.bot.core.controller.handler.Layer;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;

// todo refactor
@Controller
public class FilterFactory {
    private static final Function<Layer, List<Filter>> STUB = layer -> new ArrayList<>();

    private final Collection<FilterConverter> filterConverters;

    public FilterFactory(Collection<FilterConverter> filterConverters) {
        this.filterConverters = filterConverters;
    }

    public Optional<Filter<Update, ?>> findRootFilter(Method method) {
        Map<Layer, List<Filter>> map = createFilterMap(method);

        if (map.isEmpty()) {
            return Optional.empty();
        }

        validateRoot(map.computeIfAbsent(Layer.UPDATE, STUB), method);

        Filter<Update, ?> resultFilter = connectFilters(map, Arrays.asList(Layer.values()));

        return Optional.of(resultFilter);

    }

    private Map<Layer, List<Filter>> createFilterMap(Method method) {
        Map<Layer, List<Filter>> filterMap = new EnumMap<>(Layer.class);

        for (FilterConverter filterConverter : filterConverters) {
            if (filterConverter.canParse(method)) {

                Filter filter = filterConverter.createFilter(method);

                List<Filter> mapFilterList = filterMap.computeIfAbsent(filter.getLayer(), STUB);
                mapFilterList.add(filter);
            }
        }

        return filterMap;
    }

    private static void validateRoot(@NotNull Collection<Filter> updateList, Method method) {
        switch (updateList.size()) {
            case 1: {
                return;
            }
            case 0: {
                throw new UnsupportedOperationException("Error when parsing " + method.getName() + " annotations." +
                                                                " Not found update handler");

            }
            default: {
                throw new UnsupportedOperationException("Error when parsing " + method.getName() + " annotations." +
                                                                " Method must have only one handler.");
            }

        }
    }

    private static Filter<Update, ?> connectFilters(Map<Layer, List<Filter>> map, @NotNull List<Layer> layers) {
        layers.sort((o1, o2) -> Integer.compare(o2.level(), o1.level()));

        for (int i = 0; i < layers.size() - 1; i++) {
            List<Filter> parentList = map.computeIfAbsent(layers.get(i + 1), STUB);
            List<Filter> childrenList = map.computeIfAbsent(layers.get(i), STUB);

            for (Filter parent : parentList) {
                for (Filter children : childrenList) {
                    if (Objects.equals(parent.getOutClass(), children.getInClass())) {
                        parent.add(children);
                    }
                }
            }

        }

        return map.get(Layer.UPDATE).get(0);

    }

}
