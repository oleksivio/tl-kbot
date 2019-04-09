[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects](../index.md) / [WebhookInfo](./index.md)

# WebhookInfo

`data class WebhookInfo : ITelegram`

https://core.telegram.org/bots/api/#webhookinfo

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `WebhookInfo(url: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, pendingUpdateCount: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, lastErrorDate: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`? = null, lastErrorMessage: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, maxConnections: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, allowedUpdates: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`> = ArrayList())`<br>https://core.telegram.org/bots/api/#webhookinfo |

### Properties

| Name | Summary |
|---|---|
| [allowedUpdates](allowed-updates.md) | `var allowedUpdates: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>`<br>allowed_updates Array of String |
| [lastErrorDate](last-error-date.md) | `var lastErrorDate: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`?`<br>last_error_date Integer Optional. Unix time for the most recent error that happened when trying to deliver an update via webhook |
| [lastErrorMessage](last-error-message.md) | `var lastErrorMessage: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>last_error_message [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) Optional. Error message in human-readable format for the most recent error that happened when trying to deliver an update via webhook |
| [maxConnections](max-connections.md) | `var maxConnections: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`<br>max_connections Integer Optional. Maximum allowed number of simultaneous HTTPS connections to the webhook for update delivery |
| [pendingUpdateCount](pending-update-count.md) | `var pendingUpdateCount: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`<br>pending_update_count Integer Number of updates awaiting delivery |
| [url](url.md) | `var url: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>url String Webhook URL, may be empty if webhook is not set up has_custom_certificate Boolean True, if a custom certificate was provided for webhook certificate checks |
