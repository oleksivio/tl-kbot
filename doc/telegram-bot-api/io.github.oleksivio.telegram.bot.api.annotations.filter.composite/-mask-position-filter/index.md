[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.annotations.filter.composite](../index.md) / [MaskPositionFilter](./index.md)

# MaskPositionFilter

`@Target([AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER]) annotation class MaskPositionFilter`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `MaskPositionFilter(status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md)` = AnnotationState.ON, validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`> = [], point: `[`MaskPosition.Type`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.sticker/-mask-position/-type/index.md)` = MaskPosition.Type.ALL, xShift: `[`FloatFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-float-filter/index.md)` = FloatFilter(status = AnnotationState.OFF), yShift: `[`FloatFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-float-filter/index.md)` = FloatFilter(status = AnnotationState.OFF), scale: `[`FloatFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-float-filter/index.md)` = FloatFilter(status = AnnotationState.OFF))` |

### Properties

| Name | Summary |
|---|---|
| [point](point.md) | `val point: `[`MaskPosition.Type`](../../io.github.oleksivio.telegram.bot.api.model.objects.std.sticker/-mask-position/-type/index.md) |
| [scale](scale.md) | `val scale: `[`FloatFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-float-filter/index.md) |
| [status](status.md) | `val status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md) |
| [validator](validator.md) | `val validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [xShift](x-shift.md) | `val xShift: `[`FloatFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-float-filter/index.md) |
| [yShift](y-shift.md) | `val yShift: `[`FloatFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-float-filter/index.md) |
