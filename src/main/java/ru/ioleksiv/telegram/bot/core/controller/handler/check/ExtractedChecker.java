package ru.ioleksiv.telegram.bot.core.controller.handler.check;

import org.jetbrains.annotations.Nullable;
import ru.ioleksiv.telegram.bot.core.controller.handler.unpack.Unpacker;
import ru.ioleksiv.telegram.bot.core.model.ITelegram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

public class ExtractedChecker<IN extends ITelegram, OUT> implements Checker<IN> {

    private final Collection<Checker<OUT>> subcheckers = new ArrayList<>();

    private final Unpacker<IN, OUT> unpacker;
    private final Checker<OUT> checker;

    public ExtractedChecker(Unpacker<IN, OUT> unpacker,
                            Checker<OUT> checker) {
        this.unpacker = unpacker;
        this.checker = checker;
    }

    public void add(Checker<OUT> filter) {
        subcheckers.add(filter);
    }

    @Override
    public boolean check(@Nullable IN argument) {
        return Optional.ofNullable(argument)
                .flatMap(unpacker::unpack)
                .filter(checker::check)
                .filter(unpacker -> subcheckers.stream().allMatch(outChecker -> outChecker.check(unpacker)))
                .isPresent();

    }

}
