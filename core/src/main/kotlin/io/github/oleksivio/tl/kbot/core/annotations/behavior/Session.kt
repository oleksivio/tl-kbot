package io.github.oleksivio.tl.kbot.core.annotations.behavior

import io.github.oleksivio.tl.kbot.core.model.annotation.SessionType

@Retention
@Target(AnnotationTarget.CLASS)
@MustBeDocumented
/**
 * Annotation to mark class as session.
 *
 * When bot receive update which passed all
 *  [primitive][io.github.oleksivio.tl.kbot.core.annotations.filter.primitive] and
 *  [composite][io.github.oleksivio.tl.kbot.core.annotations.filter.composite] filters
 *  to method annotated by [Session.Initial] session class marked as active and
 *  all next updates will be received only by this session class.
 *
 * When bot receive update than can't passed filter to one of [Session.Order] method
 *  - if session class  has method annotated by [Session.Error] with
 *   [Session.Error.value] equals [Session.Order.value] method
 *   annotated by [Session.Error]  will be invoked
 *  - else session will be wait valid message with no response.
 *
 *  When bot receive update which passed all
 *  [primitive][io.github.oleksivio.tl.kbot.core.annotations.filter.primitive] and
 *  [composite][io.github.oleksivio.tl.kbot.core.annotations.filter.composite] filters
 *   to method annotated by [Session.Cancel] session class market as inactive and
 *   bot return to normal mode
 *
 * Class that marked by this annotation must include:
 *   - only one method annotated with [Session.Initial]
 *   - only one method annotated with [Session.Cancel]
 *   - one or more method annotated with [Session.Order]
 *   - one or more method annotated with [Session.Error]
 *
 *  For every [Session.Order] method must be only one method
 *  with [Session.Error] with same order value
 *
 *  Could be more than one [Session.Order] function with same value,
 *  but it must have different filter
 *
 * [Example](https://github.com/oleksivio/example-bot/blob/master/src/main/kotlin/telegram/bot/example/UserSessionExample.kt)
 *
 */
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
