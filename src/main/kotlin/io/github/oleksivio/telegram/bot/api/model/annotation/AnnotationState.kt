package io.github.oleksivio.telegram.bot.api.model.annotation

enum class AnnotationState {
    ON,
    OFF;

    val isActive: Boolean
        get() = this == ON
}
