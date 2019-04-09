[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.annotations.filter.composite](../index.md) / [VideoFilter](./index.md)

# VideoFilter

`@Target([AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER]) annotation class VideoFilter`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `VideoFilter(status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md)` = AnnotationState.ON, validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`> = [], duration: `[`IntegerFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-integer-filter/index.md)` = IntegerFilter(status = AnnotationState.OFF), width: `[`IntegerFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-integer-filter/index.md)` = IntegerFilter(status = AnnotationState.OFF), height: `[`IntegerFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-integer-filter/index.md)` = IntegerFilter(status = AnnotationState.OFF), thumb: `[`PhotoFilter`](../-photo-filter/index.md)` = PhotoFilter(status = AnnotationState.OFF), mimeType: `[`StringFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-string-filter/index.md)` = StringFilter(status = AnnotationState.OFF), fileSize: `[`IntegerFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-integer-filter/index.md)` = IntegerFilter(status = AnnotationState.OFF))` |

### Properties

| Name | Summary |
|---|---|
| [duration](duration.md) | `val duration: `[`IntegerFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-integer-filter/index.md) |
| [fileSize](file-size.md) | `val fileSize: `[`IntegerFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-integer-filter/index.md) |
| [height](height.md) | `val height: `[`IntegerFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-integer-filter/index.md) |
| [mimeType](mime-type.md) | `val mimeType: `[`StringFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-string-filter/index.md) |
| [status](status.md) | `val status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md) |
| [thumb](thumb.md) | `val thumb: `[`PhotoFilter`](../-photo-filter/index.md) |
| [validator](validator.md) | `val validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [width](width.md) | `val width: `[`IntegerFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-integer-filter/index.md) |
