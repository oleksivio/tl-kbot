[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.std](../index.md) / [ResponseParameters](./index.md)

# ResponseParameters

`data class ResponseParameters : ITelegram`

[ResponseParameters](https://core.telegram.org/bots/api/#responseparameters)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ResponseParameters(migrateToChatId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`? = null, replyAfter: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null)`<br>[ResponseParameters](https://core.telegram.org/bots/api/#responseparameters) |

### Properties

| Name | Summary |
|---|---|
| [migrateToChatId](migrate-to-chat-id.md) | `var migrateToChatId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`?`<br>migrate_to_chat_id Integer Optional. The group has been migrated to a supergroup with the specified identifier. This number may be greater than 32 bits and some programming languages may have difficulty/silent defects in interpreting it. But it is smaller than 52 bits, so a signed 64 bit integer or double-precision float type are safe for storing this identifier. |
| [replyAfter](reply-after.md) | `var replyAfter: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`<br>retry_after Integer Optional. In case of exceeding flood control, the number of seconds left to wait before the request can be repeated |
