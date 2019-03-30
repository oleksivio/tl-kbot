[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.method.message](../index.md) / [DeleteMessage](./index.md)

# DeleteMessage

`data class DeleteMessage : ChatAction<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`

**See Also**

[deleteMessage](#)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `DeleteMessage(messageId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, chatId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`)` |

### Properties

| Name | Summary |
|---|---|
| [chatId](chat-id.md) | `val chatId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)<br>chat_id Integer or String Yes Unique identifier for the target chat or username of the target channel (in the format @channelusername) |
| [messageId](message-id.md) | `val messageId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)<br>message_id Integer Yes Identifier of the message to delete |
| [method](method.md) | `val method: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [resultWrapperClass](result-wrapper-class.md) | `val resultWrapperClass: `[`KClass`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)`<BooleanResponse>` |
