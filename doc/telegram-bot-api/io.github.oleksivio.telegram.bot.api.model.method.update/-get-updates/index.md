[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.method.update](../index.md) / [GetUpdates](./index.md)

# GetUpdates

`data class GetUpdates : Action<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Update`](../../io.github.oleksivio.telegram.bot.api.model.objects/-update/index.md)`>>`

**See Also**

[getUpdates](#)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `GetUpdates(offset: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, limit: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, timeout: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, allowedUpdates: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>? = null)` |

### Properties

| Name | Summary |
|---|---|
| [allowedUpdates](allowed-updates.md) | `val allowedUpdates: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>?`<br>allowed_updates Array of [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) Optional List the types of updates you want your bot to receive. For example, specify [“message”,“edited_channel_post”,“callback_query”](#) to only receive updates of these types. See Update for a complete list of available update types. Specify an empty list to receive all updates regardless of type (default). If not specified (null), the previous setting will be used. |
| [limit](limit.md) | `val limit: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`<br>limit [Integer](https://docs.oracle.com/javase/6/docs/api/java/lang/Integer.html) OptionalLimits the number of updates to be retrieved. Values between 1—100 are accepted. Defaults to 100. |
| [method](method.md) | `val method: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [offset](offset.md) | `val offset: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`<br>offset [Integer](https://docs.oracle.com/javase/6/docs/api/java/lang/Integer.html) OptionalIdentifier of the first update to be returned. Must be greater by one than the highest among the identifiers of previously received updates. By default, updates starting with the earliest unconfirmed update are returned. An update is considered confirmed as soon as getUpdates is called with an offset higher than its update_id. The negative offset can be specified to longPolling updates starting from -offset update from the end of the updates queue. All previous updates will forgotten. |
| [resultWrapperClass](result-wrapper-class.md) | `val resultWrapperClass: `[`KClass`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)`<UpdatesArrayResponse>` |
| [timeout](timeout.md) | `val timeout: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`<br>timeout [Integer](https://docs.oracle.com/javase/6/docs/api/java/lang/Integer.html) OptionalTimeout in seconds for long polling. Defaults to 0, i.e. usual short polling. Should be positive, short polling should be used for testing purposes only. |
