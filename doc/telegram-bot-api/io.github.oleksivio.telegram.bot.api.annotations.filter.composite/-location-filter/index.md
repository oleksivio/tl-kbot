[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.annotations.filter.composite](../index.md) / [LocationFilter](./index.md)

# LocationFilter

`@Target([AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER]) annotation class LocationFilter`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `LocationFilter(status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md)` = AnnotationState.ON, validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`> = [], longitude: `[`DoubleFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-double-filter/index.md)` = DoubleFilter(status = AnnotationState.OFF), latitude: `[`DoubleFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-double-filter/index.md)` = DoubleFilter(status = AnnotationState.OFF))` |

### Properties

| Name | Summary |
|---|---|
| [latitude](latitude.md) | `val latitude: `[`DoubleFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-double-filter/index.md) |
| [longitude](longitude.md) | `val longitude: `[`DoubleFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-double-filter/index.md) |
| [status](status.md) | `val status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md) |
| [validator](validator.md) | `val validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
