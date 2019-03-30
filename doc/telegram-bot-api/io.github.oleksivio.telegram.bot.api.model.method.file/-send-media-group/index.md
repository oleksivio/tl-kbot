[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.method.file](../index.md) / [SendMediaGroup](./index.md)

# SendMediaGroup

`data class SendMediaGroup : ChatAction<`[`Message`](../../io.github.oleksivio.telegram.bot.api.model.objects.std/-message/index.md)`>`

**See Also**

[sendMediaGroup](#)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `SendMediaGroup(chatId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, media: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`InputMedia`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.files.inputmedia/-input-media/index.md)`>, disableNotification: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`? = null, replyToMessageId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [chatId](chat-id.md) | `val chatId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)<br>chat_id Integer Yes Unique identifier for the target chat |
| [disableNotification](disable-notification.md) | `val disableNotification: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?`<br>disable_notification [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) OptionalSends the messages silently. Users will receive a notification with no sound. |
| [media](media.md) | `val media: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`InputMedia`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.files.inputmedia/-input-media/index.md)`>`<br>media Array of InputMedia A JSON-serialized array describing photos and videos to be sent, must include 2–10 items |
| [method](method.md) | `val method: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [replyToMessageId](reply-to-message-id.md) | `val replyToMessageId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`?`<br>reply_to_message_id [Integer](https://docs.oracle.com/javase/6/docs/api/java/lang/Integer.html) OptionalIf the messages are a reply, ID of the original message |
| [resultWrapperClass](result-wrapper-class.md) | `val resultWrapperClass: `[`KClass`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)`<MessageResponse>` |
