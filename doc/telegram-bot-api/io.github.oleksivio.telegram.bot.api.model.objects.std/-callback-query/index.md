[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.std](../index.md) / [CallbackQuery](./index.md)

# CallbackQuery

`data class CallbackQuery : IUserFrom`

[CallbackQuery](https://core.telegram.org/bots/api/#callbackquery)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `CallbackQuery(id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, from: `[`User`](../-user/index.md)`?, message: `[`Message`](../-message/index.md)`? = null, inlineMessageId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, chatInstance: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, data: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, gameShortName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null)`<br>[CallbackQuery](https://core.telegram.org/bots/api/#callbackquery) |

### Properties

| Name | Summary |
|---|---|
| [chatInstance](chat-instance.md) | `var chatInstance: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>To setup filter: |
| [data](data.md) | `var data: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>To setup filter: |
| [from](from.md) | `var from: `[`User`](../-user/index.md)`?`<br>To setup filter: |
| [gameShortName](game-short-name.md) | `var gameShortName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>To setup filter: |
| [id](id.md) | `var id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>id String Unique identifier for this query |
| [inlineMessageId](inline-message-id.md) | `var inlineMessageId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>To setup filter: |
| [message](message.md) | `var message: `[`Message`](../-message/index.md)`?`<br>To setup filter: |
