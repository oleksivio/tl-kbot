package io.github.oleksivio.tl.kbot.core.model.annotation

enum class AnnotationState {
    ON,
    OFF;

    val isActive: Boolean
        get() = this == ON
}
