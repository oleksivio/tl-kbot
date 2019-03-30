[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.annotations.filter.composite](../index.md) / [MessageEntityFilter](./index.md)

# MessageEntityFilter

`@Target([AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER]) annotation class MessageEntityFilter`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `MessageEntityFilter(status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md)` = AnnotationState.ON, type: `[`MessageEntity.Type`](../../io.github.oleksivio.telegram.bot.api.model.objects.std/-message-entity/-type/index.md)` = MessageEntity.Type.ALL, validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`> = [], length: <ERROR CLASS> = IntegerFilter(status = AnnotationState.OFF), url: <ERROR CLASS> = StringFilter(status = AnnotationState.OFF), user: `[`UserFilter`](../-user-filter/index.md)` = UserFilter(status = AnnotationState.OFF))` |

### Properties

| Name | Summary |
|---|---|
| [length](length.md) | `val length: <ERROR CLASS>` |
| [status](status.md) | `val status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md) |
| [type](type.md) | `val type: `[`MessageEntity.Type`](../../io.github.oleksivio.telegram.bot.api.model.objects.std/-message-entity/-type/index.md) |
| [url](url.md) | `val url: <ERROR CLASS>` |
| [user](user.md) | `val user: `[`UserFilter`](../-user-filter/index.md) |
| [validator](validator.md) | `val validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
