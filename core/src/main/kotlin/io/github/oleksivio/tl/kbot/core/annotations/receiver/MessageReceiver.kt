package io.github.oleksivio.tl.kbot.core.annotations.receiver

/**
 *
 * Annotation to mark function as receiver of
 * [Message][io.github.oleksivio.telegram.bot.api.model.objects.std.Message] type
 *
 * All functions annotated by [MessageReceiver] must have one input parameter of
 * [Message][io.github.oleksivio.telegram.bot.api.model.objects.std.Message] type
 *
 * Example (receive all messages without filter):
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
