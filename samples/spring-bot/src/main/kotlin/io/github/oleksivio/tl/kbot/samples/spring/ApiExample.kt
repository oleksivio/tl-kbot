package io.github.oleksivio.tl.kbot.samples.spring

import io.github.oleksivio.tl.kbot.core.annotations.filter.composite.MessageFilter
import io.github.oleksivio.tl.kbot.core.annotations.filter.primitive.StringFilter
import io.github.oleksivio.tl.kbot.core.annotations.receiver.MessageReceiver
import io.github.oleksivio.tl.kbot.core.controller.ActionBuilder
import io.github.oleksivio.tl.kbot.server.api.method.message.SendMessage
import io.github.oleksivio.tl.kbot.server.api.objects.ChatIdLongImpl
import io.github.oleksivio.tl.kbot.server.api.objects.std.Message
import org.springframework.stereotype.Component

@Component
class ApiExample(private val actionBuilder: ActionBuilder) {

    companion object {
        const val START_CMD = "/start"
        const val TEST_CMD = "/test"
    }

    @MessageReceiver
    @MessageFilter(
        text = StringFilter(contain = [START_CMD])
    )
    fun start(message: Message) = actionBuilder.action {
        SendMessage(
            chatId = ChatIdLongImpl(message.chat.id),
            text = "Hello! I'm bot created by [tl-kbot library](https://github.com/oleksivio/telegram-bot-api/)",
            parseMode = "Markdown"
        )
    }.send()

    @MessageReceiver
    @MessageFilter(
        text = StringFilter(contain = [TEST_CMD])
    )
    fun test(message: Message) = actionBuilder.action {
        SendMessage(
            chatId = ChatIdLongImpl(message.chat.id),
            text = "You see answer for $TEST_CMD message"
        )
    }.send()

    @MessageReceiver
    @MessageFilter(
        text = StringFilter(notContain = [TEST_CMD, START_CMD])
    )
    fun any(message: Message) = actionBuilder.action {
        SendMessage(
            chatId = ChatIdLongImpl(message.chat.id),
            text = "You see answer for any message. Send $START_CMD or $TEST_CMD"
        )
    }.send()
}
