[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.annotations.filter.composite](../index.md) / [MessageEntityArrayFilter](./index.md)

# MessageEntityArrayFilter

`@Target([AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER]) annotation class MessageEntityArrayFilter`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `MessageEntityArrayFilter(status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md)` = AnnotationState.ON, type: `[`MessageEntity.Type`](../../io.github.oleksivio.telegram.bot.api.model.objects.std/-message-entity/-type/index.md)` = MessageEntity.Type.ALL, validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`> = [], length: `[`IntegerFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-integer-filter/index.md)` = IntegerFilter(status = AnnotationState.OFF), url: `[`StringFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-string-filter/index.md)` = StringFilter(status = AnnotationState.OFF), user: `[`UserFilter`](../-user-filter/index.md)` = UserFilter(status = AnnotationState.OFF))` |

### Properties

| Name | Summary |
|---|---|
| [length](length.md) | `val length: `[`IntegerFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-integer-filter/index.md) |
| [status](status.md) | `val status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md) |
| [type](type.md) | `val type: `[`MessageEntity.Type`](../../io.github.oleksivio.telegram.bot.api.model.objects.std/-message-entity/-type/index.md) |
| [url](url.md) | `val url: `[`StringFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-string-filter/index.md) |
| [user](user.md) | `val user: `[`UserFilter`](../-user-filter/index.md) |
| [validator](validator.md) | `val validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
