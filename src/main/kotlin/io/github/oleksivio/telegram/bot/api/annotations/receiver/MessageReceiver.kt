package io.github.oleksivio.telegram.bot.api.annotations.receiver

/**
 *
 * Annotation to mark function as receiver of
 * [Message][io.github.oleksivio.telegram.bot.api.model.objects.std.Message]
 *
 * All functions annotated by [MessageReceiver] must have one input parameter
 * [Message][io.github.oleksivio.telegram.bot.api.model.objects.std.Message] type
 *
 * Example:
 *
 * ```kotlin
 *  @MessageReceiver
 *  fun init(message: Message) {
 *     println(message.text)
 *  }
 *
 * ```
 */
@Retention
@Target(AnnotationTarget.FUNCTION)
@MustBeDocumented
annotation class MessageReceiver
