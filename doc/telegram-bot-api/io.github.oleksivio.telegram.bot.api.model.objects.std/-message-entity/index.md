[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.model.objects.std](../index.md) / [MessageEntity](./index.md)

# MessageEntity

`data class MessageEntity : ITelegram`

[MessageEntity](https://core.telegram.org/bots/api/#messageentity)

### Types

| Name | Summary |
|---|---|
| [Const](-const/index.md) | `object Const` |
| [Type](-type/index.md) | `enum class Type : TelegramType` |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `MessageEntity(type: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, offset: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, length: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, url: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, user: `[`User`](../-user/index.md)`? = null)`<br>[MessageEntity](https://core.telegram.org/bots/api/#messageentity) |

### Properties

| Name | Summary |
|---|---|
| [length](length.md) | `var length: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`<br>To setup filter: |
| [offset](offset.md) | `var offset: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`<br>offset Integer Offset in UTF-16 code units to the start of the entity |
| [type](type.md) | `var type: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>To setup filter: |
| [url](url.md) | `var url: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>To setup filter: |
| [user](user.md) | `var user: `[`User`](../-user/index.md)`?`<br>To setup filter: |
