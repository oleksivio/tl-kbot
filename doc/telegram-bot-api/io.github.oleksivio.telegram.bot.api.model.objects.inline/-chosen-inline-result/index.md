[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.inline](../index.md) / [ChosenInlineResult](./index.md)

# ChosenInlineResult

`data class ChosenInlineResult : IUserFrom`

[ChosenInlineResult](https://core.telegram.org/bots/api/#choseninlineresult)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ChosenInlineResult(resultId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, from: `[`User`](../../io.github.oleksivio.telegram.bot.api.model.objects.std/-user/index.md)`?, location: `[`Location`](../../io.github.oleksivio.telegram.bot.api.model.objects.std/-location/index.md)`? = null, inlineMessageId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, query: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null)`<br>[ChosenInlineResult](https://core.telegram.org/bots/api/#choseninlineresult) |

### Properties

| Name | Summary |
|---|---|
| [from](from.md) | `var from: `[`User`](../../io.github.oleksivio.telegram.bot.api.model.objects.std/-user/index.md)`?`<br>To setup filter: |
| [inlineMessageId](inline-message-id.md) | `var inlineMessageId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>To setup filter: |
| [location](location.md) | `var location: `[`Location`](../../io.github.oleksivio.telegram.bot.api.model.objects.std/-location/index.md)`?`<br>To setup filter: |
| [query](query.md) | `var query: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>To setup filter: null StringFilter query query String The query that was used to obtain the result |
| [resultId](result-id.md) | `var resultId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>result_id String The unique identifier for the result that was chosen |
