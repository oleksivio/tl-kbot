[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.method.notify](../index.md) / [AnswerCallbackQuery](./index.md)

# AnswerCallbackQuery

`data class AnswerCallbackQuery : Action<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `AnswerCallbackQuery(callbackQueryId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, showAlert: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`? = null, url: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, cacheTime: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [cacheTime](cache-time.md) | `val cacheTime: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`<br>cache_time [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) Optional The maximum amount of time in seconds that the result of the callback query may be cached client-side. Telegram apps will support caching starting in version 3.14. Defaults to 0. |
| [callbackQueryId](callback-query-id.md) | `val callbackQueryId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>callback_query_id String Unique identifier for the query to be answered |
| [method](method.md) | `val method: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [resultWrapperClass](result-wrapper-class.md) | `val resultWrapperClass: `[`KClass`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)`<BooleanResponse>` |
| [showAlert](show-alert.md) | `val showAlert: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?`<br>show_alert [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) Optional If true, an alert will be shown by the client instead of a notification at the top of the chat screen. Defaults to false. |
| [text](text.md) | `val text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>text [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) Optional Text of the notification. If not specified, nothing will be shown to the user, 0-200 characters |
| [url](url.md) | `val url: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>url [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) Optional URL that will be opened by the user's client. If you have created a Game and accepted the conditions via @BotFather, specify the URL that opens your game – note that this will only work if the query comes from a callback_game button. |
