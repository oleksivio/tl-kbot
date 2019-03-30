[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.method.location](../index.md) / [EditMessageLiveLocation](./index.md)

# EditMessageLiveLocation

`data class EditMessageLiveLocation : EditAction<`[`Message`](../../io.github.oleksivio.telegram.bot.api.model.objects.std/-message/index.md)`>`

**See Also**

[editMessageLiveLocation](#)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `EditMessageLiveLocation(chatId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`? = null, messageId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`? = null, inlineMessageId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, latitude: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`, longitude: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`, inlineKeyboardMarkup: `[`InlineKeyboardMarkup`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard/-inline-keyboard-markup/index.md)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [chatId](chat-id.md) | `val chatId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`?`<br>chat_id Integer or [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) Optional Required if inline_message_id is not specified. Unique identifier for the target chat |
| [inlineKeyboardMarkup](inline-keyboard-markup.md) | `val inlineKeyboardMarkup: `[`InlineKeyboardMarkup`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard/-inline-keyboard-markup/index.md)`?`<br>reply_markup InlineKeyboardMarkup Optional A JSON-serialized object for a new inline keyboard. |
| [inlineMessageId](inline-message-id.md) | `val inlineMessageId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>inline_message_id [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) Optional Required if chat_id and message_id are not specified. Identifier of the inline message |
| [latitude](latitude.md) | `val latitude: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)<br>latitude Float number Yes Latitude of new location |
| [longitude](longitude.md) | `val longitude: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)<br>longitude Float number Yes Longitude of new location |
| [messageId](message-id.md) | `val messageId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`?`<br>message_id [Integer](https://docs.oracle.com/javase/6/docs/api/java/lang/Integer.html) OptionalRequired if inline_message_id is not specified. Identifier of the sent message |
| [method](method.md) | `val method: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [resultWrapperClass](result-wrapper-class.md) | `val resultWrapperClass: `[`KClass`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)`<MessageResponse>` |
