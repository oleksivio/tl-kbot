package ru.ioleksiv.telegram.bot.core.model;

import org.jetbrains.annotations.Contract;

public enum AnnotationState {
    ON,
    OFF;

    @Contract(pure = true)
    public boolean isActive() {
        return this == ON;
    }
}
