package ru.ioleksiv.telegram.bot.api.model.annotation;

import org.jetbrains.annotations.Contract;

public enum AnnotationState {
    ON,
    OFF;

    @Contract(pure = true)
    public boolean isActive() {
        return this == ON;
    }
}
