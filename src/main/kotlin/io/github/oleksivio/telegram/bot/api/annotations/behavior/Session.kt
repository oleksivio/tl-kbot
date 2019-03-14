package io.github.oleksivio.telegram.bot.api.annotations.behavior

import io.github.oleksivio.telegram.bot.api.model.annotation.SessionType

@Retention
@Target(AnnotationTarget.CLASS)
@MustBeDocumented
annotation class Session(val value: SessionType) {

    @Retention
    @Target(AnnotationTarget.FUNCTION)
    annotation class Initial

    @Retention
    @Target(AnnotationTarget.FUNCTION)
    annotation class Cancel

    @Retention
    @Target(AnnotationTarget.FUNCTION)
    annotation class Order(val value: Int)

    @Retention
    @Target(AnnotationTarget.FUNCTION)
    annotation class Error(val value: Int)

}
