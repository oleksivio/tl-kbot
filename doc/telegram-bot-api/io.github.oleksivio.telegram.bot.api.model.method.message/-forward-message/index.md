[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.method.message](../index.md) / [ForwardMessage](./index.md)

# ForwardMessage

`data class ForwardMessage : ChatAction<`[`Message`](../../io.github.oleksivio.telegram.bot.api.model.objects.std/-message/index.md)`>`

**See Also**

[forwardMessage](#)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ForwardMessage(chatId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, fromChatId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, disableNotification: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`? = null, messageId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`)` |

### Properties

| Name | Summary |
|---|---|
| [chatId](chat-id.md) | `val chatId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)<br>chat_id Integer or String Yes Unique identifier |
| [disableNotification](disable-notification.md) | `val disableNotification: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?`<br>disable_notification [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) OptionalSends the message silently. Users will receive a notification with no sound. |
| [fromChatId](from-chat-id.md) | `val fromChatId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)<br>from_chat_id Integer or String Yes Unique identifier for the chat where the original message was sent |
| [messageId](message-id.md) | `val messageId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)<br>message_id Integer Yes Message identifier in the chat specified in from_chat_id |
| [method](method.md) | `val method: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [resultWrapperClass](result-wrapper-class.md) | `val resultWrapperClass: `[`KClass`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)`<MessageResponse>` |
