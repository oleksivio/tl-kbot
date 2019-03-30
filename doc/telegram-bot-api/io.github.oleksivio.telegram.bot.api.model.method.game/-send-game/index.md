[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.method.game](../index.md) / [SendGame](./index.md)

# SendGame

`data class SendGame : ChatAction<`[`Message`](../../io.github.oleksivio.telegram.bot.api.model.objects.std/-message/index.md)`>`

**See Also**

[sendGame](#)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `SendGame(chatId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, gameShortName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, replyMarkup: `[`InlineKeyboardMarkup`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard/-inline-keyboard-markup/index.md)`? = null, disableNotification: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`? = null, replyToMessageId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [chatId](chat-id.md) | `val chatId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)<br>chat_id Integer or String Yes Unique identifier for the target chat or username of the target channel |
| [disableNotification](disable-notification.md) | `val disableNotification: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?`<br>disable_notification [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) OptionalSends the message silently. Users will receive a notification with no sound. |
| [gameShortName](game-short-name.md) | `val gameShortName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>game_short_name String Yes Short name of the game, serves as the unique identifier for the game. Set up your games via Botfather. |
| [method](method.md) | `val method: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [replyMarkup](reply-markup.md) | `val replyMarkup: `[`InlineKeyboardMarkup`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.keyboard/-inline-keyboard-markup/index.md)`?`<br>reply_markup InlineKeyboardMarkup Optional A JSON-serialized object for an inline keyboard. If empty, one ‘Play game_title’ button will be shown. If not empty, the first button must launch the game. |
| [replyToMessageId](reply-to-message-id.md) | `val replyToMessageId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`?`<br>reply_to_message_id [Integer](https://docs.oracle.com/javase/6/docs/api/java/lang/Integer.html) OptionalIf the message is a reply, ID of the original message |
| [resultWrapperClass](result-wrapper-class.md) | `val resultWrapperClass: `[`KClass`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)`<MessageResponse>` |
