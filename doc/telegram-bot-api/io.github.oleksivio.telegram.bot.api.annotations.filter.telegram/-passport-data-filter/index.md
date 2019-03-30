[telegram-bot-api](../../index.md) / [io.github.oleksivio.telegram.bot.api.annotations.filter.composite](../index.md) / [PassportDataFilter](./index.md)

# PassportDataFilter

`@Target([AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER]) annotation class PassportDataFilter`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `PassportDataFilter(status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md)` = AnnotationState.ON, validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`> = [], encryptedPassportElements: `[`EncryptedPassportElementArrayFilter`](../-encrypted-passport-element-array-filter/index.md)` = EncryptedPassportElementArrayFilter(status = AnnotationState.OFF), encryptedCredentials: `[`EncryptedCredentialsFilter`](../-encrypted-credentials-filter/index.md)` = EncryptedCredentialsFilter(status = AnnotationState.OFF))` |

### Properties

| Name | Summary |
|---|---|
| [encryptedCredentials](encrypted-credentials.md) | `val encryptedCredentials: `[`EncryptedCredentialsFilter`](../-encrypted-credentials-filter/index.md) |
| [encryptedPassportElements](encrypted-passport-elements.md) | `val encryptedPassportElements: `[`EncryptedPassportElementArrayFilter`](../-encrypted-passport-element-array-filter/index.md) |
| [status](status.md) | `val status: `[`AnnotationState`](../../io.github.oleksivio.telegram.bot.api.model.annotation/-annotation-state/index.md) |
| [validator](validator.md) | `val validator: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
