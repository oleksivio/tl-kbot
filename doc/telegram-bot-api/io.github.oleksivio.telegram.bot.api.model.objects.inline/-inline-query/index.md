[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.inline](../index.md) / [InlineQuery](./index.md)

# InlineQuery

`data class InlineQuery : IUserFrom`

[InlineQuery](https://core.telegram.org/bots/api/#inlinequery)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `InlineQuery(id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, from: `[`User`](../../io.github.oleksivio.telegram.bot.api.model.objects.std/-user/index.md)`?, location: `[`Location`](../../io.github.oleksivio.telegram.bot.api.model.objects.std/-location/index.md)`? = null, query: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, offset: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null)`<br>[InlineQuery](https://core.telegram.org/bots/api/#inlinequery) |

### Properties

| Name | Summary |
|---|---|
| [from](from.md) | `var from: `[`User`](../../io.github.oleksivio.telegram.bot.api.model.objects.std/-user/index.md)`?`<br>To setup filter: |
| [id](id.md) | `var id: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>id String Unique identifier for this query |
| [location](location.md) | `var location: `[`Location`](../../io.github.oleksivio.telegram.bot.api.model.objects.std/-location/index.md)`?`<br>To setup filter: |
| [offset](offset.md) | `var offset: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>To setup filter: |
| [query](query.md) | `var query: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>To setup filter: |
