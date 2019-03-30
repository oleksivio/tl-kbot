[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.annotations.filter.composite](../index.md) / [StickerFilter](./index.md)

# StickerFilter

`@Target([AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER]) annotation class StickerFilter`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `StickerFilter(status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md)` = AnnotationState.ON, validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`> = [], maskPosition: `[`MaskPositionFilter`](../-mask-position-filter/index.md)` = MaskPositionFilter(status = AnnotationState.OFF), width: `[`IntegerFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-integer-filter/index.md)` = IntegerFilter(status = AnnotationState.OFF), height: `[`IntegerFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-integer-filter/index.md)` = IntegerFilter(status = AnnotationState.OFF), thumb: `[`PhotoFilter`](../-photo-filter/index.md)` = PhotoFilter(status = AnnotationState.OFF), emoji: `[`StringFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-string-filter/index.md)` = StringFilter(status = AnnotationState.OFF), setName: `[`StringFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-string-filter/index.md)` = StringFilter(status = AnnotationState.OFF), fileSize: `[`IntegerFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-integer-filter/index.md)` = IntegerFilter(status = AnnotationState.OFF))` |

### Properties

| Name | Summary |
|---|---|
| [emoji](emoji.md) | `val emoji: `[`StringFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-string-filter/index.md) |
| [fileSize](file-size.md) | `val fileSize: `[`IntegerFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-integer-filter/index.md) |
| [height](height.md) | `val height: `[`IntegerFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-integer-filter/index.md) |
| [maskPosition](mask-position.md) | `val maskPosition: `[`MaskPositionFilter`](../-mask-position-filter/index.md) |
| [setName](set-name.md) | `val setName: `[`StringFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-string-filter/index.md) |
| [status](status.md) | `val status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md) |
| [thumb](thumb.md) | `val thumb: `[`PhotoFilter`](../-photo-filter/index.md) |
| [validator](validator.md) | `val validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [width](width.md) | `val width: `[`IntegerFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-integer-filter/index.md) |
