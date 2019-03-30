[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.annotations.filter.composite](../index.md) / [VoiceFilter](./index.md)

# VoiceFilter

`@Target([AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER]) annotation class VoiceFilter`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `VoiceFilter(status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md)` = AnnotationState.ON, validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`> = [], duration: <ERROR CLASS> = IntegerFilter(status = AnnotationState.OFF), mimeType: <ERROR CLASS> = StringFilter(status = AnnotationState.OFF), fileSize: <ERROR CLASS> = IntegerFilter(status = AnnotationState.OFF))` |

### Properties

| Name | Summary |
|---|---|
| [duration](duration.md) | `val duration: <ERROR CLASS>` |
| [fileSize](file-size.md) | `val fileSize: <ERROR CLASS>` |
| [mimeType](mime-type.md) | `val mimeType: <ERROR CLASS>` |
| [status](status.md) | `val status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md) |
| [validator](validator.md) | `val validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
