[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.annotations.filter.composite](../index.md) / [EncryptedCredentialsFilter](./index.md)

# EncryptedCredentialsFilter

`@Target([AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER]) annotation class EncryptedCredentialsFilter`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `EncryptedCredentialsFilter(status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md)` = AnnotationState.ON, validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`> = [], data: `[`NotNullFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-not-null-filter/index.md)` = NotNullFilter(status = AnnotationState.OFF), hash: `[`NotNullFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-not-null-filter/index.md)` = NotNullFilter(status = AnnotationState.OFF), secret: `[`NotNullFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-not-null-filter/index.md)` = NotNullFilter(status = AnnotationState.OFF))` |

### Properties

| Name | Summary |
|---|---|
| [data](data.md) | `val data: `[`NotNullFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-not-null-filter/index.md) |
| [hash](hash.md) | `val hash: `[`NotNullFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-not-null-filter/index.md) |
| [secret](secret.md) | `val secret: `[`NotNullFilter`](../../io.github.oleksivio.telegram.bot.api.annotations.filter.primitive/-not-null-filter/index.md) |
| [status](status.md) | `val status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md) |
| [validator](validator.md) | `val validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
