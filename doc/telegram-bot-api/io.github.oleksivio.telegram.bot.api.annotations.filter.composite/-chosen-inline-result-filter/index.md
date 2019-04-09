[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.annotations.filter.composite](../index.md) / [ChosenInlineResultFilter](./index.md)

# ChosenInlineResultFilter

`@Target([AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER]) annotation class ChosenInlineResultFilter`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ChosenInlineResultFilter(from: `[`UserFilter`](../-user-filter/index.md)` = UserFilter(status = AnnotationState.OFF), validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`> = [], location: `[`LocationFilter`](../-location-filter/index.md)` = LocationFilter(status = AnnotationState.OFF), inlineMessageId: `[`StringFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-string-filter/index.md)` = StringFilter(status = AnnotationState.OFF), query: `[`StringFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-string-filter/index.md)` = StringFilter(status = AnnotationState.OFF))` |

### Properties

| Name | Summary |
|---|---|
| [from](from.md) | `val from: `[`UserFilter`](../-user-filter/index.md) |
| [inlineMessageId](inline-message-id.md) | `val inlineMessageId: `[`StringFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-string-filter/index.md) |
| [location](location.md) | `val location: `[`LocationFilter`](../-location-filter/index.md) |
| [query](query.md) | `val query: `[`StringFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-string-filter/index.md) |
| [validator](validator.md) | `val validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
