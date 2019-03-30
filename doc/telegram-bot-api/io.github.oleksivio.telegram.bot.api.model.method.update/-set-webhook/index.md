[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.method.update](../index.md) / [SetWebhook](./index.md)

# SetWebhook

`data class SetWebhook : UploadFile<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`

**See Also**

[setWebhook](#)

### Types

| Name | Summary |
|---|---|
| [Type](-type/index.md) | `enum class Type` |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `SetWebhook(url: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, certificate: FileSystemResource? = null, maxConnections: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, allowedUpdates: `[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<out `[`SetWebhook.Type`](-type/index.md)`>? = null)` |

### Properties

| Name | Summary |
|---|---|
| [allowedUpdates](allowed-updates.md) | `val allowedUpdates: `[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<out `[`SetWebhook.Type`](-type/index.md)`>?`<br>allowed_updates Array of [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) Optional List the types of updates you want your bot to receive. For example, specify [“message”,“edited_channel_post”,“callback_query”](#) to only receive updates of these types. See Update for a complete list of available update types. Specify an empty list to receive all updates regardless of type (default). If not specified, the previous setting will be used. |
| [certificate](certificate.md) | `val certificate: FileSystemResource?`<br>certificate InputFile Optional Upload your public key certificate so that the root certificate in use can be checked. See our self-signed guide for details. |
| [maxConnections](max-connections.md) | `val maxConnections: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`<br>max_connections [Integer](https://docs.oracle.com/javase/6/docs/api/java/lang/Integer.html) Optional Maximum allowed number of simultaneous HTTPS connections to the webhook for update delivery, 1-100. Defaults to 40. Use lower values to limit the load on your bot‘s server, and higher values to increase your bot’s throughput. |
| [method](method.md) | `val method: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [resultWrapperClass](result-wrapper-class.md) | `val resultWrapperClass: `[`KClass`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)`<BooleanResponse>` |
| [url](url.md) | `val url: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>url String HTTPS url to send updates to. Use an empty string to remove webhook integration |

### Functions

| Name | Summary |
|---|---|
| [fill](fill.md) | `fun ActionMap.fill(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
