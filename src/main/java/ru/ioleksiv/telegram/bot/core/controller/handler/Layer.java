package ru.ioleksiv.telegram.bot.core.controller.handler;

import org.jetbrains.annotations.Contract;

public enum Layer {
    UPDATE(0),
    ARG_CLASS(1),
    TOP_FILTER(2),
    MIDDLE_FILTER(3),
    LOW_FILTER(4);

    private final int level;

    Layer(int level) {
        this.level = level;
    }

    @Contract(pure = true)
    public int level() {
        return level;
    }
}
