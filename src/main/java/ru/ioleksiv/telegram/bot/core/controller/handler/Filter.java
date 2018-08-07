package ru.ioleksiv.telegram.bot.core.controller.handler;

import org.jetbrains.annotations.Nullable;
import ru.ioleksiv.telegram.bot.core.controller.handler.checker.Checker;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpacker.Unpacker;

import java.util.ArrayList;
import java.util.Collection;

public class Filter<IN, OUT> implements Checker<IN> {

    private final Collection<Filter<OUT, ?>> subCheckers = new ArrayList<>();

    private final Unpacker<IN, OUT> unpacker;
    private final Checker<OUT> checker;
    private final Class<OUT> outClass;
    private final Class<IN> inClass;
    private final Layer layerLevel;

    public Filter(Unpacker<IN, OUT> unpacker,
                  Checker<OUT> checker,
                  Class<OUT> outClass,
                  Class<IN> inClass,
                  Layer layerLevel) {
        this.unpacker = unpacker;
        this.checker = checker;
        this.outClass = outClass;
        this.inClass = inClass;
        this.layerLevel = layerLevel;
    }

    public void add(Filter<OUT, ?> filter) {
        subCheckers.add(filter);
    }

    @Override
    public boolean check(@Nullable IN argument) {
        if (argument == null) {
            return false;
        }

        OUT unpacked = unpacker.unpack(argument);

        return unpacked != null
                && checker.check(unpacked)
                && subCheckers.stream().allMatch(outObjectFilter -> outObjectFilter.check(unpacked));
    }

    public Unpacker<IN, OUT> getUnpacker() {
        return unpacker;
    }

    public Layer getLayer() {
        return layerLevel;
    }

    public Class<OUT> getOutClass() {
        return outClass;
    }

    public Class<IN> getInClass() {
        return inClass;
    }
}
